## 📌 Contextualizando o desenvolvimento web com Spring Boot 3 e kotlin 

Para o desenvolvimento de uma aplicação web, é importante utilizar ferramentas modernas e confiaveis para garantir a qualidade, desenvolvimento e manutenção do projeto.

#### 🔗 Percurso 

1. Entendendo a arquitetura Rest
2. Overview do spring framework
3. Arquitetura de tres camadas com spring boot

### 📌 Entendendo a arquitetura Rest

#### 🔗 O que é Uma API?

* API significa Application Programming Interface, ou seja, Interface de Programação de Aplicativos.
* No contexto de APIs, a palvra **APLICAÇÃO** refere-se a qualquer software com uma função distinta. 
* A **INTERFACE** de uma API é o meio pelo qual o software se comunica com outros programas.
* Esse contrato define como as duas se comunicam usando solicitações e respostas. 
* A documentação de suas respectivas APIs contém informações sobre como os desenvilvedores devem estruturar essas solicitações e respostas para que possam se comunicar com sucesso.

#### 🔗 Como as APIs funcionam?

* A arquitetura de uma API geralmente é explicada em termos de cliente servidor
* A aplicação que envia a solicitação é chamada de cliente e a aplicação que recebe a solicitação é chamada de servidor.

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1154479613137932308/image.png">

* APIs SOAP: Cliente e servidor trocam mensagens usando XML. Esta é uma API menos flexivel que era mais popular
* APIs rpc: O cliente conclui uma função (ou um procedimento) no servidor e o servidor envia a saída de volta para o cliente.
* APIs REST: O cliente envia uma solicitação ao servidor e o servidor envia uma resposta de volta ao cliente. As solicitações e respostas são formatadas usando JSON.
* APIs WebSocket: O servidor pode enviar mensagens de retorno de chama a clientes conectados, tornando-o mais eficiente que a API REST.

#### 🔗 O que é uma API REST?

* REST significa Representational State Transfer, ou Transferência de Estado Representacional.
* Clientes e servidores trocam dados usando HTTP.
* O http permite criar, atualizarm pesquisar, executar e remover operações, atuando sob determinados recursos. 
* A principal caracteristica da API REST é a ausencia de estado, ou seja, cada solicitação é independente das outras.

<img align=center src="https://media.discordapp.net/attachments/1098139264258158602/1154480588657533048/image.png?width=601&height=170">

#### 🔗 Modelos e status HTTP?

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1154480827619622952/image.png">

#### 🔗 O que é JSON?

* JSON é um formato de troca de dados entre sistemas independente de linguagem de programação, derivado do JavaScript.
* É frequentemente usado em aplicações Ajax, configurações, bancos de dados e serviços da web RESTful.

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1154481201076252683/image.png">


### 📌 Overview do Spring Framework


#### 🔗 O que é o Spring Framework?

* OSpring é um framework Java criado com o objetivo de facilitar o desenvolvimento de aplicações.

*Baseado na loC e DI, fornecendo para isso um container, que representa o núcleo do framework e que é responsável por criar e gerenciar os componentes da aplicação, os quais são comumente chamados de beans.

* Spring Boot é um framework Java open source ele traz mais agilidade para o processo de desenvolvimento, uma vez que devs conseguem reduzir o tempo gasto com as configurações iniciais. 

* O spring framework consiste em recursos organizado em cerca de 20 modulos. 

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1154481882348671017/image.png">

#### 🔗 Spring Boot starter

* Com o spring boot conseguimos abstrair e facilitar a configuração de, por exemplo: 
    * servidores;
    * Gerenciamento de dependencias;
    * Configuração de bibliotecas;
    * Métricas e health checks;
    * Testes;
    * Segurança;
    etc.

* Os starters são módulos que contém um conjunto de dependências relacionadas a um determinado recurso.

* Por exemplo, o spring-boot-starter-web contém as dependências necessárias para o desenvolvimento de aplicações web.

~~~json
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
}
~~~

#### 🔗 Spring Initializr

* Para facilitar a criação de aplicações utilizando outras IDEs o spring disponibiliza o spring initializr, que é um gerador de projetos.

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1154482704004415568/image.png">

### Arquitetura de tres camadas com spring boot

#### 🔗 O que é uma arquitetura de tres camadas?

* Arquitetura em tres camadas tem por objetivo promover a separação de funcionalidades usando camadas para a separação da logica de apresentação, logica de negócio e acesso a dados.

* A separação em tres camadas torna o sistema mais flexivel, permitindo quea s camadas sejam desenvolvidas e modificadas independentemente.

#### 🔗 Arquitetura projeto spring boot

* O spring boot segue uma arquitetura em tres camadas, onde cada camada é responsável por um conjunto de funcionalidades.

<img align=center src="https://media.discordapp.net/attachments/1098139264258158602/1154483358492004452/image.png?width=761&height=346">

#### 🔗 Arquivo de configuração

* Ao trabalhar com spring boot, nos depamamos com varias configurações que devem ser realizadas,

* O spring boot permite utilizar 2 diferentes tipos de arquivos de configurações: 
    * application.properties
    * application.yml

    <img align=center src="https://media.discordapp.net/attachments/1098139264258158602/1154483670636310528/image.png?width=978&height=283">