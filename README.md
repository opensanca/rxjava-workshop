![RX Java](https://avatars3.githubusercontent.com/u/6407041?v=3&s=200)

# Workshop de RxJava com [Ubiratan Soares](https://github.com/ubiratansoares)

  Para quem desconhece sobre programação reativa em Java, segue o link dos [slides](https://speakerdeck.com/ubiratansoares/rxjava-for-android). Esse workshop deriva de uma palestra que foi ministrada em diversos eventos de tecnologia ao longo do primeiro semestre de 2016, dentre eles **QCONSP**, **JavaOne**, **GDGSP Android Meetup** e **The Developers Conference**.

**Carga horária:** 08hrs
**Data:** 16/07

## O que as pessoas irão ver nesse workshop?  
 
  Nesse workshop os participantes terão conceitos de programação reativa funcional, com base na API RxJava. Veremos como esse framework ajuda a resolver problemas como processamento assíncrono e concorrente, de forma combinada, transformável e com ótimo tratamento de erros, com semântica enviesadamente baseada em programaçào funcional, incluindo exemplos reais (consumindo uma API REST). 

## É necessário algum pré-requisito para o workshop??  

  Esse workshop assume que a pessoa tenha pelo menos 2 anos de programação e fluência em Java, bem como entenda os fundamentos de REST APIs. 

## Setup and Tools

 - [Intellij Idea 16 -  Versão Community* ou Ultimate** ](https://www.jetbrains.com/idea/download/)
 - [JDK 8 u91](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
 
**Para quem não possui o Intellij Idea:**
- Instale a versão Community que irá dar 100% conta do recado durante o workshop.
- Ou instale a versão Ultimate no modo Trial que irá lhe conceder direito de uso por 30 dias.
- Ou instale a versão Ultimate no modo Students, você pode tirar foto da sua carteirinha e enviar para eles que eles irão dar
um licença por 12 meses para você, pode mandar foto de carteirinha do ano anterior que funciona também, segue o [link](https://www.jetbrains.com/idea/buy/#edition=discounts).

_** Se você possuir um e-mail com o dominio da universidade, basta colocar lá no formulário que chega dentro de 1 hora a licença no seu e-mail._

## Contéudo Prático

##### Básico de Observables e Observers
-  Exercício 01 : Criar Observables com **just( )** e consumir com **Action1**
-  Exercício 02 : Criar Observables com **from( )** e consumir com **Observer**
-  Exercício 03 : Criar Observables com **fromCallable( )** e consumir com **Actions**
-  Exercício 04 : Criar Observables com _factory methods_, como por exemplo **range( )**

#####  Operadores e Marble Diagrams

-  Exercício 05 : **map( )**
-  Exercício 06 : **filter( )**
-  Exercício 07 : **reduce( )**
-  Exercício 08 : **collect( )**
-  Exercício 09 : **concat( )**
-  Exercício 10 : **flatmap( )**
-  Exercício 11 : **groupBy( )**

#####  Schedulers
-  Exercício 12 : Entendendo **subscribeOn( )**
-  Exercício 13 : Entendendo **observeOn( )**
-  Exercício 14 : Entendendo  **Schedulers** com _factory methods_
-  Exercício 15 : Vendo **merge( )** na prática

#####  STAR WARS REST API
-  Exercício 16 : consumir a primeira página da lista de personagens
-  Exercício 17 : para um dado personagem aleatório, encontrar os filmes onde ele atua
-  Exercício 18 : para um dado filme aleatório, encontrar os personagens que dele participam


# License

```
Copyright (C) 2016 Open Sanca

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
