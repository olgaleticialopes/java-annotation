<div align=center>

## Polimorfismo

</div>

Podemos observar no contexto de Abstração e Herança, que conseguimos criar uma singularidade estrutural de nossos elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta estender a classe **ServicoMensagemInstantanea** e implementar, os respectivos métodos abstratos. O que vale reforçar aqui é, cada classe terá a mesma ação, executando procedimentos de maneira especializada.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-346b134698ce593ffb76f72333bc79bfa04e6199%2Fimage%20(9).png?alt=media">

Esse é o resultado do que denominamos como, Polimorfismo. 

Exemplo: 

~~~java
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
~~~

* Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas, determinem ações uniformes, para que cada classe filha concreta, implemente os comportamentos de forma específica.

### Modificador protected 

Vamos para uma retrospectiva, quanto ao requisito do nosso sistema de mensagens, desde a etapa de encapsumamento. 

O nosso requisito, solicita que alem de enviar e receber mensagens, precisamos validar se o aplicativo esta conectado a internet, (validarConectadoInternet) e salvar o historico de casa mensagem (salvarHistoricoMensagem).

Sabemos que cada aplicativo, costuma salvar as mensagens em seus respectivos servidores, e para isso, precisamos de um método que faça essa ação. Não poderia ser um mecanismo comum para todos? logo qualquer classe filha, de ServicoMensagemInstantanea poderia desfrutar atravez de herança, essa funcionalidade 

**Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador **private**somente a classe conhece a implementação, quanto que o modificador **public**todos passarão a conhecer. Mas gostaríamos que, somente as classes filhas soubessem. Bem, é ai que entra o modificador protected.java**

~~~java
public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
~~~