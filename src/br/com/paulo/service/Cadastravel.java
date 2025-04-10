package br.com.paulo.service;

import br.com.paulo.model.Cliente;

public interface Cadastravel<T> {

    void cadastrar(T object);

    void listar();
}
