## 📌 Pacotes

A linguagem Java, é composta por milhares de classes, com as finalidades de por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios, conexão com banco de dados, entre outras.<br>
Para prevenir este acontecimento, a linguagem dispõe de um recurso, que organiza as classes padrões criadas por nós, que conhecemos como pacote (package). Os pacotes são subdiretórios, a partir da pasta src do nosso projeto, onde estão localizadas, as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizadas no mercado.

**Exemplo:**<br>
<img src= "https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-85650fe21efc214012ba8e0ef7d5374464f2fe59%2Fimage%20(18)%20(1).png?alt=media">

### 🔗 Nomenclatura de pacotes

Vamos imaginar, que sua empresa se chama Power Soft e ela está desenvolvendo software comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:<br>
* Comercial : com.powersoft;
* Governamental : gov.powersoft;
* Código aberto: org.powersoft.

<br>
Bem, acima já podemos perceber que existe uma definição, para o uso do nome dos pacotes, porém, podemos organizar ainda mais um pouco as nossas classes, mediante a proposta de sua existência:
<br>
<br>

* Model : Classes que representam a camada e modelo da aplicação ;  Cliente, Pedido, NotaFiscal, Usuario;<p>
* Repository: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository;<p>
* service: Classes que contém regras de negócio do sistema : ClienteService possui o método validar o CPF, do cliente cadastrado;<p>
* Controller: Classes que possuem a finalidade de, disponibilizar os nossos recursos da aplicação, para outras aplicações via padrão HTTP;<p>
* View: Classes que possuem alguma interação, com a interface gráfica acessada pelo usuário;<p>
* Util: Pacote que contém, classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil.<p>

### 🔗 Identificando o pacote de uma classe

Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples *(próprio nome)* e agora o nome qualificado *(endereçamento do pacote + nome)*, exemplo: Considere a classe Usuario, que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é *com.controle.acesso.model.Usuario*.

### 🔗 Package versus import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém, uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

~~~java	
package
import ... 
import ...

public class MinhaClasse {
}
~~~

### 🔗 Por que é tão importante compreender de pacotes?

A linguagem Java, é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.
É nesta hora, que nós desenvolvedores precisamos detectar, qual classe iremos importar em nosso projeto.
Um exemplo clássico é, a existência das classes *java.sql.Date* e *java.util.Date* da própria linguagem, recomendo você leitor, pesquisar sobre a diferença das duas classes.