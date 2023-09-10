<div align=center>

## Encapsumalento

</div>

Encapsulamento é um dos pilares da programação orientada a objetos, que consiste em esconder os detalhes de implementação de um objeto, expondo apenas os métodos de interação com o mesmo. A ideia é que o objeto possua uma interface de comunicação com o mundo externo, e que o mundo externo não precise saber como o objeto funciona internamente.

Exemplo:

### UML

<div align=center>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-bf51fc5a4c202546ec3574493a5dcda45abb744f%2Fimage%20(8)%20(1).png?alt=media">
</div>

### Antes

~~~~java
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.validarConectadoInternet();
		msn.enviarMensagem();
		msn.salvarHistoricoMensagem();
		
		msn.receberMensagem();
	}
}
~~~~

### MSNMessenger.java

~~~~java
public class MSNMessenger {
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
~~~~

### Depois

~~~~java
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}
~~~~
