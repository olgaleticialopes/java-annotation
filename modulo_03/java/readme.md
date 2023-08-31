## Resumo do desafio: 

- Crie um programa que calcule e imprima o salario a ser transferido paa um funcionario. 

- Para realizar o calculo receba o valor bruto do salario e o adicional dos beneficios.
O salario a ser transferido é calculado da seguinte maneira: 

* (Valor bruto do salario - percentual de imposto mediante ao salario) + adicional dos beneficios

Para calcular o percentual de imposto, utilize a tabela abaixo:

| Salario Bruto             | Percentual de imposto |
|---------------            |-----------------------|
| Até R$ 1100.00            | 5%                    |
| De R$1100.01 a R$2500.00 | 10%              |
| Mais que R$2500.00        | 15%              |

- O programa deve imprimir o salario a ser transferido com duas casas decimais.

### Entrada

A entrada consiste em varios arquivos de teste, que conterá o **valor bruto do salario** e o **adicional dos beneficios**. Conforme o exemplo abaixo:

### Saida

Para cada arquivo de entrada tera um arquivo de saida. E como mencionado, sera gerado uma linha com um numero que sera a diferença entre o valor bruto do salario e o percentural de imposto mediante a faixa salarial somado com o adicional dos beneficios. Use o exemplo abaixo como referencia:

| Exemplo de entrada | Exemplo de saida |
|--------------------|------------------|
| 2000     | 2050.00          |
| 250      |                  |