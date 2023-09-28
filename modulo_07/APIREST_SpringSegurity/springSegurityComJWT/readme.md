## 📌 Adicionando Segurança a uma API REST com Spring Security e JWT 

~~~~ 
Spring Security é apenas um grupo de filtros de servlet, que ajudam você a adicionar autenticação e autorização ao seu aplicativo da web.
~~~~

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MkpqmO0c6R1O60wN8jk%2F-MkpqqxlgCLOYGrrwRpn%2Fspring%20security.png?alt=media&token=44f099ed-b489-43e3-b709-7973620f93e6">

### 🔗 Terminologia

* **Authentication**: refere-se ao processo de verificação da identidade de um usuário, com base nas credenciais fornecidas. Um exemplo comum é inserir um nome de usuário e uma senha ao fazer login em um site.                                                                                                 Você pode pensar nisso como uma resposta à pergunta: "Quem é você? " ; 

* **Authorization**: refere-se ao processo de determinar se um usuário tem permissão adequada para executar uma ação específica ou ler dados específicos, supondo que o usuário seja autenticado com êxito.                                                                                                                           Você pode pensar nisso como uma resposta à pergunta: "Um usuário pode fazer / ler isso? " ;

* **Principio**: refere-se ao usuário autenticado no momento;

* **Autoridade concedida** refere-se à permissão do usuário autenticado.

* **Função** refere-se a um grupo de permissões do usuário autenticado.

### 🔗 Habilitando o Segurança do Spring

Em um projeto spring boot web vc precisa somente incluir a dependência do spring security no seu pom.xml

~~~~xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
~~~~

**Quando você inclui esta dependência ao iniciar a aplicação, será solicitado um usuário e senha.**

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MkQe-Po0N91Q7NuPDFU%2F-MkQfNl_QsSyEEPpkHpP%2Fsec.png?alt=media&token=30b7dba5-da96-4a01-9e52-27e492cdeb29">

#### 🔗Default (Padrão)

O Spring Security, possui um usuário padrão chamado user e toda vez que sua aplicação é iniciada ele gera uma senha aleatória no console.

~~~~cmd
Using generated security password: 6950aa31-b730-4731-bf6a-82eac7fb78be
~~~~

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MkQe-Po0N91Q7NuPDFU%2F-MkQg3fOnLWjaMP-v799%2Fsecdef.png?alt=media&token=0723dc9f-1b8d-467b-a86b-b25f78a7c245">

#### 🔗 Autenticação simples na pratica 

**Codigo na pasta dio-spring-security**

### 📌 JWT - JSON Web Token

O JSON Web Token - JWT é um padrão da Internet para a criação de dados com assinatura opcional e/ou criptografia, cujo conteúdo contém o JSON que afirma algum número de declarações. Os tokens são assinados usando um segredo privado ou uma chave pública/privada.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MkgnBvIubM0ifm3V6Jt%2F-MkgpTvJre_eBKYMWx9x%2Fjwt2.png?alt=media&token=cd1668c9-1732-425a-9eeb-1be04975dc35">

#### 🔗 Qual a estrutura do JWT?

JWT é uma representação divida em 03 partes:

* Header
* Payload
* Signature

 Portanto, um JWT normalmente se parece com o seguinte: xxxxx.yyyyy.zzzzz.

##### 🔗 Header

O header ou cabeçalho normalmente consiste em duas partes: o tipo de token, que é JWT e o algoritmo de assinatura que está sendo utilizado, como HMAC SHA256 ou RSA.

~~~~json
{
  "alg": "HS256",
  "typ": "JWT"
}
~~~~

##### 🔗 Payload

De fato, a estrutura do corpo contendo as informações de autenticação e autorização de um usuário.

~~~~json
{
  "sub": "glysns",
  "name": "GLEYSON SAMPAIO",
  "roles": ["USERS","MANAGERS"]
}
~~~~

##### 🔗 Signature

Para criar a parte de assinatura, você precisa pegar o header codificado em base64, o payload codificado em base64, uma chave, o algoritmo especificado no header e assinar tudo.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-MkgrNHT0UGaFGnyhktz%2F-MkgrceNx4iUDd1tiQLS%2Fjwt.png?alt=media&token=5ee084f8-ced5-4cfe-8921-baba98191a7f">

### 📌 Spring Security + JWT 

Neste tutorial, desenvolveremos um aplicativo Spring Boot que usa autenticação JWT para proteger uma API REST. Usaremos um usuário com perfis de acesso para geração e validação do token, que é transferido pelos clientes da nossa API.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-MgwMOcm4UygF4VcCNIq%2F-Mkgrjw0L5mjHjOnTvgq%2F-MkgvEu2kx5AOcqM9ysj%2Fsecurity.png?alt=media&token=2e071ae5-0463-4fef-9497-72be8d0dd80f">
