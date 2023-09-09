## 📌 Classes 

Toda a aestrutura de codigo na linguagem java é distribuido em arquivos com extensão .java demonidos de classes, que são a base de toda a estrutura de programação orientada a objetos.

As classes existentes em nosso projetos serão compostas por:        

* Classe(class) - É a estrutura de código que contém os atributos e métodos de um objeto ou a representação que direciona a criação de um objeto de mesmo tipo. 

* Identificador (identity) - Proposito existencial aos aonjetos que serão criados a partir da classe.

* Caracteristicas (attributes) - São as propriedades que definem o objeto, toda informação que representa o estado do objeto.

* Comportamento (behaviour) - São as ações que o objeto pode realizar, ou seja, os métodos que o objeto pode executar.

* Instaciação (instance) - É o processo de criação de um objeto a partir de uma classe.

exemple:

 <img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-0c95c1d29336e1a2c8924f914cbab3dd38077990%2Fimage%20(9)%20(1)%20(1)%20(1).png?alt=media">

 Para ilustrar vamos reprodozir o exemplo acima em java:

Criando a classe Student:
 ~~~~java
 // Criando a classe Student
// Com todas as características e compartamentos aplicados

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Lunch lunch){
      //NOSSO CÓDIGO AQUI
    }
    void drinking(Juice juice){
      //NOSSO CÓDIGO AQUI
    }
    void running(){
      //NOSSO CÓDIGO AQUI
    }
}
~~~~
 
Criando os objetos: 
~~~~java	
// Criando objetos a partir da classe Student

public class School {
    public static void main(String[] args) throws Exception {
      Student student1 = new Student();
      student1.name= "John";
      student1.age= 12;
      student1.color= Color.FAIR;
      student1.sex= Sex.MALE;

      Student student2 = new Student();
      student2.name= "Sophia";
      student2.age= 10;
      student2.color= Color.FAIR;
      student2.sex= Sex.FEMALE;

      Student student3 = new Student();
      student3.name= "Lily";
      student3.age= 11;
      student3.color= Color.DARK;
      student3.sex= Sex.FEMALE;
    }
}
~~~~

* No exemplo acima, NÃO estruturamos a classe Student,com o padrão Java Beans getters e setters.

Seguindo algumas convenções, as nossas classes são classificadas como:
* Classe de modelo (model): classes que representam estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.
* Classe de serviço (service): classes que contém regras de negócio e validação de nosso sistema.
* Classe de repositório (repository): classes que contém uma integração com banco de dados.
* Classe de controle (controller): classes que possuem a finalidade de disponibilizar alguma comunicação externa, à nossa aplicação, como http web ou webservices.
* Classe utilitária (util): classe que contém recursos comuns, à toda nossa aplicação.

**Modelo aplicado em grande parte dos projetos atuais:**
<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%2Fimage%20(7)%20(1)%20(1).png?alt=media">

**https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-2ce73deabfce2bcbe385e6fb4c19e9a510941778%2Fimage%20(7)%20(1)%20(1).png?alt=media**
