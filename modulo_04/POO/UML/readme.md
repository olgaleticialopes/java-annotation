## UML 

Linguagem de modelagem unificada ou UML é uma notação que possibilita a representação grafica de um projeto. 
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-5eb6e70c393e53ddafe8c4bb38fb8360daa53aab%2Fimage%20(17)%20(1).png?alt=media" aling=center>

Na UML, temos tres conceitos principais:

* Diagramas 
* Elementos
* Relacionamentos

### Diagramas 

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-7df9488f40343c429c8714631d9dbc19668f4043%2Fimage%20(7)%20(1)%20(2).png?alt=media">

#### Diagramas estruturais 

* Diagrama de classes: É usado para a representação de estrututas de classes de negócio. intercalando atributos e outros componentes do sistema. Por esta caracteristica, é o diagrama mais utilizado na UML.

* Diagrama de objetos: É usado para a representação de instancias de classes, ou seja, objetos.
Assim conseguimos ter uma respesentação mais detalhada de como os objetos se relacionam.

**Existem outras categorias extrutirais e comportamentais porem não serão abordadas neste curso.**

#### Diagrama de classes

O diagrama de classes, ilustra **graficamente** como classes serão estruturadas e interligadas entre si, diante da proposta do nosso software.<br>

Em diagrama, a estrutura das classes é construida por:

**Identificação**: Nome da classe e/ou finalidade da classe.<br>
**Atributos**: Caracteristicas da classe.<br>
**Operações** Ações ou metodos. 

#### Relacionamentos

Em um diagrama, as classes podem existir de forma independente, mas obviamente, um sistema não é composto por classes isoladas, logo, é necessário que exista uma forma de relacionar as classes entre si.

#### Associação 

Uma associaçõa é um relacionamento entre classes, onde uma classe necessita da outra para existir.

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-5681df722d3bbe15cca7d948c3ec9f0842e5a2a6%2Fimage%20(7)%20(1).png?alt=media" align=center>

* Agregação: Em uma agregação a classe principal contem uma relação com outra classe, mas ela pode existir, sem a classe agregadora. Imagine um cadastro de candidados, podemos encontrar candidatos que ainda não possuam uma profissão: 

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-f87b64ba00e44eac19debada84b5ef08c56b7e7e%2Fimage%20(10)%20(1).png?alt=media" align=center>


#### Multiplicidade

Nem sempre um relacionamento entre classes, sera de um para um. Podemos ter um relacionamento de um para muitos, muitos para muitos, etc. Como por exemplo: 

* 1. -> Representa uma associação, contendo um elemento;
* *. -> Representa uma associação, contendo uma lista de elementos;
* 0..1 -> Representa uma associação, contendo zero ou um elemento;
* 0..* -> Representa uma associação, contendo zero ou uma lista de elementos;
* 1..* -> Representa uma associação. contendo um ou uma lista de elementos.

#### Visibilidade

Os atributos e metodos de uma classe, podem receber niveis de visibilidade, que determinam se o mesmo pode ser acessado por outras classes ou não.

* (+) Publico: Pode ser acessado por qualquer classe;
* (#) Protegido: Pode ser acessado somente pela classe e suas subclasses;
* (-) Privado: Pode ser acessado somente pela classe.

Representação de uma classe com atributos e metodos:

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b38fcec2347903449b3e5c98b2986f6f3cb96f4f%2Fimage%20(6).png?alt=media" align=center>