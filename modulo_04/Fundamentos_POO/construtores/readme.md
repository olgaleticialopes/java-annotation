## Construtores 

Sabemos que, para criar um objeto na linguagem java, utilizamos a seguinte sintaxe:

```java
Classe objeto = new Classe();
```

Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.
Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.
    
  ```java

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
```
Vamos crias agora, os metodos faltantes, para que a classe possa ser utilizada. 

```java

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;

    public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
    Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
    }
    }



