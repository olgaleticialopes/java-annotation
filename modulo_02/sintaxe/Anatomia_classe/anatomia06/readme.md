### 📌 Anatomia de classes 06:

### 🔗 Java Beans

Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere através de convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.

#### Variaveis: 

Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:<br>
* Uma variável deve ser clara, sem abreviações ou definição sem sentido;
* Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
* Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

*Não recomentado*
~~~~java
double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
~~~~

*Recomendado*
~~~~java
double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
String meuNome = "JOSEPH" 
~~~~

#### Metodos: 

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta, a partir da segunda palavra.
Exemplos sugeridos para nomenclatura de métodos:<br>

~~~~java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
~~~~

