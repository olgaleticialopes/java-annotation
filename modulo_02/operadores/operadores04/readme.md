#### Ternários

O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.<br>
O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:

~~~~java
<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
~~~~

**Exemplo:**

~~~~java	
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(valor);
~~~~

* O operador ternário é aplicado para qualquer tipo de valor.
* O operador ternário pode ser utilizado para atribuir um valor a uma variável ou para imprimir um valor na tela.



