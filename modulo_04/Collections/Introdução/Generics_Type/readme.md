<div aling=center>

## Generics Type

</div>

* Um tipo generico é uma classe generica ou uma interface que é parametrizada sobre tipos.

Exemplo: 

```java
public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
```

- O símbolo <> é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
- Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código public class Box para public class Box<T>.
- Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:

```java
/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
*/
public class Box<T> {
	// T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```

Como pode ver, todas as ocorrencias de Object são substituidas por T.
Uma varial de tipo de ser qualquer tipo não primitivo que voce especificar: qualquer classe, qualquer interface, qualquer array, qualquer anotação, ou qualquer tipo de parametro de tipo.
Essa mesma tecnica pode ser aplicada para criar interfaces genericas.

#### Os nomes de tipo de parametro de tipo

*  E - Elemento (usado extensivamente pelo Java Collections Framework)
*  K - Chave
*  N - Número
*  T - Tipo
*  V - Valor
*  S, U, V, etc. - 2º, 3º, 4º tipos

### Vantages de usar Generics

1. Segurança do tipo de dados: O uso de generics garante que apenas objetos de um tipo específico possam ser adicionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.

2. Código mais legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.

3. Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.

4. Reutilização de código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.

5. Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.

<br>

* Exemplo GenericsExempleList

```java
package main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
	public static void main(String[] args) {
		// Exemplo sem Generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1");
		listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

		// Exemplo com Generics
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");

		// Iterando sobre a lista com Generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}

		// Iterando sobre a lista sem Generics (necessário fazer cast)
		for (Object elemento : listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}
}
```

* Exemplo GenericsExempleMap

```java
package main.java.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
	public static void main(String[] args) {
		// Exemplo sem Generics
		Map mapaSemGenerics = new HashMap();
		mapaSemGenerics.put("Chave 1", 10);
		mapaSemGenerics.put("Chave 2", "valor"); // Permite adicionar qualquer tipo de objeto

		// Exemplo com Generics
		Map<String, Integer> mapaGenerics = new HashMap<>();
		mapaGenerics.put("Chave 1", 10);
		mapaGenerics.put("Chave 2", 20);

		// Iterando sobre o mapa com Generics
		for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
			String chave = entry.getKey();
			int valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}

		// Iterando sobre o mapa sem Generics (necessário fazer cast)
		for (Object obj : mapaSemGenerics.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			String chave = (String) entry.getKey();
			Object valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
	}
}
```

* Exemplo GenericsExempleSet

```java
package main.java.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
	public static void main(String[] args) {
		// Exemplo sem Generics
		Set conjuntoSemGenerics = new HashSet();
		conjuntoSemGenerics.add("Elemento 1");
		conjuntoSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

		// Exemplo com Generics
		Set<String> conjuntoGenerics = new HashSet<>();
		conjuntoGenerics.add("Elemento 1");
		conjuntoGenerics.add("Elemento 2");

		// Iterando sobre o conjunto com Generics
		for (String elemento : conjuntoGenerics) {
			System.out.println(elemento);
		}

		// Iterando sobre o conjunto sem Generics (necessário fazer cast)
		for (Object elemento : conjuntoSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}
}
```

