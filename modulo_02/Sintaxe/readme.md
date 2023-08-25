# 📓  Aula 1: Sintaxe Java.

# 🔗 Pré requisitos

* JDK instalado
* IDE escolhida
* Diretorio do projeto definido


<br>

# 📌 Anatomia da classe

<h3>O que é: </h3> 

Consolidar todo o aspecto estrutural, Como: 

* Estrutura inicial 
* Padrao de nomenclatura 
* Declarando viraveis e metodos 
* Identação 
* Organização de arquivos
* Java bens

### 📌 Anatomia das classes 01: 

"Uma classe bem estruturada não quer guerra com ninguem"

A escrita de códigos de um programa é feita através da composição de, palavras pré-definidas pela linguagem<br> 
com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.<br>
É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário.

## Sintaxe de declaração de uma nova classe:

~~~~java
public class Exemplo{
    //codigo aqui
}
~~~~

* 99,9% das nossas classes iniciarão com public class;
* Toda classe precisa de nome, exemplo MinhaClasse;
* O nome do arquivo deve ser idêntico ao nome da classe pública;
* Após o nome, definir o corpo { } , onde iremos compor nossas classes com atributos e métodos
* Se o arquivo for executavel ele precisa ter um **MAIN**

~~~~java
public class Exemplo{
    //corpo da classe
     public static void main (String [] args){
        //corpo do metodo main
     }
}
~~~~

### 📌 Anatomia de classes 02:

## Padrão de nomenclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. <br>Esses padrões estão expressos nos itens abaixo:

* Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:
Calculadora.java, CalculadoraCientifica.java
* Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

~~~~java 
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
~~~~

## Variaveis

### Nomeando variaveis

* Nome de variável: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo:<br>
 ano e anoFabricacao.<br> O nome dessa prática para nomear variáveis dessa forma se chama "camelCase"

 ~~~~java
 String BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000
~~~~

* Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9;
* Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
* Deve iniciar com uma letra minúscula (boa prática – ver abaixo);
* Não pode conter espaços;
* Não podemos usar palavras-chave da linguagem;
* O nome deve ser único dentro de um escopo
* Final = recebe um unico valor e não pode ser alterado

~~~~java 
// Declação inválida de variáveis

int numero&um = 1; //Os únicos símbolos permitidos são _ e $
int 1numero = 1;    //Uma variável não pode começar com númerico
int numero um = 1; //Não pode ter espaço no nome da variável
int long = 1; //long faz parte das palavras reservadas da linguagem
 
 // Declaração válida de veriáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
~~~~

### Declarando variaveis e metodos

Como identificar a diferença entre, declaração de variáveis e métodos em nossa programa? Existe uma estrutura comum para ambas as finalidades, exemplo:

* Declarar uma variável em Java segue sempre a seguinte estrutura:

~~~~java
// Estrutura

Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; //observe que aqui a variável spike não tem valor, é normal
~~~~

* Declarar métodos em Java segue uma estrutura bem simples:

~~~~java 
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

//Exemplo

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
~~~~





  












  

