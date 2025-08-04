# 📚 Anotações da Aula

**Disciplina:**  Design e Arquitetura de Software  
**Professor(a):**  Walter Silvestre Coan  
**Data:**  01/08/2025  

---

# 🧱 Abstrações em Arquitetura de Software Orientada a Objetos

No design de software orientado a objetos, utilizamos diversas **camadas e abstrações** para organizar responsabilidades, promover baixo acoplamento, alta coesão e facilitar a manutenção e testes. Abaixo estão as principais abstrações do modelo: `Entity`, `Repository`, `Service` e `Controller`.

---

## 📦 1. Entity (Entidade)

- **O que é:** Representa um objeto do domínio com identidade e comportamento próprios.
- **Objetivo:** Modelar os dados e regras de negócio fundamentais.
- **Exemplo:** `User`, `Order`, `Product`
- **Características:**
  - Contém atributos e métodos do domínio.
  - Não lida com persistência diretamente.
  - Tem identidade (ex: `id`).

---

## 💾 2. Repository (Repositório)

- **O que é:** Abstração para acesso a dados.
- **Objetivo:** Isolar a lógica de persistência (banco de dados, API externa etc.).
- **Responsabilidade:** Recuperar, armazenar, atualizar e deletar entidades.
- **Exemplo de métodos:**
  - `findById(id)`
  - `save(entity)`
  - `delete(entity)`

🔧 **Vantagens:**
- Esconde detalhes da infraestrutura.
- Facilita testes (ex: uso de mocks).
- Trocável (ex: de SQL para NoSQL sem mudar o restante do sistema).

---

## ⚙️ 3. Service (Serviço)

- **O que é:** Camada onde mora a lógica de negócio da aplicação.
- **Objetivo:** Orquestrar operações complexas e aplicar regras que envolvam uma ou mais entidades.
- **Exemplo:** `UserService.registerUser(data)`

🧠 **Responsabilidade:**
- Contém a lógica que *não pertence diretamente à entidade*.
- Faz validações, chamadas a repositórios, e interage com outros serviços.

---

## 🌐 4. Controller (Controlador)

- **O que é:** Ponto de entrada da aplicação (ex: camada HTTP em uma API).
- **Objetivo:** Receber requisições do usuário, delegar ao serviço e retornar respostas.
- **Responsabilidade:**
  - Interpretar requisições (ex: JSON, parâmetros).
  - Chamar o serviço correto.
  - Devolver uma resposta adequada (ex: JSON, status code).

🚫 **Importante:** Não deve conter lógica de negócio!

---

## 🎯 Objetivo do Modelo

Esse modelo segue o padrão de **arquitetura em camadas**, com foco em:

- ✅ Separação de responsabilidades (**SoC**)
- ✅ Baixo acoplamento e alta coesão
- ✅ Testabilidade e manutenibilidade
- ✅ Escalabilidade do sistema

---

### 🔹 Exemplos Práticos

Este modelo foi aplicado na disciplina de **Fábrica de Software**. Você pode conferir a implementação e os exemplos práticos no meu repositório no GitHub:

[https://github.com/igorhnq/fabsoftb-igor-thiago](https://github.com/igorhnq/fabsoftb-igor-thiago)

---

