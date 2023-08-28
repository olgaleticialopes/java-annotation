## 📌 Tipos e variaveis: 

### 🔗  tipos de dados

No Java, existem algumas palavras reservadas, para a representação dos tipos de dados básicos, que precisam ser manipulados, para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

#### Os oito tipos primitivos em java são:

* int 
* byteshort
* long,
* double,
* boolean 
* char <br>
– esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)


### 🔗 Tabela de tipos primitivos e seus valores: 

<img align="center" src="https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/variaveis-primitivas-controle-fluxo/tamanho_tipos.png">

 Apesar de o tipo float, ocupar metade da memória consumida do que um tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.<br>
 Da mesma forma, dificilmente utilizaremos o tipo long, pois não é tão comum trabalharmos com valores tão grandes.<br>
 Portanto, para representar números, na grande maioria das vezes, utilizaremos o tipo int , para representar números inteiros ou double para representar números fracionados.<br>
 O ponto mais relevante, em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou o salário de um funcionário?

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-45cf1c19139f51eeb485f95015a9f58e1cfac0e5%2Fimage%20(10)%20(1)%20(1).png?alt=media">



### 🔗 Declaração de Variáveis

Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.<br>
A estrutura padrão para se declarar uma variável sempre é:<br>

~~~~java
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
~~~~
<br><span> Exemplos: </span><br>

~~~~java
int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
~~~~

**Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:**

~~~~java 
public class TipoDados {
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;
	}
}
~~~~

* Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.
<p>Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação. Mas, cuidado!<p>

**Java é fortemente "tipado".**

~~~~java 
// TiposEVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
~~~~

Por mais que tenhamos ciência do valor quenumeroNormal cabe é um short, o Java não permite correr o risco.












