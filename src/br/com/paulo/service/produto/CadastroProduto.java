package br.com.paulo.service.produto;

import java.util.ArrayList;
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
        produtoOrdenados.sort(Comparator.comparing(Produto::preco)); //Ordena com base no PREÇO SO PRODUTO
        produtoOrdenados.forEach(p -> System.out.println( p.nome() + " - " + p.preco() ) );
    }

    public String buscarProduto(String nomeProduto){
        for (Produto produto: listaProduto){
            if (produto.nome().equalsIgnoreCase(nomeProduto)){
               return "Nome: " + produto.nome() + "\nPreço: " + produto.preco();
            }
        }
        return "Produto com o nome '" + nomeProduto +"' não encontrado";
    }

}
