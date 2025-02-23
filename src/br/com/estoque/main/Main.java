package br.com.estoque.main;

import br.com.estoque.sistema.Sistema;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            sistema.exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistema.cadatrarProduto();
                    break;

                case 2:
                    sistema.listarProdutos();
                    break;

                case 3:
                    sistema.cadastrarEntradaProduto();
                    break;

                case 4:
                    sistema.listarEntradasProduto();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }

        } while (opcao != 5);

        scanner.close();
    }

}