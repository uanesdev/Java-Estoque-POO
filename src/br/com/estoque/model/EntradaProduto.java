package br.com.estoque.model;

public record EntradaProduto(int quantidade, String data, double preco) {

    @Override
    public String toString() {
        return "Data - " + data + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}
