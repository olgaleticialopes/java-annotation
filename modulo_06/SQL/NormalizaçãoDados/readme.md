## 📌 Normalização de Dados

**Problema**

| id | nome | endereco |
|----|------|----------|
| 1  | João | Rua A    |
| 2  | Maria| Rua B    |
| 3  | José | Rua C    |

Normalização de dados: É um processo de organização de dados em um banco de dados. O objetivo é projetar um esquema de banco de dados que evite problemas como inserção, atualização e exclusão de dados.

### Formas Normais

* Primeira Forma Normal (1FN)
 A 1FN estabelece que cada valor em uma tabela deve ser atômico, ou seja, não pode ser dividido em partes menores. Cada linha deve ser única. Não pode haver linhas duplicadas.

 <img align=center src="https://cdn.discordapp.com/attachments/1020872567738863716/1153746768706674840/image.png">

* Segunda Forma Normal (2FN)
    A 2FN estabelece que cada coluna deve depender da chave primária. Não pode haver dependência funcional transitiva.
    Todos os atributos não-chave devem depender totalmente da chave primária.
    


* Terceira Forma Normal (3FN)
    A 3FN estabelece que cada coluna deve depender apenas da chave primária. Não pode haver dependência funcional transitiva.
    Todos os atributos não-chave devem depender totalmente da chave primária.
    

Resumo: 

* 1FN: Cada valor em uma tabela deve ser atômico, ou seja, não pode ser dividido em partes menores. Cada linha deve ser única. Não pode haver linhas duplicadas.
* 2FN: Cada coluna deve depender da chave primária. Não pode haver dependência funcional transitiva.
* 3FN: Cada coluna deve depender apenas da chave primária. Não pode haver dependência funcional transitiva.

