## 📌 Tipos de comentários

* On Line 
~~~java	
// Olá, eu sou um comentário em uma única linha
~~~

* Em bloco
~~~java
/* Olá,
 * Eu sou um comentario
 * que posso ser mais detalhadod
 * quando necessário
 */ 
~~~

* Javadoc
~~~java
/** 
 * Estas duas estrelinhas acima
 * é para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */
~~~

**Um comentário, não possui a finalidade de amenizar um algoritmo não estruturado, conforme as convenções da linguagem.**

~~~java
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 * /
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x
    }
    return r;
}
~~~

## 📌 Javadoc

Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.
Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

* link para a documentação: https://pt.wikipedia.org/wiki/Javadoc <br>
Criando nossa documentação no formato html, para disponibilizar via web.<br>
~~~java	
// No terminal execute o comando abaixo

javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
~~~	


