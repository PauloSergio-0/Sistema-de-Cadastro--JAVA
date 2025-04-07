package br.com.paulo.service;

import java.util.ArrayList;
import br.com.paulo.model.Produto;

public class CadastroProduto implements Cadastravel<Produto> {
    private final ArrayList<Produto> listaProduto = new ArrayList<>();

    @Override
    public void Cadastrar(Produto produto) {
        listaProduto.add(produto);
        System.out.println("Produto cadastrado");
    }

    @Override
    public void Listar() {
        System.out.println(listaProduto);
    }
}
