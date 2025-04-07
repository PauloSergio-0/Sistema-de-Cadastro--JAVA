package br.com.paulo.service;

import br.com.paulo.model.Cliente;

import java.util.ArrayList;

public class CadastroCliente implements Cadastravel<Cliente>{
    private final ArrayList<Cliente> listaCliente = new ArrayList<>();



    @Override
    public void Cadastrar(Cliente cliente) {
        listaCliente.add(cliente);
        System.out.println("Cliente Cadastrado");
    }

    @Override
    public void Listar() {
        System.out.println(listaCliente);
    }
}

