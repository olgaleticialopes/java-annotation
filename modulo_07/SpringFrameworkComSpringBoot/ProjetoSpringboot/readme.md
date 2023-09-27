## 📌 SpringBoot SpringFramework

### 📚 SpringBoot SpringFramework

- [x] O que é spring boot?
- [x] Configurações manuais
- [x] Starters
- [x] Principais Starters
- [x] Configurações de fábrica

### 🔗 O que é spring boot?

Enquanto que o Spring Framework é baseado no padrão de injeção de dependências, o Springboot foca na configuração automática.

<img align=center src="https://media.discordapp.net/attachments/1098139264258158602/1156453814870753290/image.png?ex=6515070b&is=6513b58b&hm=d695290396d8dd0bcfeabea33826ac41b1c454604149b534238c8d591edb9d2d&=&width=203&height=200">

#### 🔗 Antes do spring boot

Desafios com a configuração do projeto.

* Dependência individual
* Verbosidade
* Incompatibilidade de versões
* Complexidade de gestão
* Configurações complexas e repetitivas

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156454035319160872/image.png?ex=6515073f&is=6513b5bf&hm=d0ae61b090f4b5919c8e712dcccb97e328b50e3bd7990d2681309fa90707254c&">

Dado que a maior parte das configurações necessárias para o início de um projeto são sempre as mesmas, por que não iniciar um projeto com todas estas configurações já definidas?

#### 🔗 Starters

* Starters são dependências que contém todas as configurações necessárias para o início de um projeto.

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156454255809527858/image.png?ex=65150774&is=6513b5f4&hm=10baf1a826c2d5f70c72b479250451eccb2a01a3524bffd8092ce1e82fd57869&">

**Benefícios**

* Coesão
* Versões compatíveis
* Otimização do tempo
* Configuração simples
* Foco no negócio

#### 🔗 Principais Starters

* **data-jpa**: Integração ao banco de dados via JPA - Hibernate.
* **data-mongodb**: Interação com banco de dados MongoDB.
* **web**: Inclusão do container Tomcat para aplicações REST.
* **web-services**: Webservices baseados na arquitetura SOAP
* **atch**: Implementação de JOBs de processos.
* **test**: Disponibilização de recursos para testes unitários como JUnit
* **openfeign**: Client HTTP baseado em interfaces
* **actuator**: Gerenciamento de monitoramento da aplicação. 

### 📌 Spring(Boot) Framework

* **Spring Framework**: Framework baseado no padrão de injeção de dependências.

#### 🔗 Primeiros passos:

* Criando um projeto com initializr
* importando o projeto maven no IntelliJ
* Conhecendo a estrutura spring boot
* Bean e CommandLineRunner

### 📌 Beans x Componentes

* **Bean**: É um objeto que é instanciado, gerenciado e injetado pelo Spring Framework.

* **Componentes**: São classes que são gerenciadas pelo Spring Framework.

### 📌 Properties Value

* O poderoso application.properties
* @Value
* Default value 

#### 🔗 Configuration Properties

* poderoso application.properties
* @ConfigurationProperties (prefix)

### 📌 Conceito de ORM e JPA

* O que é ORM ?
* Java Persistence API
* Mapeamentos
* EntityManager

### 🔗 O que é ORM?

Object-Relational Mapping, Em português, mapeamento objeto-relacional, é um recurso para aproximar o paradigma da orientação a objetos ao contexto de banco de dados relacional.

O uso de ORM é realizado através do mapeamento de objeto para uma tabela por uma biblioteca ou framework.

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156455696905273384/image.png?ex=651508cc&is=6513b74c&hm=b94563611b0892066f8301fa57a5f2fadc725435175390071436a0037dcc67e6&">

### 🔗 JPA 

JPA é uma especificação baseada em interfaces, que através de um framework realiza operações de persistência de objetos em Java.

#### 🔗 JPA - Implementações

* Hibernate
* EclipseLink
* OpenJPA
* TopLink

#### 🔗 Mapeamentos

Vamos conhecer os aspectos das anotações de mapeamento do JPA

* Identificação
* Definição
* Relacionamento
* Herança
* Persistência

#### 🔗 EntityManager

O EntityManager é a interface principal do JPA, responsável por realizar as operações de persistência.

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156456157859287101/image.png?ex=65150939&is=6513b7b9&hm=7d8a126c51bbce8edefc78fa8e9a9ff267fc7e2690632a246f8945c498ef40ab&">







