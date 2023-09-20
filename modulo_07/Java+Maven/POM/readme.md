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



