#### 📌 Lógicos 

Os operadores lógicos, representam o recurso que nos permite criar expressões lógicas maiores, a partir da junção de duas ou mais expressões.

* && Operador Lógico "E"
* || Operador Lógico "OU"

~~~~java
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
~~~~

#### 🔗 Expressões lógicas avançadas

Nós acabamos de aprender que existem os operadores lógicos "&"(E) e "||" (OU), mas por que no exemplo acima, foram ilustradas as condições:

* if (condicao1 && condicao2) e if(condicao1 || condicao2) ? <br>

A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado, isso quer dizer que, se a condição1 atender aos critérios, não será necessário validar a condição2. <br>

~~~~java
// ComparacaoAvancada.java
int numero1 = 1;
int numero2 = 1;

if(numero1== 2 & numero2 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero1);
System.out.println("O numero 2 agora é " + numero2);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
~~~~

* O mesmo acontece com o operador | e || , considerando que operador, agora representa que se uma das alternativas for verdadeira, a outra nem precisa ser avaliada.

