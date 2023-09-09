<div align=center>

## Abstração

</div>

Sabemos que qualquer sistemas de mensagens realiza as mesmas operações de enviar e receber mensagens, dentre outras operações comuns ou exclusivas de casa aplicativo 
Vale destacar para compreender, é que todo e qualquer sistema de mensagem precisa sim no minimo enviar e receber mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado 

Observem a nova estrutura dos codigos abaixo com base na implementação dos pilares de POO, Herança. 

exemplos: 

### ServicoPai 

```java
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}   
```

### MSN 

```java
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
```

### Facebook 

```java
public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
```

### Telegram 

```java
public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}

```

* Em java, o conceito de abstração é representado pela palavra reservada **abstract** e metodos que NÃO possuem corpo na classe abstrata. 
