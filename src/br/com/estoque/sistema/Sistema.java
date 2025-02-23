package br.com.estoque.sistema;

import br.com.estoque.model.EntradaProduto;
import br.com.estoque.model.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private final ArrayList<Produto> produtos;
    private final Scanner scanner;

    public Sistema() {
        produtos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Cadastrar Entrada de Produto");
        System.out.println("4. Listar Entrada de Produto");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void cadatrarProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        Produto produto = _buscarProdutoPorCodigo(codigo);
        if (produto == null) {
            System.out.print("Digite o nome do peoduto: ");
            String nome = scanner.next();
            _adiconarProduto(nome, codigo);
            System.out.println("Produto adiconado com sucesso!");
            System.out.println("------------------------------");
        } else {
            System.out.println("Produto já existe no sistema!");
            System.out.println("-----------------------------");
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto esta registrado no sistema!");
            System.out.println("------------------------------------------");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void cadastrarEntradaProduto() {
        System.out.print("Digite o código do procuto: ");
        int codigo = scanner.nextInt();

        Produto produto = _buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            System.out.print("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            System.out.print("Informe a data(dd/mm/aa): ");
            String data = scanner.next();
            System.out.print("Informe o preço unitário: ");
            double preco = scanner.nextDouble();
            _adiconarEntradaProduto(produto, quantidade, data, preco);
            System.out.println("Entrada de Produto adicionada com sucesso!");
            System.out.println("------------------------------------------");
        } else {
            System.out.println("O produto não foi encontrado, ou não existe no sistema!");
            System.out.println("-------------------------------------------------------");
        }
    }

    public void listarEntradasProduto() {
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        Produto produto = _buscarProdutoPorCodigo(codigo);
        if (produto != null) {
            System.out.println("Entradas do produto " + produto.getNome() + ":");
            for (EntradaProduto entP: produto.getEntradas()) {
                System.out.println(entP);
            }
            System.out.println("--------------------");
        } else {
            System.out.println("O produto não foi encontrado, ou não existe no sistema!");
            System.out.println("-------------------------------------------------------");
        }
    }

    public Produto _buscarProdutoPorCodigo(int codigo) {
        for (Produto produto: produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public void _adiconarProduto(String nome, int codigo) {
        produtos.add(new Produto(nome, codigo));
    }

    public void _adiconarEntradaProduto(Produto produto, int quantidade, String data, double preco) {
            produto.adiconarEntradaProduto(new EntradaProduto(quantidade, data, preco));
            produto.setQuantidadeProduto(quantidade);
    }
}
