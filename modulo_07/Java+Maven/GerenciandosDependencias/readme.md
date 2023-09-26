## 📌 Gerenciamendo de Dependências com Maven

### 📖 Dependências

- [x] [Maven](https://maven.apache.org/download.cgi)
- [x] [Java](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- [x] [Eclipse](https://www.eclipse.org/downloads/)
- [x] [Git](https://git-scm.com/downloads)

### 🚀 Configuração do Ambiente

~~~~mavem
<dependencies>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
</dependencies>
~~~~

#### 🔗 Propriedades

* Group id: Identificador do projeto
* Artifact id: Identificador do artefato
* Version: Versão do artefato

### 🔗 Tipos de dependências

* Direta: São as dependências que colocamos no pom.xml do projeto
* Transitiva: São as dependências que são adicionadas automaticamente pelo maven, de acordo com as dependências diretas que colocamos no pom.xml

#### Transitividade e escopos

Para lidar com esse problema, maven provê escopos para limitar a transitividade de dependências. Os escopos são:

* compile: É o escopo padrão. As dependências com esse escopo estarão disponíveis em todos os classpaths, de testes e de execução.
* provided: As dependências com esse escopo estarão disponíveis apenas no classpath de compilação, e não no classpath de execução.
* runtime: As dependências com esse escopo estarão disponíveis apenas no classpath de execução, e não no classpath de compilação.
* test: As dependências com esse escopo estarão disponíveis apenas no classpath de testes, e não no classpath de compilação e de execução.
* system: As dependências com esse escopo estarão disponíveis em todos os classpaths, mas não serão obtidas pelo repositório. O desenvolvedor deve informar o caminho da dependência através da tag systemPath.


### 🔗 Escopo compule 

* É o escopo padrão.
* As dependências com esse escopo estarão disponíveis em todos os classpaths, de testes e de execução.
* É transitivo

### 🔗 Escopo provided

* As dependências com esse escopo estarão disponíveis apenas no classpath de compilação, e não no classpath de execução.
* Não é transitivo

~~~~mavem
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<scope>provided</scope>
~~~~

### 🔗 Escopo runtime

* As dependências com esse escopo estarão disponíveis apenas no classpath de execução, e não no classpath de compilação.
* É transitivo

~~~~mavem

<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<scope>runtime</scope>

~~~~

### 🔗 Escopo test

* As dependências com esse escopo estarão disponíveis apenas no classpath de testes, e não no classpath de compilação e de execução.
* É transitivo

~~~~mavem
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<scope>test</scope>
~~~~

### 🔗 Escopo system

* As dependências com esse escopo estarão disponíveis em todos os classpaths, mas não serão obtidas pelo repositório. O desenvolvedor deve informar o caminho da dependência através da tag systemPath.
* Não é transitivo

~~~~mavem
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<scope>sytem</scope>
<systempath>${project.basedir}/libs/custom-dependency-1.3.2,jar</systempath>
~~~~

### 🔗 Escopo import

* Esse escopo é usado apenas em dependências do tipo pom. Ele indica que as dependências do pom importado devem ser consideradas como se fossem dependências do pom que está importando.
* É transitivo

~~~~mavem
<dependencymanagement>
<dependencies>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<type>pom</type>
<scope>import</scope>
</dependencies>
</dependencymanagement>
~~~~



