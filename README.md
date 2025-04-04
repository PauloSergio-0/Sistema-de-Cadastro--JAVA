# 🧠 Atividade Java: Sistema de Cadastro com Records, POO e Interfaces

> ⚠️ Esta atividade foi gerada com o apoio de uma inteligência artificial, mas a **concepção do código e sua implementação foi feita por mim, o programador**.

## 💡 Objetivo

Desenvolver um sistema simples de gerenciamento de **clientes** e **produtos**, aplicando os seguintes conceitos da linguagem Java:

- `record` (para representação de dados imutáveis),
- Programação Orientada a Objetos (POO),
- `interface` (para padronização de comportamento),
- E um **desafio extra** com funcionalidades avançadas como ordenação, filtros e buscas.

---

## 📦 Estrutura Esperada

### 1. **Records de Dados**
Crie dois `record`s para representar os dados de cliente e produto:

```java
package model;

public record Cliente(String nome, String email) {}
```

```java
package model;

public record Produto(String nome, double preco) {}
```

---

### 2. **Interface: `Cadastravel`**
Essa interface define métodos comuns para qualquer entidade que possa ser cadastrada:

```java
package service;

public interface Cadastravel {
    void cadastrar();
    void listar();
}
```

---

### 3. **Classes Concretas que implementam `Cadastravel`**

#### `CadastroCliente`
- Deve manter uma lista de clientes (`List<Cliente>`).
- Implementar os métodos `cadastrar()` e `listar()`.

```java
package service;

import model.Cliente;
import java.util.*;

public class CadastroCliente implements Cadastravel {
    private List<Cliente> clientes = new ArrayList<>();

    // Implementações de cadastrar() e listar()
}
```

#### `CadastroProduto`
- Deve manter uma lista de produtos (`List<Produto>`).
- Implementar os métodos `cadastrar()` e `listar()`.

```java
package service;

import model.Produto;
import java.util.*;

public class CadastroProduto implements Cadastravel {
    private List<Produto> produtos = new ArrayList<>();

    // Implementações de cadastrar() e listar()
}
```

---

### 4. **Classe Principal (`Main`)**
Deve conter um menu interativo utilizando `Scanner`, com as seguintes opções:

```
1 - Cadastrar cliente
2 - Cadastrar produto
3 - Listar clientes
4 - Listar produtos
5 - Listar produtos por preço (ordem crescente)
6 - Filtrar clientes com email @gmail.com
7 - Buscar produto por nome
0 - Sair
```

```java
package app;

import service.*;

public class Main {
    public static void main(String[] args) {
        // Lógica do menu aqui
    }
}
```

---

## 🧩 Desafio Extra (opcional, mas recomendado)

Implemente uma ou mais das funcionalidades abaixo:

1. ✅ **Ordenar os produtos por preço em ordem crescente.**
2. ✅ **Filtrar clientes que tenham email terminando com `@gmail.com`.**
3. ✅ **Buscar produtos pelo nome (ex: usuário digita "celular", retorna todos os produtos com "celular" no nome).**

---

## 📁 Organização dos Arquivos (com pacotes)

```
src/
│
├── app/
│   └── Main.java
│
├── model/
│   ├── Cliente.java
│   └── Produto.java
│
└── service/
    ├── Cadastravel.java
    ├── CadastroCliente.java
    └── CadastroProduto.java
```

---

## 🎯 Regras

- Utilize boas práticas de programação.
- Faça validações básicas (como não cadastrar clientes com email vazio).
- Utilize o conceito de **imutabilidade** nos `record`s.
- Utilize POO de forma clara e organizada.

---

## ✅ Exemplo de Execução

```bash
=== MENU PRINCIPAL ===
1 - Cadastrar cliente
2 - Cadastrar produto
3 - Listar clientes
4 - Listar produtos
5 - Listar produtos por preço (ordem crescente)
6 - Filtrar clientes com email @gmail.com
7 - Buscar produto por nome
0 - Sair
```

---

## 🏁 Dica Final

Você pode expandir esse sistema futuramente adicionando persistência com arquivos, integração com banco de dados, ou até uma interface gráfica com JavaFX.

Boa sorte e bora codar! 🚀

