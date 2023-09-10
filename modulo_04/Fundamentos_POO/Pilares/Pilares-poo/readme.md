<div align=center>

## Pilares da Programação Orientada a Objetos

</div>
Programação orientada a objetos(POO, ou OPP segundo as siglas em ingles), é um paradigma de programação baseado no conceito de objetos, que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

Como se trata de, um contexto análogo a mundo real, tudo na qual nos referimos são objetos, por exemplo, um carro, uma casa, uma pessoa, um animal, etc. Todos esses objetos possuem características e comportamentos, que são chamados de atributos e métodos, respectivamente.

A programação orientada a objetos, é bem requisitada no contexto das aplicações mais atuais no mercado, devido a possibilidade de reutilização de código e a capacidade de representação do sistema , ser muito mais proximo do mundo real. 

Para a linguagem ser considerada orientada a objetos, ela deve possuir os seguintes pilares:

- **Encapsumamento**: Nem tudo precisa estar visivel para o mundo externo, ou seja, nem tudo precisa ser publico. A ideia é que o objeto possua uma interface de comunicação com o mundo externo, e que o mundo externo não precise saber como o objeto funciona internamente.

- **Herança**: Caracteristica que permite que uma classe herde atributos e métodos de outra classe. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse.

- **Polimorfismo**: Caracteristica que permite que um objeto possua mais de uma forma. Por exemplo, um objeto do tipo cachorro, pode ser um cachorro, mas também pode ser um animal, ou seja, ele pode assumir mais de uma forma.

- **Abstração**: É a indisponibilidade, para determinar a lógica de um ou vários comportamentos, em um objeto. Por exemplo, um objeto do tipo cachorro, não precisa saber como ele anda, ele só precisa saber que ele anda.

Para ilustrar a proposta dos principios de POO, vamos usar alguns exemplos do nosso cotidiano: 

**MSN Messenger** foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu a 22 de julho de 1999, anunciando-se como um serviço que, permitia falar com uma pessoa através de conversas instantâneas pela internet. Ao longo dos anos, surgiram novos serviços de mensagens pela internet, como **Facebook Messenger** e o **VKontakte Telegram**.

<div align=center>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-508b916c86e4fe676b8a4dafcb843e8bb0db44f8%2Fimage%20(8)%20(1)%20(1).png?alt=media">
</div>

Vamos descrever em UML e depois em código, como seria a implementação de um sistema de mensagens instantâneas, usando os pilares da POO.

### UML
<div align=center>
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-32e4d75933544ea1ebd7027be1038c7891b95e36%2Fimage%20(14).png?alt=media">
</div>

### Código
~~~~java
public class MSNMessenger {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	public void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
~~~~