## 📌 Primeiro projeto 

criando um projeto de cadastro de usuarios com spring boot e maven. 

Vamos explorar todos os recursos de Spring Framework e Spring Boot desenvolvendo um controle de acesso essencial em qualquer aplicação.
Teremos um usuário (User) com os atributos: Id, Name, Username, Password e suas Permissões (roles) conforme diagrama abaixo

<img aling=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MjhddmjVwYX1tOqMISN%2F-MjhgOaM-x9WNxBj9KGi%2Fuser.png?alt=media&token=b79216ed-e580-4593-873f-67b66d3a3183">

### 🔗 Spring initializer

Site que oferece os recursos para criação de um projeto Spring Boot com uso Maven ou Gradle

* Acesse o site: https://start.spring.io/
* Selecione a opção Maven Project
* Selecione a opção Language - Java

#### 📍 Preenchimento: 

* **Group**: Nome do grupo organizacional
* **Artifact**: Identificação do projeto
* **Name**: Nome do Projeto (igual ao artifact)
* **Description**: Descrição do Projeto
* **Package Name**: Nome do pacote raíz da sua aplicação
* **Packaging**: Tipo de Build da sua aplicação, pode manter .jar
* **Java**: Versão do Java JDK e JRE que está utilizando

<img aling=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MjhidovB2J6UNjD5vy_%2F-Mji1dkMb3Oi6-qnjq_U%2Fprojetct.png?alt=media&token=c9c901f0-cb01-4d0e-89e5-568ade18f156">

Clique no botão GENERATE para realizar o download,  extraia o aquivo .zip e em seguida importe na IDE de sua preferência.

**NOTA: Ainda não incluímos nenhuma dependência de acesso a dados, web e segurança**

* Codigos na pasta "ProjetoAPI"

## 📌 Spring Data JPA

### 🔗 Spring Data JPA

O Spring Data JPA adiciona uma camada sobre o JPA. Isso significa que ele usa todos os recursos definidos pela especificação JPA, especialmente o mapeamento de entidades e os recursos de persistência baseado em interfaces e anotações.Por isso, o Spring Data JPA adiciona seus próprios recursos, como uma implementação sem código do padrão de repositório e a criação de consultas de banco de dados a partir de nomes de métodos.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MjhHnEfhNrHJxjW2fxb%2F-MjhIm-z1mu1ImfqIPBF%2Fdatajpa.png?alt=media&token=0314ec23-cd85-48bd-b97f-9e16d158c18e">

 A partir de agora,nossa interação com o banco de dados será através de herança de interfaces e declaração de métodos com anotações.
Existem algumas interfaces e anotações que são super relevantes de explorar como:

### 🔗 Interfaces

* CrudRepository
* JPARepository
* PagingAndSortingRepository

### 🔗 Anotações

* @Query
* @Param

### 🔗 Mapeamento: 

Vamos imaginar que fomos designados a implementar um cadastro de usuário conforme diagrama abaixo

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MjhddmjVwYX1tOqMISN%2F-MjhgOaM-x9WNxBj9KGi%2Fuser.png?alt=media&token=b79216ed-e580-4593-873f-67b66d3a3183">

Com os recursos do Spring Data JPA  poderemos incluir, alterar, listar e excluir nossos usuários em uma base de dados.

**Para isto ser possível, adicionaremos o starter spring-boot-starter-data-jpa no arquivo pom.xml**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
    
```

#### 🔗 Anotações

* @Entity: Torna a classe um entidade conectada a uma tabela no banco de dados
* @Table: Necessário quando o nome da entidade difere do nome da tabela
* @Id: Determina que o atributo representa a chave primária no banco de dados
* @GeneratedValue: Determina a geração da chave primária
* @Column: Necessário quando precisamos informar propriedade de definição DDL na entidade
* @Transient: Quando o atributo não possui relação com nenhum campo no banco de dados

**O projeto Spring Data JPA é capaz de se conectar a qualquer banco de dados relacional.**