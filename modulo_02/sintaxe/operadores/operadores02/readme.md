## 📌 Operadores

Símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-44d5e9223bab5f5466d577812ffc1cd8d7ede3b6%2Fimage%20(12)%20(1)%20(1)%20(1).png?alt=media">

### 🔗 Classificação do operadores

#### Atribuição

Representado pelo símbolo de igualdade "=". <br>
O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. em Java, definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo:

~~~~java
//classe Operadores.java
String nome = "GLEYSON";
int idade = 22;
double peso = 68.5;
char sexo = 'M';
boolean doadorOrgao = false;
Date dataNascimento = new Date();
~~~~

#### Aritméticos

O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.<br>
Os operadores aritméticos são:<br>
 * + (adição)
 * - (subtração)
 *  * (multiplicação) 
 * / (divisão).

 ~~~~java
 //classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20/4);
~~~~

**ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.**

~~~~java	
//classe Operadores.java
String nomeCompleto = "LINGUAGEM" + "JAVA";
		
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1";

concatenacao = 1+"1"+1+1;

concatenacao = 1+"1"+1+"1";

concatenacao = "1"+1+1+1;

concatenacao = "1"+(1+1+1);
~~~~   


