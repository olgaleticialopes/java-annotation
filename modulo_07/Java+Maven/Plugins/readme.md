## 📌 Plugins 

### 🔗 O que são plugins?

Plugins são componentes que podem ser adicionados ao Maven para estender suas funcionalidades. É um estilo arquitetural para extensibilidade (ciar seu proprio plugin).
Escrito principalmente em Java, mas pode ser escrito em qualquer linguagem.

### 🔗 Plugins maven

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156270149876338688/image.png?ex=65145bfe&is=65130a7e&hm=71e3e51ceca16fb996e5e9eb581feeb11825beb1668f60d5a2c0957e42de3dfc&">

* Plugins são executados durante o ciclo de vida do Maven.
* Cada plugin é composto por goals.
* Cada goal é composto por fases.
* Cada fase é composta por tarefas.

### 🔗 Exemplo de plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <source>1.8</source>
        <target>1.8</target>
    </configuration>
</plugin>
```


