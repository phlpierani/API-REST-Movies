# 🎬 Movie API

Uma API RESTful desenvolvida com Java e Spring Boot para gerenciamento de filmes. A aplicação permite **cadastrar, listar, atualizar e deletar** filmes, utilizando banco de dados relacional e seguindo boas práticas de arquitetura em camadas.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (ou H2 para testes)
- Maven
- Lombok
- Postman (para testes de requisição)

---

## 📚 Funcionalidades

- ✅ Listar todos os filmes
- 🔍 Buscar filme por ID
- ➕ Cadastrar novo filme
- ✏️ Atualizar informações de um filme
- ❌ Deletar filme por ID

---

## 🔗 Endpoints

| Método | Endpoint             | Descrição                     |
|--------|----------------------|-------------------------------|
| GET    | `/movies`            | Lista todos os filmes         |
| GET    | `/movies/{id}`       | Retorna um filme por ID       |
| POST   | `/movies`            | Cadastra um novo filme        |
| PUT    | `/movies/{id}`       | Atualiza os dados de um filme |
| DELETE | `/movies/{id}`       | Remove um filme do sistema    |

---

## ⚙️ Como Rodar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/movie-api.git
   cd movie-api
