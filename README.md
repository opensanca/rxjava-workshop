![RX Java](https://avatars3.githubusercontent.com/u/6407041?v=3&s=200)

# Workshop RX Java com [Ubiratan Soares](https://github.com/ubiratansoares)

  Para quem desconhece sobre Java Reativo, segue o link da palestra que o Ubiratan ministrou no [QCON 2016](http://qconsp.com/system/files/presentation-slides/programacao_reativa_funcional_com_rxjava.pdf) 

**Carga horária:** 08hrs
**Data:** 16/07

 **O que as pessoas irão ver nesse workshop?**  
  Nesse workshop as pessoal terão conceitos de programação reativa funcional, com base na API RxJava. Veremos como essa API ajuda a resolver problemas como processamento assíncrono e concorrente, de forma combinada, transformável e com ótimo tratamento de erros, em exemplos reais (consumindo uma API Rest). 

  **É necessário algum pré-requisito para o workshop?** 
  Esse workshop assume que a pessoa tenha pelo menos uns 2 anos de programação e fluência em Java, bem como entende os fundamentos de REST APIs, para que o workshop seja eficaz recomendo também que instale a IDE Intellij IDEA 16 + JDK8. 

#### Tools
 - [Intellij Idea 16](https://www.jetbrains.com/idea/download/)
 - [JDK 8 u91](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
 
**Para quem não possui licença do Intellij Idea:**
- a) Instale a versão Ultimate no modo Trial que irá lhe conceder direito de uso por 30 dias que é o necessário para o workshop.
- b) Instale a versão Ultimate no modo Students, você pode tirar foto da sua carteirinha e enviar para eles que eles irão dar
um licença por 12 meses para você, pode mandar foto de carteirinha do ano anterior que funciona também, segue o [link](https://www.jetbrains.com/idea/buy/#edition=discounts).
- b1) Se você possuir um e-mail com o dominio da universidade, basta colocar lá no formulário que chega dentro de 1 hora a licença no seu e-mail. 
- c) Durante a trilha tem alguns amiguinhos "manolos" que podem lhe passar formas "alternativas" de como ter a licença. 

#### EMENTA

##### Básico de Observables e Observers
-  Exercício 01 : Criar Observables com just( ) (consumir com Action)
-  Exercício 02 : Criar Observables com from( ) (consumir com Action)
-  Exercício 03 : Criar Observables com fromCallable( ) (consumir com Observer)
-  Exercício 04 : Criar Observables com factory method (Range)

#####  Operadores e Marble Diagrams
-  Exercício 05 : map( )
-  Exercício 06 : filter( )
-  Exercício 07 : reduce( )
-  Exercício 08 : collect( )
-  Exercício 09 : amb( )
-  Exercício 10 : take( )
-  Exercício 11 : concat( )
-  Exercício 12 : merge( )
-  Exercício 13 : flatmap( )

#####  Schedulers
-  Exercício 14 : subscribeOn()
-  Exercício 15 : subscribeOn() + observeOn()
-  Exercício 16 : operador interval( )

#####  STAR WARS REST API
-  Exercício 16 : consumir a primeira página da lista de personagens
-  Exercício 17 : para um dado personagem aleatório, encontrar os filmes onde ele atua
-  Exercício 18 : para um dado filme aleatório, encontrar os personagens que dele participam

### License:
