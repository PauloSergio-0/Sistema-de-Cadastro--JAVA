package br.com.paulo.service.cliente;

import br.com.paulo.model.Cliente;
import br.com.paulo.service.Cadastravel;

import java.util.ArrayList;

public class CadastroCliente implements Cadastravel<Cliente> {
    private final ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();



    @Override
    public void cadastrar(Cliente cliente) {
        listaCliente.add(cliente);
        System.out.println("Cliente Cadastrado");
    }

    @Override
    public void listar() {
        System.out.println(listaCliente);
    }

    public void buscarEmail(String dominioEmail) {
        System.out.println("---Clientes Gmail---");
        for(Cliente cliente: listaCliente) {
            if(cliente.email().endsWith(dominioEmail)){
                System.out.println("Nome: " + cliente.nome() + "\nE-mail: "+ cliente.email());
            }
        }
    }

}

