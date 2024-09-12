# API-students
- Esta é uma API pensada para ser consumida no projeto [Gestão Escolar](https://github.com/esteniovasc/GestaoEscolar)
- Foi implementado os tradicionais endpoints CRUD (Create, Read, Update, Delete) com os respectivos métodos HTTP: Get, Post, Put, Delete.
- A API trabalha inicialmente com a entidade "Student", realizando operações como se fosse um aluno real no sistema

## Por onde foi baseado, o que foi utilizado e qual o passo a passo
- Esta API tem como base o seguinte tutorial: [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql)
- Foi inicializado um projeto no [Spring Initializr](https://start.spring.io/) com as seguintes dependências: Spring Web, Spring Data JPA, MySQL Driver, Docker Compose Support, e Testcontainers
- O banco de dados utilizado foi uma versão do MySQL rodando pelo Docker
- Após o Docker estar aberto, basta executar o pré-projeto que já vai subir o container
- Para as informações serem adicionadas ao banco de dados, é preciso manipular o banco por meio da linha de comando:

Entrando no docker:
```
docker exec -it nome_do_container bash
mysql -u root -p -h localhost
use nome_do_banco;
comandos sql;
```

Depois que preparar a tabela no MySQL do Docker, pode realizar as operações nos dados.

## O que esperar dos endpoints
- GET http://localhost:8080/students/all/       -> Retorna todos os estudantes
- GET http://localhost:8080/students/all/{id}   -> Retorna o estudante pelo ID

- POST http://localhost:8080/students/add?name=NomeAluno&turma=NomeTurma   -> Adiciona um novo aluno passando os parâmetro de Nome e Turma do estudante

- PUT http://localhost:8080/students/update/{id}?name=NovoNome&turma=NovaTurma   -> Atualiza dados de um ID já existente

- DELETE http://localhost:8080/students/delete/{id}   -> Deleta um estudante pelo ID

### Screenshots

![Teste pelo Postman](https://i.ibb.co/zsTzdRh/Captura-de-tela-2024-09-12-182136.png)
![Consumindo a API pelo Gestão Escolar](https://i.ibb.co/Kh5p853/Captura-de-tela-2024-09-12-182104.png)
