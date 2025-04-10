package br.com.paulo.service.produto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.paulo.model.Produto;
import br.com.paulo.service.Cadastravel;

public class CadastroProduto implements Cadastravel<Produto>{
    private final ArrayList<Produto> listaProduto = new ArrayList<>();

    @Override
    public void cadastrar(Produto produto) {
        listaProduto.add(produto);
        System.out.println("Produto cadastrado");
    }

    @Override
    public void listar() {
        System.out.println(listaProduto);
    }

    public void ordenarLista(){
        List<Produto> produtoOrdenados = new ArrayList<>(listaProduto);
        produtoOrdenados.sort(Comparator.comparing(Produto::preco));
        produtoOrdenados.forEach(p -> System.out.println(p.nome() + " - " + p.preco()));
    }

}
