## 📌 Banco de Dados NoSQL

### 🔗 O que é um Banco de Dados Não Relacional?

É um banco de dados que não utiliza o modelo relacional, ou seja, não utiliza tabelas, linhas e colunas para armazenar os dados.

* Termo correto: Banco de Dados Não Relacional(Not Only SQL).
* Não segue o modelo relacional.
* Não utiliza tabelas, linhas e colunas.
* Projetadas para lidar com grandes volumes de dados e alta escalabilidade.
* Alta flexibilidade e desempenho.
* Amplamente utilizados em cenarios onde a consistencia imediata dos dados não é critica.

**Diferenças entre Bancos de Dados Relacionais e Não Relacionais**

<img align=cener src="https://media.discordapp.net/attachments/1020872567738863716/1153752131053043753/image.png?width=991&height=273">

**📍 Vantagens dos Bancos de Dados Não Relacionais**

* Alta escalabilidade.
* Flexibilidade na modelagem dos dados.
* Melhor desempenho.
* Tolera falhas.

**📍 Desvantagens dos Bancos de Dados Não Relacionais**

* Falta de padronização.
* Menos consistência de dados imediata
* Menos suporte a consultas complexas. ** Dependendo do banco de dados utilizado.

### 🔗 Tipos de Bancos de Dados Não Relacionais

#### 📍 Tipos

* Key-Value
* Documentos
* Colunas
* Grafos
* Entre outros...

#### 📍 Key-Value

* Armazena os dados em pares de chave e valor.
* A chave é um identificador único para o valor.
* O valor pode ser qualquer coisa, desde um simples número até um documento JSON complexo.
* Exemplos: Redis, DynamoDB, Riak, Voldemort, etc.

#### 📍 Documentos

* Armazena os dados em documentos semelhantes a JSON.
* Cada documento pode ter uma estrutura diferente.
* Os documentos são agrupados em coleções.
* Exemplos: MongoDB, CouchDB, etc.

#### 📍 Colunas

* Armazena os dados em forma de colunas.
* Cada linha pode ter um número diferente de colunas.
* As colunas são agrupadas em famílias de colunas.
* Exemplos: Cassandra, HBase, etc.

#### 📍 Grafos

* Armazena os dados em forma de grafos.
* Os dados são armazenados em nós e arestas.
* Cada nó representa uma entidade (por exemplo, uma pessoa) e cada aresta representa um relacionamento entre dois nós.
* Exemplos: Neo4J, OrientDB, etc.

## 📌 MongoDB

### 🔗 O que é o MongoDB?

* Banco de dados orientado a documentos.
* Armazena os dados em documentos semelhantes a JSON.
* Cada documento pode ter uma estrutura diferente.
* Os documentos são agrupados em coleções.
* Exemplos: MongoDB, CouchDB, etc.

### 🔗 Vantagens do MongoDB

* Alta escalabilidade.
* Flexibilidade na modelagem dos dados.
* Melhor desempenho.
* Tolera falhas.

### 🔗 Desvantagens do MongoDB

* Falta de padronização.
* Menos consistência de dados imediata
* Menos suporte a consultas complexas. ** Dependendo do banco de dados utilizado.



## 📌 Modelagem de dados usando documentos: 

<img align=center src="https://cdn.discordapp.com/attachments/1020872567738863716/1153753928995967066/image.png">

**Coleções**

* As coleções são grupos de documentos.
* Os documentos são armazenados em coleções.
* As coleções são análogas às tabelas em bancos de dados relacionais.
* As coleções não impõem um esquema.

**Caraacterísticas**

* As coleções não impõem um esquema.
* Os documentos em uma coleção podem ter estruturas diferentes.
* Os documentos em uma coleção podem ter campos diferentes.
* Os documentos em uma coleção podem ter tipos de dados diferentes.
* Não podem ter mais de 64 bytes de comprimento

**Documentos**

* Os documentos são armazenados em coleções.
* Os documentos são análogos às linhas em bancos de dados relacionais.
* Os documentos são semelhantes a JSON.
* Os documentos são armazenados em BSON.
* São compostos por pares de chave e valor.
* Tamanho máximo de 16 MB.

###  🔗 Tipos de dados simples

* String
* Número
* Booleano
* Data
* Objeto
* Null

###  🔗 Tipos de dados complexos

* Array
* Documento embutido (embedded document)
* Referência 
* GeoJSON

~~~json
//estrutura de um documento//
{
    _id: ObjectId("5f0b5a7d7d5f5a7d5f5a7d5f"),
    nome: "João",
    idade: 25,
}
~~~


###  🔗 Estrategias de modelagem de dado eficientes e escaláveis

Modelagem orientada por consultas

A modelagem de dados no MongoDB deve ser orientada pelas consultas que serão realizadas com mais frequência.

* Qual é a consulta mais frequente?

* Qual é a consulta mais complexa?

* Qual é a consulta mais lenta?

* Qual é a consulta mais importante?

###  🔗 Inner Document

No mongoDB, é comum denormalizar os dados para evitar operações de junção (join) e melhorar o desempenho das consultas. No mongoDB é comum denormalizar os dados para evitar operações de junção (join) e melhorar o desempenho das consultas.

**Quando Usar?**

* Quando os dados são acessados juntos com frequência.
* Quando os dados não são atualizados com frequência.
* Quando os dados não são muito grandes.
* Os dados aninhados são especificos para o documento pai.
* Os dados aninhados são acessados junto com o documento pai.
* A cardinalidade dos relacionamento é um para um ou um para muitos.

**Quando não usar?**

* Quando os dados são atualizados com frequência.

###  🔗 Operações no MongoDB

**Criando um banco de dados**

~~~mongodb
use nome_do_banco_de_dados
~~~

Enquanto o database não tiver uma collection, ele não será criado.

**Criando uma collection**

~~~mongodb
db.createCollection("nome_da_collection")
~~~

**Inserindo um documento**

~~~mongodb
db.nome_da_collection.insertOne({nome: "João", idade: 25})
~~~

**Consultando um documento**

~~~mongodb
db.usuarios.find()
db.findOne()
db.usuarios.findOneAndDelete()
db.usuarios.findOneAndUpdate()
~~~

**Atualizando um documento**

~~~mongodb
db.usuarios.updateOne()
db.usuarios.updateMany()
db.usuarios.replaceOne()
~~~

**Operadores de update**

* $set
* $unset
* $inc
* $min
* $max
* $mul
* $rename
* $currentDate
* $addToSet
* $pop
etc

**Removendo um documento**

~~~mongodb
db.usuarios.deleteOne()
db.usuarios.deleteMany()
~~~

### 🔗 Consultas simples: Operadores.

**Igualdade: realiza consultas baseadas em uma valor específico para um campo.**

~~~mongodb
db.usuarios.find({idade: 25})
~~~

**Operadores logicos: Realizam consultas baseadas em operações lógicas.**

~~~mongodb
db.usuarios.find({$or: [{idade: 25}, {idade: 30}]})
db.usuarios.find({$and: [{idade: 25}, {idade: 30}]})
db.usuarios.find({$not: [{idade: 25}, {idade: 30}]})
~~~

**Operadores de comparação: Realizam consultas baseadas em operações de comparação.**

- $eq: Igual a
- $gt: Maior que
- $gte: Maior ou igual a
- $in: Igual a qualquer valor especificado em um array
- $lt: Menor que
- $lte: Menor ou igual a
- $ne: Diferente de
- $nin: Diferente de qualquer valor especificado em um array
- $exists: Verifica se o campo existe no documento
- $type: Verifica se o campo é de um tipo específico

**Projeções** 

Definir quais campos devem ser retornados na consulta.

**Ordenação**

Definir a ordem dos documentos retornados na consulta.

**Limites**

Limitar o número de documentos retornados na consulta.

**Paginação**

Definir o número de documentos retornados na consulta e o número de documentos a serem pulados.


## 📌 Redis

### 🔗 O que é o Redis?

É um sistema de armazenamento de dados em memória de alto desempenho.

#### Principais características do Redis

* Armazena os dados em memória.
* Estrutura de dados versátil.
* Operações atômicas.
* Cache de alto desempenho.
* Pub/Sub. (publicação/assinatura)

#### Principais estruturas de dados do Redis

* Cache de dados.
* Filas de mensagens.
* Contadores de acessos e estatísticas em tempo real.
* Sessões de usuários.
* Cache de resultados de consultas em bancos de dados.

#### Principais comandos:

* SET
* GET
* DEL
* INCR
* DECR
* EXIST
* KEYS






