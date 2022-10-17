import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

import service.JsonParser;

public class App {
    public static void main(String[] args) throws Exception {

    //Fazer uma conexão HTTP e obter os top 250 no IMDB
    String url = "https://imdb-api.com/en/API/Top250Movies/k_l9wdlzl6";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url)).GET().build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    String body = response.body();

    //Filtrar dados de interesse: Posição, título e classificação
    JsonParser parser = new JsonParser();
    List<Map<String, String>> listaDeFilmes = parser.parse(body);

    //Manipular e exibir os dados
    System.out.println("\u001b[1m" + "Total de filmes: " + "\u001b[m" + listaDeFilmes.size());
    System.out.println();

        for (Map<String, String> filme : listaDeFilmes) {
            System.out.println(filme.get("rank")
            + " - " + "\u001b[1m"+ filme.get("title")+"\u001b[m" );
            System.out.println("\u001b[45mClassificação:\u001b[m" + " " 
            + filme.get("imDbRating"));
        }

    }

}
