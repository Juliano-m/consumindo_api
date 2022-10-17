## Consumindo API do IMDB

Neste projeto, eu realizo uma busca pelos melhores 250 filmes segundo o IMDB.

## Funcionamento

Você pode baixar os arquivos do projeto e importar para a sua IDE.
Quando for executado, como saída você terá uma lista ordenada por posição, dos 250 melhores filmes segundo o IMDB, com o título e a classificação.

![Terminal_VSC](https://user-images.githubusercontent.com/71046387/196253247-2ca4524c-8e17-4869-ab17-b6acd68a3b03.png)

## Desenvolvimento 

Inicialmente é criada uma conexão HTTP, onde fazemos uma requisição do tipo GET para a API do IMDB.
Que nos retorna como resposta, uma lista dos 250 melhores filmes, mas em um formato JSON que é um pouco estranho de ler.
Em seguida precisamos filtar esse JSON para retirar dele as informações com as quais desejamos trabalhar.
Por último, manipulamos e exibimos as informações de uma forma organizada e legível.

## Sobre

O código foi desenvolvido em Java na IDE Visual Studio Code.
Inicialmente trata-se de um projeto bem simples, mas com muitas possibilidades para futuras implementações.





