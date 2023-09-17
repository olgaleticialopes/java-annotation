# 📌 Functional Interface

Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada
como
expressões lambda.

- `Consumer<T>`: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado. É utilizada
  principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

```java
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };

    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream_api().forEach(imprimirNumeroPar);
  }
}
```

```java
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com uma classe anônima para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
      @Override
      public void accept(Integer numero) {
        if (numero % 2 == 0) {
          System.out.println(numero);
        }
      }
    };

    // Usar o Consumer para imprimir números pares da lista
    for (Integer numero : numeros) {
      imprimirNumeroPar.accept(numero);
    }
  }
}
```

- `Supplier<T>`: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T. É comumente
  usada para criar ou fornecer novos objetos de um determinado tipo.

```java
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
  }
}
```

```java
public class SupplierExample {
  public static void main(String[] args) {
    // Usar o Supplier com uma classe anônima para fornecer uma saudação personalizada
    Supplier<String> saudacao = new Supplier<String>() {
      @Override
      public String get() {
        return "Olá, seja bem-vindo(a)!";
      }
    };

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      listaSaudacoes.add(saudacao.get());
    }

    // Imprimir as saudações geradas
    for (String saudacaoGerada : listaSaudacoes) {
      System.out.println(saudacaoGerada);
    }
  }
}
```

- `Function<T, R>`: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R. É
  utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.

```java
public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar a Function com expressão lambda para dobrar todos os números
    Function<Integer, Integer> dobrar = numero -> numero * 2;

    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrados = numeros.stream_api()
        .map(dobrar)
        .collect(Collectors.toList());

    // Imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
  }
}
```

```java
public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar a Function com uma classe anônima para dobrar todos os números
    Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer numero) {
        return numero * 2;
      }
    };

    // Usar a função para dobrar todos os números e armazená-los em outra lista
    List<Integer> numerosDobrados = new ArrayList<>();
    for (Integer numero : numeros) {
      numerosDobrados.add(dobrar.apply(numero));
    }

    // Imprimir a lista de números dobrados
    for (Integer numeroDobrado : numerosDobrados) {
      System.out.println(numeroDobrado);
    }
  }
}
```

- `Predicate<T>`: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou
  falso). É comumente usada para filtrar os elementos do Stream com base em alguma condição.

```java
public class PredicateExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Usar o Predicate com expressão lambda para filtrar números pares
    Predicate<Integer> isPar = numero -> numero % 2 == 0;

    // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
    List<Integer> numerosPares = numeros.stream_api()
        .filter(isPar)
        .collect(Collectors.toList());

    // Imprimir a lista de números pares
    numerosPares.forEach(System.out::println);
  }
}
```

```java
public class PredicateExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Usar o Predicate com uma classe anônima para filtrar números pares
    Predicate<Integer> isPar = new Predicate<Integer>() {
      @Override
      public boolean test(Integer numero) {
        return numero % 2 == 0;
      }
    };

    // Usar o predicado para filtrar números pares e armazená-los em outra lista
    List<Integer> numerosPares = new ArrayList<>();
    for (Integer numero : numeros) {
      if (isPar.test(numero)) {
        numerosPares.add(numero);
      }
    }

    // Imprimir a lista de números pares
    for (Integer numeroPar : numerosPares) {
      System.out.println(numeroPar);
    }
  }
}
```

- `BinaryOperator<T>`: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo
  tipo T. É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

```java
public class BinaryOperatorExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    // Usar o BinaryOperator para somar todos os números no Stream
    int resultado = numeros.stream_api()
        .reduce(0, somar);

    // Imprimir o resultado da soma
    System.out.println("A soma dos números é: " + resultado);
  }
}
```

```java
public class BinaryOperatorExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o BinaryOperator com classe anônima para somar dois números inteiros
    BinaryOperator<Integer> somar = new BinaryOperator<Integer>() {
      @Override
      public Integer apply(Integer num1, Integer num2) {
        return num1 + num2;
      }
    };

    // Usar o BinaryOperator para somar todos os números no Stream
    int resultado = numeros.stream_api()
        .reduce(0, somar);

    // Imprimir o resultado da soma
    System.out.println("A soma dos números é: " + resultado);
  }
}
```

> _Classe Anônima_:
> A classe anônima em Java é uma classe não recebeu um nome e é tanto declarado e instanciado em uma única instrução.
> Você deve considerar o uso de uma classe anônima sempre que você precisa para criar uma classe que será instanciado
> apenas uma vez.

---
