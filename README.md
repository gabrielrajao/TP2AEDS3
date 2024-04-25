# Trabalho Prático 2 de AEDS3!

Para esse trabalho, implementamos o código da lista invertida (feito em sala) no código do TP1 


# Métodos e Classes Criadas

**Classe ArquivoLivros:** Criamos essa classe para que tivessemos uma classe de arquivos não genérica, visto que o TP2 pede uma lista invertida de Livros

**Método Tamanho na classe Arquivo:** Adicionamos esse método para recuperar o último id do arquivo ( apenas para debug mesmo )

**Método Create na classe ArquivoLivros:** Neste método, criamos o objeto de livro no arquivo principal normalmente e, depois, criamos um índice para cada palavra do título do livro com base no id recebido pelo método create principal, para fazer isso, partimos o titulo em cada espaço, depois removemos pontos (tipo: ; : ! ? . , ) e utilizamos toLowerCase() para normalizar a palavra

**Método Update na classe ArquivoLivros:** Neste método, fazemos um update de um livro no arquivo principal normalmente, depois deletamos todos os indices da lista invertida que estavam associados ao título antigo e, por fim, adicionamos os indices do título novo do livro.

**Método Delete na classe ArquivoLivros:** Neste método, fazemos a deleção de um livro no arquivo principal normalmente e, depois, deletamos as palavras da listaInvertida associadas ao livro deletado uma por uma

**Método Limpar na classe ArquivoLivros:** Esse método é auxiliar para o Read, ele quebra uma string em todos os espaços (" "), resultando um array de strings, depois remove pontos (tipo: ; : ! ? . , ) e utiliza toLowerCase() para normalizar a palavra. Por fim, o método checa se foi existem stopwords no array e as remove.

**Método de União na classe ArquivoLivros:** Esse método é responsável por realizar a união descrita no método READ, se ele receber os conjuntos (2,3,5) e (1,3,5), vai retornar (3,5) 

**Método Read na classe ArquivoLivros:** Neste método, recebemos uma string por parametros e separamos elas nos espaços em branco e depois limpamos ela, isso nos retorna um array de strings, se o array de strings conter apenas uma palavra, nós simplesmente fazemos uma pesquisa pelos livros que contém essa palavra e retornamos isso. Se o array conter mais de uma palavra, fazemos a união do conjunto de livros que possui cada uma das palavras. **Exemplo:** 
|Palavra| Livros  |
|--|--|
| Dados | 1, 2, 4  |
| Algoritmo | 1, 3, 4  |

Fazemos a união dos dois conjuntos e temos os livros 1 e 4, se adicionarmos a palavra abaixo:
|Palavra| Livros  |
|--|--|
| Estrutura | 4  |


Fazemos a união do conjunto 1 e 4 com o conjunto de Estrutura, resultando no livro 4 apenas.

**Método getStopwords na classe ArquivoLivros:** Baixamos um dataset com inúmeras stopwords (em português) do site Kaggle (https://www.kaggle.com/datasets/heeraldedhia/stop-words-in-28-languages), a função getStopwords pega todas as Stopwords no arquivo baixado e coloca em um ArrayList

**Método DEBUG:** Um método que criamos para printar todos os registros no arquivo principal e na lista invertido, só para ter certeza que está tudo nos conformes


## Perguntas

**-   A inclusão de um livro acrescenta os termos do seu título à lista invertida?**
Sim, a inclusão de um livro cria um índice para cada termo no título na lista invertida

**-   A alteração de um livro modifica a lista invertida removendo ou acrescentando termos do título?**
Sim, nossa função de alteração remove todos os índices do título antigo e adiciona novas para o título novo (independentemente se mudou ou não)
**-   A remoção de um livro gera a remoção dos termos do seu título na lista invertida?** 
Sim, ao removemos um livro, todos os termo do título salvos na lista invertida são deletados também

**-   Há uma busca por palavras que retorna os livros que possuam essas palavras?**
Sim, o método read recebe uma string por parametros, pesquisa na lista invertida e retorna um arraylist de livros com os resultados
**-   Essa busca pode ser feita com mais de uma palavra?**
Sim, fazemos uniões consecutivas e só paramos caso acabem as palavras de pesquisa ou o conjunto esteja vazio (null)

**-   As _stop words_  foram removidas de todo o processo?**
Sim, Baixamos um dataset com inúmeras stopwords (em português) do site Kaggle (https://www.kaggle.com/datasets/heeraldedhia/stop-words-in-28-languages), para remover as stopwords, elas nunca são adicionadas à lista invertida (OBS.: Adicionamos o termo "é" que foi deixado de fora do database baixado)
**-   Que modificação, se alguma, você fez para além dos requisitos mínimos desta tarefa?**
Não fizemos grandes modificações para além dos requisitos da tarefa

**-   O trabalho está funcionando corretamente?**
Sim, conseguimos realizar todos nossos testes com sucesso

**-   O trabalho está completo?**
Sim, concluímos todos os requisitos pedidos pelo trabalho

**-   O trabalho é original e não a cópia de um trabalho de um colega?**
Tanto o trabalho do TP1 utilizado, quanto as adições para os requisitos do TP2 foram feitas por nós com os materiais disponibilizados após as aulas
