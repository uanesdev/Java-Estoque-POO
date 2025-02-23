package br.com.estoque.model;

import java.util.ArrayList;

public class Produto {
    private final String nome;
    private final int codigo;
    private int quantidadeProduto;
    private final ArrayList<EntradaProduto> entradas;

    public Produto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeProduto = 0;
        this.entradas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<EntradaProduto> getEntradas() {
        return entradas;
    }

    public void adiconarEntradaProduto(EntradaProduto entradaProduto) {
        entradas.add(entradaProduto);
    }

    public void setQuantidadeProduto(int quantidade) {
        this.quantidadeProduto += quantidade;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Quantidade do produto: " + quantidadeProduto + ", Quantidade de entradas: " + entradas.size();
    }
}