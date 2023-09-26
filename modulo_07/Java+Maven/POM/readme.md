## 📌 POM, dependências e repositórios

### 📋 O POM

* POM (Project Object Model) é um arquivo XML que contém informações sobre o projeto e configurações de detalhes de construção para o Maven a usar ao executar a construção.

* Unidade fundamental de trabalho no Maven.

* Detalha o projeto

* Detalha como construir o projeto

* Maven sempre procura pelo pom.xml para realizar sua execução

#### Detalhes pom.xml

* Nome do projeto
* Dependências
* Módulos
* Configurações de build
* Detalhes do projeto (nome, descrição, licença, url)
* Configurações de ambiente (repositórios, tracking, profiles)

Exemplo:

~~~xml	
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>br.com.alura.maven</groupId>
    <artifactId>loja-virtual</artifactId>
    <version>1.0.0</version>
    </project>
~~~




### 🔗 Repositórios

São locais onde podemos encontrar plugins e bibliotecas que o mavem provê para nós. Há dois tipos de repositórios: 

* Repositórios locais: São repositórios que ficam na máquina local, onde o maven está instalado. Por padrão, o maven já vem com um repositório local, que fica na pasta .m2, dentro da pasta do usuário.

* Repositórios remotos: São repositórios que ficam em servidores remotos, como o repositório central do maven, que fica em https://repo.maven.apache.org/maven2/.

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156262446391099513/image.png?ex=651454d1&is=65130351&hm=e68b17c102b74eafbca66df705f82f8f62fa1ff7973b28e84f61174d348fbe60&">

<img src="https://cdn.discordapp.com/attachments/1098139264258158602/1156262524317073538/image.png?ex=651454e4&is=65130364&hm=8481bcbefe269714f52204d3c977a4009dda146b7fb70fe143f3fc94fafb8943&">

#### Configurando repositórios

* Via pom.xml do projeto: 

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156262703703261184/image.png?ex=6514550e&is=6513038e&hm=e08e79889c3ac12831257b1df96e679e79e602c234744f93bc7fff71ebe3d28b&">

* Via settings.xml do maven:

* Localização: pasta-apache_maven/conf/settings.xml

#### Repositorio local 

* É o repositorio na maquina utilizando pelo maven para buscar os artefatos. 
* Estrategia de caching 
* Localizado na pasta .m2 do usuario

~~~~cmd
%userprofile%/.m2/repository
~~~~

#### Como funciona: 

* Quando o maven precisa de um artefato, ele procura no repositorio local.
* Se o artefato não estiver no repositorio local, o maven procura no repositorio remoto.
* Se o artefato não estiver no repositorio remoto, o maven retorna um erro.

<img align=center src="https://media.discordapp.net/attachments/1098139264258158602/1156263329854144572/image.png?ex=651455a4&is=65130424&hm=5c958fbacfc7d8af43fd03f82719a97d95bc85d893de5f9121bfe8743c430f2e&=&width=671&height=289">

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156263446564835479/image.png?ex=651455bf&is=6513043f&hm=f2aba04f900389ac4dcd1eb8f5dc8a17472ff8baff65214bbeaf8b0ad02233c0&">
