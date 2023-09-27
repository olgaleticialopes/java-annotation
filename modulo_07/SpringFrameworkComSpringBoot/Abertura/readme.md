## 📌 Imersão no spring Framework com Spring Boot. 

* Spring versus Java EE
* O que é spring boot
* CONCEITO DE ioC/ DI
* Beans/Autowired/scopes
* Spring Data JPA


### 🔗 Spring framework

* Spring é um framework open source para a plataforma Java criado por Rod Johnson e descrito em seu livro "Expert One-on-One: JEE Design and Development". Trata-se de um framework não intrusivo, baseado nos padrões de projeto inversão de controle (IoC) e injeção de dependência.

#### 🔗 Fundamentos: 

### 🔗 Modulos do Spring

* Spring Core

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156449774434795602/image.png?ex=65150348&is=6513b1c8&hm=e56522a5cdb0a9766311044f2cfff8d6d7a1e07d1495368a1be35963e72a8fd3&" align=center>


### 🔗 Spring versus Java EE

* O Spring é um framework que surgiu como alternativa ao Java EE, que é um conjunto de especificações que definem como as aplicações corporativas devem ser desenvolvidas. O Java EE é um padrão que define como as aplicações devem ser desenvolvidas, mas não define como isso deve ser feito. O Spring é um framework que implementa essas especificações.

### 🔗Inversão de controle   

* Inversão de controle é um princípio no qual a execução de um determinado trecho de um programa é realizada por um componente externo. O componente externo é responsável por gerenciar a execução do trecho de código, ou seja, o controle é invertido.

* O Spring é um framework que implementa o princípio de inversão de controle. O Spring é responsável por gerenciar a execução de um trecho de código, ou seja, o controle é invertido.

### Beans 

* Beans são objetos que formam o núcleo de uma aplicação Spring. Um bean é um objeto que é instanciado, gerenciado e injetado pelo Spring. Um bean é um objeto que é gerenciado pelo Spring.

### Injeção de dependência

* Injeção de dependência é um padrão de projeto que define como os objetos devem ser criados e injetados em um sistema. A injeção de dependência é um padrão de projeto que define como os objetos devem ser criados e injetados em um sistema.

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156450889884782632/image.png?ex=65150451&is=6513b2d1&hm=1c1a5e1b7d9aea4c049e8b11a89965cf2aba23ebed5f85b3697927a2d9a776a7&" align=center>

### Scopes

* O Spring define cinco escopos para os beans: singleton, prototype, request, session e global session. O escopo singleton define que o Spring deve criar apenas uma instância do bean e que essa instância deve ser compartilhada por todos os componentes que utilizam o bean. O escopo prototype define que o Spring deve criar uma nova instância do bean cada vez que o bean for injetado em um componente. O escopo request define que o Spring deve criar uma nova instância do bean para cada requisição. O escopo session define que o Spring deve criar uma nova instância do bean para cada sessão. O escopo global session define que o Spring deve criar uma nova instância do bean para cada sessão global.

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156451070457937940/image.png?ex=6515047d&is=6513b2fd&hm=d5ce2643260ba2be9ebec3c3ee7e3ea3e4825aaedcb714caaf6eab3b92de9b44&" align=center>

* Singleton: O container do Spring cria uma única instância do bean e a reutiliza sempre que o bean for injetado em um co

* Prototype: O container do Spring cria uma nova instância do bean cada vez que o bean for injetado em um componente.

* Request: O container do Spring cria uma nova instância do bean para cada requisição.

* Session: O container do Spring cria uma nova instância do bean para cada sessão.

* Global session: O container do Spring cria uma nova instância do bean para cada sessão global.

* HTTP: O container do Spring cria uma nova instância do bean para cada requisição HTTP.

* Portlet: O container do Spring cria uma nova instância do bean para cada requisição Portlet.

* Autowired: O Spring é responsável por injetar as dependências de um bean. O Spring é responsável por injetar as dependências de um bean. como: **byname** e **bytype**.
