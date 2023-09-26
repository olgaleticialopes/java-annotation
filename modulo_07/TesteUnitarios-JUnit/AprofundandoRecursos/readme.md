## 📌 Se aprofundando nos recusos: 

### Estrutura Básica de um teste:

```java
public class CalculadoraTest {
    @Test
    public void deveSomarDoisValores(){
        int a = 1;
        int b = 2;
        Calculadora calc = new Calculadora();
        int soma = calc.somar(a,b);
        Assert.assertEquals(3, soma);
    }
}
```

### After e Before:

```java
public class CalculadoraTest {
    @Before
    public void setup(){
        System.out.println("before");
    }
    @After
    public void tearDown(){
        System.out.println("after");
    }
    @Test
    public void deveSomarDoisValores(){
        int a = 1;
        int b = 2;
        Calculadora calc = new Calculadora();
        int soma = calc.somar(a,b);
        Assert.assertEquals(3, soma);
    }
}
```
### Assumption e testes condicional:




### Testando exceções:

```java
public class CalculadoraTest {
    @Test(expected = ArithmeticException.class)
    public void deveLancarUmaExcecaoAoDividirPorZero(){
        int a = 10;
        int b = 0;
        Calculadora calc = new Calculadora();
        calc.dividir(a,b);
    }
}
```

### Testando performance:

```java
public class CalculadoraTest {
    @Test(timeout = 1000)
    public void deveTestarPerformance(){
        int a = 10;
        int b = 10;
        Calculadora calc = new Calculadora();
        calc.somar(a,b);
    }
}
```

Ordenando execução de testes:

```java
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

```


