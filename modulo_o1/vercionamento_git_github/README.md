# 📓  Aula 1: Versionamento de código com Git e Github.

# 🔗 Conceitos basicos

* Vercionamento de código - Controle de versões de um arquivo/projeto.
* GIT - Sistema de controle de versão distribuido.
* GITHUB - Plataforma de hospedagem de codígo para controle de versão com git, e colaborações.

<br>

# 📌 Vercionamento de codígo

<h3>O que é: </h3> 

Sistema de controle de versão, registra o histórico de atualizações de um arquivo e gerência quais foram as alterações, como data, autor etc. Ajudando na organização, controle e segurança; 

### Tipos de sistemas de controle de versão: 

* VCS  CentralizadO (CVSC):<br>
como o subversion, usa um servidor para o armazenamento, o servidor é compartilhado com todas as pessoas do projeto;
* VCS Distribuido (DVSC):<br>
como o github, Onde é criado um banco de versões local, onde casa pessoa tem uma cópia de todos os arquivos na sua máquina 

# 📌 GIT

<h3>O que é: </h3> 

### Sistema de controle de versão distribuido.

* Gratuito e open source (código aberto).
* Ramificações (branching) e fusões (merging) eficientes.
* Leve e rápido.

## Fluxo básico do git: 

* Git clone:<br>
Clona um repositorio Git existente para um novo diretório (pasta) local.

~~~git
git clone
 ~~~

  * Git commit: <br>
  Grava as alterações no repositorio.

~~~git
git commit
 ~~~
  

   * Git pull:<br>
   "Puxa" as alterações do repositorio remoto para o local.

~~~git
git pull
 ~~~

  
   * Git push: <br>
   "Empurra" as alterações do repositorio local para o remoto.

~~~git
git pull
 ~~~

* Git pull:<br>
   "Puxa" as alterações do repositorio remoto para o local (busca e mescla).

~~~git
git pull
 ~~~

# 📌 GITHUB

<h3>O que é: </h3> 

### Plataforma de hospedagem de codígo para controle de versão com git, e colaborações.


* Comunidade ativa.
* Utilizado mundialmente.
* Mascote "octocat".

#  Diferença GIT e GITHUB


  <img  src="https://media.discordapp.net/attachments/1098139264258158602/1142756752358641714/image.png?width=982&height=551"/>

  # 📌 CONFIGURANDO O GIT 
  

<h3> Configurando seu nome de usuario e email globalmente: </h3> <br>

~~~git
git config --global user.name "Nome Sobrenome"
 ~~~

~~~git
git config --global user.email "Seuemail@email.com
 ~~~

* Mostra todas as suas configurações globais. 
~~~git
git config --global -- list
 ~~~
<h3> Configurando o nome da branch padrão: </h3> <br>

~~~git
git config --global init.defaultBranch main
 ~~~


  # 📌 Autenticações


  * <h3>Via token: </h3>  

  Para gerar um token, acesse sua conta e siga as instruções: <br>
  
   settings -> developer settings -> tokens(classic) ->generate new token.

  * <h3>Armazenando credenciais: </h3>  

  Você pode armazenar suas credenciais para diminuir o numero de vezes que você informa seu usuario e senha. 

   <img  src="https://media.discordapp.net/attachments/1098139264258158602/1142760464409960458/image.png?width=998&height=252"/>

  * <h3>Autenticando via chave SSH: </h3>  
  
   Para adicionar uma chave SSH, acesse sua conta e siga as instruções: <br>

  settings -> ssh and gpg keys -> new ssh key.

  <img  src="https://media.discordapp.net/attachments/1098139264258158602/1142761529192759336/image.png?width=647&height=216"/>












  

