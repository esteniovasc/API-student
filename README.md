# API-students
- Esta é uma API pensada para ser consumida no projeto [Gestão Escolar](https://github.com/esteniovasc/GestaoEscolar)
- Foi implementado os tradicionais endpoints CRUD (Create, Read, Update, Delete) com os respectivos métodos HTTP: ...
- A API trabalha inicialmente com a entidade "Student", realizando operações como se fosse um aluno real no sistema

## Por onde foi baseado, o que foi utilizado e qual o passo a passo
- Esta API tem como base o seguinte tutorial: [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql)

- Foi inicializado um projeto no [Spring Initializr](https://start.spring.io/) com as seguintes dependências: Spring Web, Spring Data JPA, MySQL Driver, Docker Compose Support, e Testcontainers
- O banco de dados utilizado foi uma versão do MySQL rodando pelo Docker
- Após o Docker estar aberto, basta executar o pré projeto que já vai iniciar o container
- Para as informações serem adicionadas ao banco de dados, é preciso manipular o banco por meio da linha de comando:

Entrando no docker:
```
docker exec -it nome_do_container bash
mysql -u root -p -h localhost
use nome_do_banco;
comandos sql;
```

## O que esperar dos endpoints
- em desenvolvimento
