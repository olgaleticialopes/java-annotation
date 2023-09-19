## 📌 Modelagem de Dados Relacionais - Tabelas, Colunas e Registros. 

### 🔗 Tabelas

Tabela é usada para armazenar dados de forma organizada. Cada tabela em um banco de dados relacional tem um nome único e é dividida em colunas e linhas

### 🔗 Colunas

É uma estrutura dentro de uma tabela que representa um atributo específico dos dados armazenados. Cada coluna é representada por um nome único e um tipo de dado, como numérico, texto ou data.

### 🔗 Registros

Um registro, tambem conhecido como linha ou tupla, é uma instancia individual de dados armazenados em uma tabela. Em um banco de dados relacional, um registro é equivalente a uma linha.

* Comando para criar uma tabela: 

```sql
CREATE TABLE nome_tabela (
    nome_coluna tipo_dado,
    nome_coluna tipo_dado,
    nome_coluna tipo_dado
);
```

### 🔗 Tipos de Dados

Os dados podem variar muito entre os diversos SGBD, os mais comuns são: 

* Interiro (integer)
* Número decimal (decimal)
* Caractere (char)
* Caractere de texto (varchar)
* Data (date)
* Data e hora (datetime)
* Booleano (boolean)
* Texto Longo (text)

#### Comando criate table - opções

* Restrições de valor: 
    * NOT NULL
    * UNIQUE
    * DEFAULT
    * CHECK

* Restrições de chave primária e estrangeira:
    * PRIMARY KEY
    * FOREIGN KEY
    * REFERENCES

* Auto incremento:
    * AUTO_INCREMENT

~~~sql	
//comando: Insert//
INSERT INTO nome_tabela (nome_coluna1, nome_coluna2, nome_coluna3)
values (valor1, valor2, valor3);
~~~

~~~sql
//comando: Select//
SELECT nome_coluna1, nome_coluna2, nome_coluna3
FROM nome_tabela;

onde * retorna todas as colunas
~~~

#### Comando SELECT- operadores:

* = (igual)
* <> ou != (diferente)
* ">" (maior)
* < (menor)
* ">=" (maior ou igual)
* <= (menor ou igual)
* BETWEEN (entre)
* LIKE (semelhante)
* IN (dentro)
* And (e)
* OR (ou)

~~~sql	
//comando update//
UPDATE nome_tabela
SET nome_coluna1 = valor1, nome_coluna2 = valor2, nome_coluna3 = valor3
WHERE condicao;
~~~

~~~sql
//comando delete//
DELETE FROM nome_tabela
WHERE condicao;
~~~

#### Comando SELECT - clausulas:

* DISTINCT
* WHERE
* ORDER BY
* LIMIT
* OFFSET


## 📌 Modelagem de Dados Relacionais -Alterando e excluindo tabelas e colunas

**Problema**

Usuários com endereços longos não estão conseguindo realizar cadastro no sistema.

**Opções**

* Recriar a tabela, migrar os dados e excluir a tabela antiga
* Alterar estrutura da tabela

### Comandos: 

* Drop table

O comando DROP TABLE é usado para excluir uma tabela existente em um banco de dados.

~~~sql
drop table nome_tabela;
~~~

* Alter table

O comando ALTER TABLE é usado para adicionar, excluir ou modificar colunas em uma tabela existente.

~~~sql
alter table nome_tabela
add column nome_coluna tipo_dado;
~~~

Ela permite: 
    * Adicionar colunas
    * Excluir colunas
    * Modificar colunas
    * Adicionar restrições
    * Excluir restrições
    * Modificar restrições
    * Renoemar tabelas



## 📌 Modelagem de Dados Relacionais - Chaves primárias e estrangeiras

### 🔗 Chaves Estrangeiras

Uma chave estrangeira é uma coluna ou conjunto de colunas em uma tabela que se refere a uma chave primária em outra tabela. A tabela que contém a chave estrangeira é chamada de tabela filho e a tabela que contém a chave primária é chamada de tabela pai.

* Identifica exclusivamente cada linha/registro em uma tabela
* Não pode conter valores nulos
* Pode ter apenas uma chave primária por tabela

~~~sql	
//comando: Create table//
CREATE TABLE nome_tabela (
    nome_coluna tipo_dado PRIMARY KEY,
    nome_coluna tipo_dado,
    nome_coluna tipo_dado
);
~~~

### 🔗 Chaves Estrangeiras

Uma chave estrangeira é uma coluna ou conjunto de colunas em uma tabela que se refere a uma chave primária em outra tabela. A tabela que contém a chave estrangeira é chamada de tabela filho e a tabela que contém a chave primária é chamada de tabela pai.

* Pode conter valores nulos
* Pode ter várias chaves estrangeiras por tabela

~~~sql
//comando: Create table//
CREATE TABLE nome_tabela (
    nome_coluna tipo_dado,
    nome_coluna tipo_dado,
    nome_coluna tipo_dado,
    FOREIGN KEY (nome_coluna) REFERENCES nome_tabela (nome_coluna)
);
~~~

~~~sql	
//comando: alter table//
ALTER TABLE nome_tabela
ADD CONSTRAINT nome_chave_estrangeira FOREIGN KEY (nome_coluna) REFERENCES nome_tabela (nome_coluna);
~~~

#### Restrções de chave estrangeira

* ON DELETE CASCADE - exclui automaticamente os registros filhos quando o registro pai é excluído
* ON DELETE SET NULL - define como nulo os registros filhos quando o registro pai é excluído
* ON DELETE NO ACTION - não permite a exclusão do registro pai enquanto houver registros filhos



