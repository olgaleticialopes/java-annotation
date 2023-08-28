## 📌 Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE, já pensou, nossos clientes tendo que instalar o Eclipse ou VsCode para rodar o sistema em sua empresa ?
Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.
No nosso caso, iremos aprender como executar um programa Java via terminal, como MS - DOS ou terminal do VsCode.
Vamos criar uma classe chamada MinhaClasse.java com o código abaixo:<br>

~~~java	
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    }
}
~~~

* Observe que nosso projeto Java criado por uma IDE, terá uma pasta chamada bin. É nesta pasta que ficarão os arquivos .class, o nosso bytecode.

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b0a0e8dfb7fae04ab09b41daf0d22ac472dcd318%2Fimage%20(15)%20(1).png?alt=media"> <br>

Mesmo usando uma IDE, nós sempre precisaremos identificar aonde se encontram as classes do nosso projeto, no meu caso está em: C:\estudos\dio-trilha-java-basico\java-terminal. <br>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-134a5c7508ca0d898df7205309157802da074147%2Fimage%20(6)%20(1)%20(1).png?alt=media">

## 🔗 Terminal

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.<br>

1. Abra o MS-DOS ou Power Shell;
2. Localize o diretório do seu projeto: cd C:\estudos\dio-trilha-java-basico\java-terminal;
3. Acesse a pasta **** bin: ** cd bin**;
4. Agora digite o comando:**java MinhaClasse ** (nome da sua classe sem a extensão .class).

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-178df39af2221a5577f56bcc1310fff651679ffe%2Fimage%20(14)%20(1).png?alt=media">



