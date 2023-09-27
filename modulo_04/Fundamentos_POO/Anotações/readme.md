# poo_java
Programação Orientada a Objetos com Java


## Saída de Dados em Java

`%f` - ponto flutuante

`%d` - inteiro

`$u` - inteiro decimal sem sinal

`%s` - texto

`%n` - quebra de linha

`%o` - inteiro octal sem sinal

`%b` - boolean

`%c` - char

`%t` - tabulação

`%b` - backspace

`%n` - nova linha

`%r` - retorno do marcador

`%'` - aspas simples

`%"` - aspas duplas

`%\` - barra invertida

`%%` - porcentagem

`System.out.print`

`System.out.println`

`System.out.printf`

`Locale`

---

## Entrada de Dados

Scanner

Para fazer entrada de dados precisamos de um objeto do tipo "Scanner":

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

```
`sc.close();` - quando não precisar mais do objeto sc


Para ler um caractere

```java
char x;
x = sc.next().charAt(0);
```
`next()` - le a palavra

`nextInt()` - le um inteiro

`nextDouble()` - le um double

`next().charAt(0)` - le um char

`sc.nextLine()` - nextLine() faz a leitura da linha inteira para depois armazenar

Quebra de linha pendente: quando se usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão. Se fizer um nextLine(), aquela quebra de linha pendente será absorda pelo nextLine();

Solução Fazer nextLine() extra antes de fazer o nextLine() desejado.

Exemplo:

```java
        int x;
		String s1, s2, s3;

        x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
```

---

## Funções matemáticas em Java

`Math.sqrt(x)` - raiz quadrada

`Math.pow(x, y)` - valor de potenciação

`Math.abs(x)` - valor absoluto(sem o negativo caso exista o negativo)

---

## Operadores comparativos

`>` - maior

`<` - menor

`>=` - maior ou igual

`<=` - menor ou igual

`==` - igual

`!=` - diferente

---

## Operadores lógicos

`&&` - E ( ambos precisam ser verdadeiros, para ser verdadeiro. Se um for falso, será falso)

`||` - OU ( se um dos valores forem falsos. Então é falso)

`!`  - NÃO ( inverter o valor, se verdadeiro vira falso. Se falso, vira verdadeiro)

---

## Operadores de Atribuição cumulativa

`a += b;` é a mesma coisa que `a = a + b;`

`a -= b;` é a mesma coisa que `a = a - b;`

`a *= b;` é a mesma coisa que `a = a * b;`

`a /= b;` é a mesma coisa que `a = a / b;`

`a %= b;` é a mesma coisa que `a = a % b;`

---

`CTRL + SHIFT + F` - identa automaticamente no Eclipse

---

## Sintaxe do switch-case

```java
	switch (expressão) {
		case valor1:
			comando1
			comando2
			break;
		case valor2:
			comando3
			comando4
		default:
			comando5
			comando6
			break;
	}

```

---

## Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decir um valor com base em uma condição.

Sintaxe:
`(condição) ? valor_se_verdadeiro : valor_se_falso`

---

## Escopo e inicialização

- Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
- Uma variável não pode ser usada se não for iniciada.

---

## Debug no Eclipse

`Run > Toggle Breakpoint` - para marcar uma linha de breakpoint

`Botão direito na classe > Debug As > Java Application` - para iniciar o debug

`F6` - para executar uma linha

`Quadrado vermelho` - para interromper o debug ( `Ctrl` + `F2`)

---

## Estruturas Repetitivas

#### Estrutura repetitiva enquanto (while)

É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.

Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

Sintaxe:
```java
	while ( condição ) {
		comando1
		comando2
	}
```

---

#### Estrutura repetitiva para (for)

É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.

Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.

Sintaxe:
```java
	for (inicio; condição; incremento) {
		comando1
		comando2
	}
```

#### Estrutura repetitiva faça-enquanto (do while)

O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

```java
	do {
		comando1
		comando2
	} while ( condição );
```