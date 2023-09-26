## Maven Build Lifecycle

### 🔗 Ciclo de vida do Maven

* O Maven possui 3 ciclos de vida padrão: default, clean e site.
* Cada ciclo de vida é composto por fases.
* Cada fase é composta por plugins.
* Cada plugin é composto por goals.
* Cada goal é composto por tasks.

#### 🔗 Como é: 

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156266087873253468/image.png?ex=65145835&is=651306b5&hm=b3aee90c5c8a05619f6f1d7f17135b619e4f5c5afd40d23509b624004b104d4f&">
<br>

#### 📍 Defalut lifecycle: 

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156266295046721557/image.png?ex=65145867&is=651306e7&hm=d5de0fd365845deb2b69db619e2e77e55d685068b53e0b28ca7b0d1eb6b1aa37&">
<br>

* compile
* test
* package
* install
* deploy

* É o principal ciclo 
* Responsável pelo deploy local
* Composto por 23 fases

#### 🔗 Principais fases: 

* compile
* test
* package
* install
* deploy
* install
* deploy

#### 📍 Clean lifecycle:

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156266700262613105/image.png?ex=651458c7&is=65130747&hm=28f6cfe939b96a7585d8458c409ef80948728b51c7484dd8dcbff3c254497b86&">
<br>

* Ciclo intermediario
* Responsável por limpar o projeto
* Composto por 3 fases

##### 🔗 Principais fases:

* pre-clean
* clean
* post-clean

#### 📍 Site lifecycle:

<img align=center src="https://cdn.discordapp.com/attachments/1098139264258158602/1156267265856110632/image.png?ex=6514594e&is=651307ce&hm=a86077faa313ed78a905f28235373d41c23ddaae65c61e8da16af7a4a0bbfa1e&">
<br>

* Ciclo final 
* Responsável por gerar o site do projeto
* Composto por 4 fases

##### 🔗 Principais fases:

* pre-site
* site
* post-site
* site-deploy


