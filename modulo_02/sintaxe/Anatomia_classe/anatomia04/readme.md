
### 📌 Anatomia de classes 04:

### 🔗 Indentação (indentation)

Basicamente indentar é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.<br>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-72b20a7c3db3d32c63ec3fd99883c9bd021e9e32%2Fimage%20(5)%20(1)%20(1)%20(1)%20(1).png?alt=media"></img><br>
Abaixo, veja um exemplo de um algoritmo de validação, de aprovação de estudante. Em uma aba, temos um código sem indentação nenhuma, e na outra aba, temos o mesmo código, seguindo um padrão de indentação. Observe como é muito mais fácil entender a hierarquia do código na segunda aba.<br>

* Sem indentação: 
~~~~java 
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
~~~~

* Com indentação: 

~~~~java
public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
~~~~