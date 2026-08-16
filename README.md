# 👤 CRUD de Clientes — Spring Boot

Projeto desenvolvido com o objetivo de praticar e demonstrar os principais conceitos de **Java e Spring Boot**, através da criação de uma API REST para gerenciamento de clientes.

A aplicação implementa as operações básicas de um **CRUD (Create, Read, Update e Delete)**, utilizando o banco de dados em memória **H2** e realizando os testes dos endpoints através do **Postman**.

> 📚 Projeto desenvolvido para fins de estudo e portfólio, com foco nos fundamentos do desenvolvimento de APIs REST utilizando Java e Spring Boot.

---

## 🚀 Tecnologias utilizadas

* ☕ **Java**
* 🌱 **Spring Boot**
* 🌐 **Spring Web**
* 🗄️ **Spring Data JPA**
* 💾 **H2 Database**
* 📮 **Postman**
* 🧰 **Lombok**
* 📦 **Maven**

---

## 🎯 Objetivo do projeto

O principal objetivo deste projeto foi colocar em prática conceitos fundamentais do desenvolvimento backend, como:

* Criação de uma API REST;
* Desenvolvimento de endpoints HTTP;
* Implementação de operações CRUD;
* Criação e organização de entidades;
* Persistência de dados utilizando JPA;
* Integração com banco de dados H2;
* Separação de responsabilidades entre Controller, Service e Repository;
* Utilização de `RequestBody` e `RequestParam`;
* Tratamento básico de respostas HTTP;
* Testes dos endpoints utilizando Postman.

---

## 🏗️ Estrutura do projeto

O projeto foi organizado seguindo uma estrutura simples de camadas:

```text
src
└── main
    └── java
        └── com.example.cadastrousuario
            │
            ├── business
            │   └── UsuarioService
            │
            ├── controller
            │   └── UsuarioController
            │
            └── infrastructure
                ├── entitys
                │   └── Usuario
                │
                └── repository
                    └── UsuarioRepository
```

### 📌 Controller

Responsável por receber as requisições HTTP e disponibilizar os endpoints da API.

Exemplos:

```text
POST
GET
PUT
DELETE
```

### 📌 Service

Contém as regras e operações da aplicação, fazendo a comunicação entre o Controller e o Repository.

### 📌 Entity

Representa o cliente que será armazenado no banco de dados.

Exemplo de dados:

```json
{
    "nome": "Jhonatan Zago",
    "email": "jhonatanzago@gmail.com"
}
```

### 📌 Repository

Responsável pela comunicação com o banco de dados através do **Spring Data JPA**.

---

# 🔄 Operações CRUD

A API possui as quatro operações fundamentais de um CRUD.

## 🟢 CREATE — Cadastrar usuario

### Requisição

```http
POST /usuario
```

### Body

```json
{
    "nome": "Jhonatan Zago",
    "email": "jhonatanzago@gmail.com"
}
```

A requisição cria um novo cliente e realiza a persistência dos dados no banco H2.

---

## 🔵 READ — Buscar usuario

### Requisição

```http
GET /usuario?email=jhonatanzago@email.com
```

A aplicação recebe o e-mail como parâmetro e realiza a busca do cliente cadastrado.

### Exemplo de resposta

```json
{
    "id": 1,
    "nome": "Jhonatan Zago",
    "email": "jhonatanzago@gmail.com"
}
```

---

## 🟡 UPDATE — Atualizar usuario

### Requisição

```http
PUT /usuario?id=1
```

### Body

```json
{
    "nome": "Jhonatan Zago"
}
```

A aplicação localiza o cliente através do ID e atualiza os dados enviados.

Também foi implementada uma lógica para permitir a atualização de apenas determinados campos, mantendo os demais dados já cadastrados.

---

## 🔴 DELETE — Excluir usuario

### Requisição

```http
DELETE /usuario?email=jhonatanzago@gmail.com
```

A aplicação localiza o cliente através do e-mail e realiza sua exclusão.

---

# 🗄️ Banco de dados H2

O projeto utiliza o **H2 Database**, um banco de dados leve e em memória, muito utilizado para estudos, testes e desenvolvimento de aplicações Java.

A utilização do H2 permitiu testar a persistência dos clientes sem a necessidade de instalar ou configurar um banco externo.

Durante a execução da aplicação, os dados são armazenados no banco H2.

> ⚠️ Como o H2 está configurado para uso em memória, os dados podem ser perdidos quando a aplicação é encerrada.

---

# 📮 Testes com Postman

Todos os endpoints da API foram testados utilizando o **Postman**.

Foram realizados testes das operações:

| Método   | Endpoint             | Operação          |
| -------- |----------------------| ----------------- |
| `POST`   | `/usuario`           | Cadastrar usuario |
| `GET`    | `/usuario?email=...` | Buscar usuario    |
| `PUT`    | `/usuario?id=...`    | Atualizar usuario |
| `DELETE` | `/usuario?email=...` | Excluir usuario   |

Exemplo do fluxo de testes:

```text
POST
  ↓
Cadastro do cliente
  ↓
GET
  ↓
Consulta do cliente
  ↓
PUT
  ↓
Atualização dos dados
  ↓
DELETE
  ↓
Exclusão do cliente
```

---

# ▶️ Como executar o projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/JhonatanZago/Cadastro-Usuario.git
```

## 2. Entrar na pasta

```bash
cd Cadastrto-Usuario
```

## 3. Executar a aplicação

Caso esteja utilizando Maven:

```bash
mvn spring-boot:run
```

# 🌐 Acessando a API

Após iniciar a aplicação, a API estará disponível localmente em:

```text
http://localhost:8081
```

Os endpoints podem ser testados através do Postman.

---

# 💡 Conceitos praticados

Este projeto foi desenvolvido principalmente para consolidar os seguintes conhecimentos:


Java
 ↓
Programação Orientada a Objetos
 ↓
Spring Boot
 ↓
API REST
 ↓
Controller
 ↓
Service
 ↓
Repository
 ↓
Spring Data JPA
 ↓
H2 Database
```


# 📈 Próximos passos

Apesar de ser um projeto simples, ele pode ser utilizado como base para evoluções futuras.

Algumas possibilidades:

* [ ] Adicionar validações com Bean Validation;
* [ ] Implementar tratamento global de exceções;
* [ ] Criar DTOs;
* [ ] Adicionar paginação;
* [ ] Implementar busca por outros campos;
* [ ] Adicionar documentação com Swagger/OpenAPI;
* [ ] Criar testes automatizados;
* [ ] Migrar o banco H2 para PostgreSQL;
* [ ] Criar autenticação e autorização;
* [ ] Criar uma interface frontend para consumir a API;
* [ ] Containerizar a aplicação utilizando Docker.


# 📌 Sobre o projeto

Este projeto faz parte da minha jornada de aprendizado em desenvolvimento backend com Java e Spring Boot.

A proposta é construir aplicações progressivamente mais completas, utilizando boas práticas de organização, persistência de dados e desenvolvimento de APIs REST.

**Tecnologias principais:** Java • Spring Boot • Spring Data JPA • H2 • Maven • Postman

---

## 👨‍💻 Desenvolvedor

**Jhoantan Zago**

Estudante de Sistemas de Informação e desenvolvedor em formação

🔗 GitHub: https://github.com/JhonatanZago

