# Sistema de Gerenciamento de Estoque

## Índice
1. [Introdução](#introdução)
2. [Funcionalidades](#funcionalidades)
3. [Estrutura do Projeto](#estrutura-do-projeto)
4. [Classes e Métodos](#classes-e-métodos)
5. [Como Executar](#como-executar)
6. [Contribuição](#contribuição)
7. [Licença](#licença)

---

## Introdução
Este projeto é um sistema de gerenciamento de estoque desenvolvido em Java, com o objetivo de aplicar conceitos de Programação Orientada a Objetos (POO). Ele foi criado como parte de um estudo para reforçar conhecimentos em Java e POO, além de servir como uma atividade prática para a cadeira de Laboratório de Programação.

O sistema permite:
- Cadastrar produtos.
- Registrar entradas de produtos no estoque.
- Listar produtos e suas entradas.
- Gerenciar a quantidade de produtos disponíveis.

---

## Funcionalidades
O sistema oferece as seguintes funcionalidades:
1. **Cadastrar Produto**: Permite cadastrar um novo produto com nome e código.
2. **Listar Produtos**: Exibe todos os produtos cadastrados no sistema.
3. **Cadastrar Entrada de Produto**: Registra uma entrada de produto no estoque, com quantidade, data e preço unitário.
4. **Listar Entradas de Produto**: Exibe todas as entradas registradas para um produto específico.
5. **Sair**: Encerra o sistema.

---

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

### Pacote `br.com.estoque.model`
- **`EntradaProduto`**: Representa uma entrada de produto no estoque, com quantidade, data e preço.
- **`Produto`**: Representa um produto no estoque, com nome, código, quantidade disponível e uma lista de entradas.

### Pacote `br.com.estoque.sistema`
- **`Sistema`**: Gerencia a interação com o usuário e controla as operações do sistema, como cadastro de produtos e entradas.

---

## Classes e Métodos

### Classe `EntradaProduto`
- **Atributos**:
  - `quantidade` (int): Quantidade de produtos entrados.
  - `data` (String): Data da entrada.
  - `preco` (double): Preço unitário do produto.
- **Métodos**:
  - `toString()`: Retorna uma representação textual da entrada de produto.

### Classe `Produto`
- **Atributos**:
  - `nome` (String): Nome do produto.
  - `codigo` (int): Código único do produto.
  - `quantidadeProduto` (int): Quantidade disponível do produto.
  - `entradas` (ArrayList<EntradaProduto>): Lista de entradas do produto.
- **Métodos**:
  - `getNome()`, `getCodigo()`, `getEntradas()`: Métodos de acesso aos atributos.
  - `adiconarEntradaProduto(EntradaProduto entradaProduto)`: Adiciona uma entrada à lista de entradas do produto.
  - `setQuantidadeProduto(int quantidade)`: Atualiza a quantidade disponível do produto.
  - `toString()`: Retorna uma representação textual do produto.

### Classe `Sistema`
- **Atributos**:
  - `produtos` (ArrayList<Produto>): Lista de produtos cadastrados.
  - `scanner` (Scanner): Objeto para leitura de entrada do usuário.
- **Métodos**:
  - `exibirMenu()`: Exibe o menu principal do sistema.
  - `cadatrarProduto()`: Cadastra um novo produto.
  - `listarProdutos()`: Lista todos os produtos cadastrados.
  - `cadastrarEntradaProduto()`: Registra uma entrada de produto no estoque.
  - `listarEntradasProduto()`: Lista as entradas de um produto específico.
  - `_buscarProdutoPorCodigo(int codigo)`: Busca um produto pelo código.
  - `_adiconarProduto(String nome, int codigo)`: Adiciona um novo produto à lista.
  - `_adiconarEntradaProduto(Produto produto, int quantidade, String data, double preco)`: Adiciona uma entrada de produto ao estoque.

---

## Como Executar
1. **Pré-requisitos**:
   - Java JDK 21 ou superior.
   - IDE de sua preferência (ex.: IntelliJ, Eclipse) ou terminal.

2. **Passos**:
   - Clone o repositório:
     ```bash
     git clone https://github.com/uanesdev/Java-Estoque-POO
     ```
   - Abra o projeto na sua IDE ou compile via terminal:
     ```bash
     javac -d bin src/br/com/estoque/sistema/Sistema.java
     ```
   - Execute o sistema:
     ```bash
     java -cp bin br.com.estoque.sistema.Sistema
     ```

3. **Uso**:
   - Siga as instruções do menu para cadastrar produtos, registrar entradas e listar informações.

---

## Licença
Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).

---
