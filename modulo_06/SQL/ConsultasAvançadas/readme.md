## 📌 Consultas avançadas: 

### 📌 1.Consultas com agregações, junções e subconsultas

#### 🔗 Junções: JOINs

São usadas no SQL para combinar dados de duas ou mais tabelas relacionadas em uma unica consulta.

**Tipos de Junções:**

* INNER JOIN
* LEFT JOIN
* RIGHT JOIN
* FULL JOIN


**INNER JOIN**

Retorna registros que possuem valores correspondentes em ambas as tabelas.

~~~sql	
SELECT coluna1, coluna2, ...
FROM tabela1
INNER JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
~~~

<img align=center src="https://media.discordapp.net/attachments/1020872567738863716/1153747993577652284/image.png?width=160&height=126">

**LEFT JOIN**

Retorna todos os registros da tabela da esquerda (tabela1), e os registros correspondentes da tabela da direita (tabela2).

~~~sql
SELECT coluna1, coluna2, ...
FROM tabela1
LEFT JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
~~~

<img align=center src="https://cdn.discordapp.com/attachments/1020872567738863716/1153748209571741766/image.png">

**RIGHT JOIN**

Retorna todos os registros da tabela da direita (tabela2), e os registros correspondentes da tabela da esquerda (tabela1).

~~~sql
SELECT coluna1, coluna2, ...
FROM tabela1
RIGHT JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
~~~

<img align=center src="https://cdn.discordapp.com/attachments/1020872567738863716/1153748406997614692/image.png">

**FULL JOIN**

Retorna todos os registros quando há uma correspondência em qualquer uma das tabelas.

~~~sql
SELECT coluna1, coluna2, ...
FROM tabela1
FULL OUTER JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
~~~

<img align=center src="https://cdn.discordapp.com/attachments/1020872567738863716/1153748545594216628/image.png">


#### 🔗 Subconsultas

Permite realizar consultas dentro de consultas.
As subconsultas podem ser usadas em varias partes de uma consulta:

* SELECT
* FROM
* WHERE
* HAVING
* JOIN

### 📌 2.Consultas com agregações, junções e subconsultas

#### 🔗 Funções de agregação

São funções que realizam calculos em um conjunto de valores e retornam um unico valor.

*Count*: Conta o numero de registros.
*Sum*: Soma os valores de uma coluna.
*Avg*: Calcula a media dos valores de uma coluna.
*Max*: Retorna o maior valor de uma coluna.
*Min*: Retorna o menor valor de uma coluna.

**Agrupamento de Resultados**

*Select* Seleciona as colunas que serão exibidas.
*From* Seleciona as tabelas que serão usadas.
*Where* Filtra os registros.
*Group By* Agrupa os registros.

~~~sql
SELECT coluna1, coluna2, ...
FROM tabela
WHERE condicao
GROUP BY coluna1, coluna2, ...
~~~


**Limite de Resultados:**

* Select: Seleciona as colunas que serão exibidas.
* From: Seleciona as tabelas que serão usadas.
* Group By: Agrupa os registros.
* Limit: Limita o numero de registros.
* Offset: Define o ponto de partida para retornar registros.

~~~sql
SELECT coluna1, coluna2, ...
FROM tabela
WHERE condicao
GROUP BY coluna1, coluna2, ...
LIMIT 10 OFFSET 5
~~~

**Ordenação de Resultados:**

* ASC: Ordena os registros em ordem crescente.
* DESC: Ordena os registros em ordem decrescente.
* Multiplas colunas: Ordena os registros por multiplas colunas.

### 📌 3.Consultas Avançadas: Indices de Busca

#### Analise do plano de execução

O plano de execução é uma representação de como o banco de dados irá executar uma consulta.

~~~sql	
EXPLAIN SELECT * FROM tabela WHERE condicao;
~~~

Tipos:

* Select Type: Tipo de consulta. "simple", "primary", "subquery", "derived", "union", "union result".

* Table: Tabela que será usada na consulta.

* Type: Tipo de acesso aos dados. "ALL", "index", "range", "ref", "eq_ref", "const", "system", "NULL".

* Possible Keys: Possiveis indices que podem ser usados.

* Key: Indice que será usado.

* Key Length: Tamanho do indice que será usado.

* Ref: Coluna ou constante que será usada com o indice.

* Rows: Numero de linhas que serão examinadas.

#### Indices de busca

São estruturas de dados que melhoram a velocidade de busca de registros em uma tabela.

~~~sql
CREATE INDEX nome_indice ON tabela (coluna1, coluna2, ...);
~~~



