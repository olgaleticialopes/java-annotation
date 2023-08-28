## 📌 Argumentos

Quando executamos uma classe, que contenha o método main, o mesmo permite que passemos um array [] de argumentos, do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros, exemplo:

~~~java
java MinhaClasse agumentoUm argumentoDois
~~~

**Exemplo**

~~~java	
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
~~~	

#### Passando valores aos argumentos pelo VsCode:

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-367c383ec177ee8764f64e4478712804fa3695d1%2Fimage%20(12).png?alt=media"> <br>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-7a081a7d3d01e785465dab2d36a15c36c4ccc3cf%2Fimage%20(8)%20(1)%20(1)%20(1).png?alt=media"><br>

~~~~json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "request": "launch",
            "mainClass": "AboutMe",
            "args": ["GLEYSON", "SAMPAIO", "28", "1.58"]
        }
    ]
}
~~~~

* Executando o programa agora no terminal:
~~~java	
cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin

java AboutMe GLEYSON SAMPAIO 28 1.58
~~~	

## 📌 Scanner

Nos exemplos anteriores, percebemos que podemos receber, dados digitados pelo usuário do nosso sistema, porém, tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução, com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras, agora vamos receber estes dados via Scanner.<br>
A classe Scanner, permite que o usuário tenha, uma interação mais assertiva com o nosso programa, veja como vamos mudar o nosso programa AboutMe para deixar mais intuitivo aos usuários:<br>

~~~java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        
    }
}
~~~
