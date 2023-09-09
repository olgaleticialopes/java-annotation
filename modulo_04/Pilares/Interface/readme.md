<div align=center>

## Interface

</div>

**Antes de tudo, NÃO estamos nos referindo a interface gráfica. Tudo bem? 😁😉**

Como vismos anterioarmente, Herança é um dos pilares de POO, mas uma curiosidade que deve ser esclarecida, na linguagem Java, é que a mesma não permite o que conhecemos como Herança multipla. 

A medida que vão surgindo novas necessidades, novos equipamentos (objetos), que nascem para atender as expectativas de oferecer ferramentas com finalidades bem específicas, como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

Observem que não há uma especificação de marca, modelo e ou capacidades de execução das classes citadas acima, isto é o que consideramos o nível mais abstrato da orientação a objetos, que denominamos como interfaces.

Ilustração de interface:

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-c934a98203783dfa28d98f4f3003056d5721fab6%2Fimage%20(11)%20(1)%20(1).png?alt=media">

Representação de objetos reais com base nas interfaces:

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-679646d0c04911235b7725e09f08b4439000dc1c%2Fimage%20(20)%20(1).png?alt=media">

Então podemos concluir que, interfaces são classes abstratas, que não possuem implementação, e que servem de base para outras classes, que por sua vez, implementam os comportamentos de forma específica.

Então, o que você está dizendo é que interfaces, é o mesmo que classes? Um molde para representação dos objetos reais ?

Este é umdos maiores questionamentos, no que se refere a modelo de classes da plicação. 
Como citado acima, Java não permite herança múltipla, logo, vamos imaginar que, recebemos o desafio de projetar uma nova classe, para criar objetos que representam as três características citadas acima e que iremos denominar de **EquipamentoMultifunional**.

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-fc3c1c4ec6d603682b686a470565e0c6f3798972%2Fimage%20(11)%20(1).png?alt=media">

Para melhor compreensão vamos analisar os diagramas de classes abaixo, comparando os conceitos: 

### Cenario 01

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-71934593133ff20a66e3fa0e3723c93b5d3bd8b7%2Fimage%20(3)%20(2).png?alt=media">

### Cenario 02

<img align=center src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-0175ff3d712a283ce6c6b317fc09046a94e1836b%2Fimage%20(20).png?alt=media">

Antes de iniciarmos a representação via código, devemos compreender que, assim como em classes e métodos abstratos, quando herdamos de uma interface, precisamos implementar todos os seus métodos, pois os mesmos são implicitamente **public abstract**.

