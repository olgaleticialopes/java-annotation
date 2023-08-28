# 📌 Documentação

Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.
* link para a documentação oficial: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

## Tags de documentação

Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:<br>

* @autor = define o autor da classe
* @version = versão do recurso disponibilizado
* @since = versão/ data de inicio da disponibilização do recurso
* @param = define um parâmetro de um método
* @return = define o retorno de um método
* @throws = define uma exceção que pode ser lançada por um método
<br>

Abaixo, iremos ilustrar a classe Calculadora com um exemplo de documentação, destacando as tags mais utilizadas:<br>

~~~java	
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gleyson Sampaio
* @version 1.0
* @since   01/01/2022
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
~~~

<img src="https://3025166959-files.gitbook.io/~/files/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FjFR9F4NToQ6FD39fU3wC%2Fuploads%2Fgit-blob-b303136896ec29f3e279833f8c153b169ebe13d2%2Fimage%20(15)%20(1)%20(1).png?alt=media">
<br>


