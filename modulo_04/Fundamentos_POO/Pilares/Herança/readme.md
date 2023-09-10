<div align=center>

## Herança

</div>

Já pensou voce ter sido classificado para a vaga de emprego de sesus onhos e como desafio, seria justamente criar um diagrama de classes e em seguinda os respectivos arquivos .java, que apresentassem os fundamentos de POO, com base no contexto de varios aplicativos de mensagens? 

* Com base na nossa classe MsnMessenger, você ja poderia dar os primeiros passos para se dar bem no processo seletivo, simplismente, copiar e colar a estrutura, para as novas classes FacebookMessenger, Telegram e BINGO! Você ja teria o seu primeiro desafio concluido.

Exemplo: 

### UML

<div align=center>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b73f132940fddf924da1ae4e74f0fc40071dbfb8%2Fimage%20(19).png?alt=media">
</div>

* Porem a imagem acima não seria a melhor alternativa para a proposta citada acima, 

Alem de uma compreensão do desafio, é necessario que, tenhamos dominio dos pilares de POO e aplicalos em situações iguais a esta. 

* Todas as tres classes, possuem a mesma estrutura comportamental e diante deste contexto, se encaixa perfeitamente o segundo pilar da POO, a Herança.

<div align=center>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-fd6c7fe52a162033db9766e99c07ec7735df2ebe%2Fimage%20(11)%20(1)%20(1)%20(1).png?alt=media">
</div>

Exemplos: 

## ServicoPai

```java
//a classe MSNMessenger é ou representa
public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
```

## MSN 

```java
public class MSNMessenger extends ServicoMensagemInstantanea{

}
```

### Facebook 

```java
public class FacebookMessenger extends ServicoMensagemInstantanea {

}
```

### Telegram 

```java
public class Telegram extends ServicoMensagemInstantanea {

}   
```

###  ComputadorUsuario
    
```java
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
```

Podemos avaliar a importancia de compreender os pilares de POO, para ter uma melhor implementação, reeaproveitamento e reutilização de codigo, em qualquer contexto das nossas aplicações, mas não para por ai.

* Será que todos os sistemas de mensagens, realizam as suas operações de uma mesma maneira? e agora ? este é um trabalho para os pilares Abstração e Polimorfismo.