# Guia para os exercícios

### Exercício 01
O objetivo desse exercício é aprender o método mais simples de se criar e consumir uma sequência observável, bem como práticas as construções oferecidas pela linguagem Java para se trabalhar com programação reativa. 

Para isso, crie um Observable atrás do _factory method_ **just( )** e consuma o mesmo imprimindo os itens emitidos no console com uma **Action**.

### Exercício 02
O objetivo desse exercício é verificar outra forma de criação de obseráveis, desse vez com o _factory method_ **fromCallable( )**. Siga de forma similar ao exercício anterior.

### Exercício 03
Nesse exerício, nós aprendemos mais sobre **Observers** e como consumir os eventos terminais de uma sequência também com **Actions**

Para isso, no método **consumeWithObservers**, consuma a sequência passando uma instântica de Observer para o método **subscribe( )**. Já no método **consumeWithActions**, verifique como a sintaxe fica mais limpa ao se utilizar três **Actions** separadas ao invés de um único Observer como _callback_.

### Exercício 04

O objetivo desse exerício é demonstrar que existem diversos _factory methods_ que criam sequências observáveis com comportamento pré-definido. Nesse caso, tomaremos como exemplo **range( )**.

### Exercício 05

[Link](http://reactivex.io/documentation/operators/map.html) para o _Marble Diagram_ do operador **map( )**.

### Exercício 06

[Link](http://reactivex.io/documentation/operators/filter.html) para o _Marble Diagram_ do operador **filter( )**.

### Exercício 07

[Link](http://reactivex.io/documentation/operators/reduce.html) para o _Marble Diagram_ do operador **reduce( )**.

### Exercício 08

O operador **collect( )** é uma variante de **reduce( )**. O objetivo aqui é entender as diferenças entre esses dois operadores.

### Exercício 09

[Link](http://reactivex.io/documentation/operators/concat.html) para o _Marble Diagram_ do operador **concat( )**.

### Exercício 10

[Link](http://reactivex.io/documentation/operators/flatMap.html) para o _Marble Diagram_ do operador **flatMap( )**.

### Exercício 11

[Link](http://reactivex.io/documentation/operators/groupby.html) para o _Marble Diagram_ do operador **groupBy( )**.

### Exercícios 12 e 13

O objetivo aqui é entender como RxJava lida com processamento concorrente, em particular do ponto de vista sobre em que momento se deseja aplicar o paralelismo.

### Exercício 14

O objetivo desse exercício é verificar que alguns _factory methods_ que retornam sequências pré-definidas ou mesmo alguns operadores associam um novo **Scheduler** à sequência. Isso é particularmente verdade para operações que lidam com tempo.

### Exercício 15

De posso dos conhecimento de **Schedulers**, vamos verificar o comportamento do operadores **merge( )** para sequências que emitem itens em intervalos aleatórios no tempo.

### Exercícios 16, 17 e 18

Nesses exercícios, nós iremos consumir uma REST API com o framework Retrofit. Esse framework oferece uma maneira muito simples de se consumir REST em Java, e em particular, ele é capaz de adaptar o consumo de uma chamada HTTP assíncrona no formato de um Observable.
