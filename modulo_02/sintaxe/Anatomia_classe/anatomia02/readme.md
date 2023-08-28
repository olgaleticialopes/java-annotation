
### 📌 Anatomia de classes 02:

## 🔗 Padrão de nomenclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. <br>Esses padrões estão expressos nos itens abaixo:

* Arquivo .java: Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:
Calculadora.java, CalculadoraCientifica.java
* Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java, exemplo:

~~~~java 
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
~~~~

## 🔗 Variaveis

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

