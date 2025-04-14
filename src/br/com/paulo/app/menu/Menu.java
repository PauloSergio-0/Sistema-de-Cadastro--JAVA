package br.com.paulo.app.menu;

import br.com.paulo.model.Cliente;
import br.com.paulo.model.Produto;
import br.com.paulo.service.cliente.CadastroCliente;
import br.com.paulo.service.produto.CadastroProduto;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static final CadastroCliente clientes = new CadastroCliente();
    private static final CadastroProduto produtos = new CadastroProduto();

    public static void menu() {

        while (true) {

            System.out.println("""
                    \s
                        === MENU PRINCIPAL ====
                        1 - Cadastrar cliente
                        2 - Cadastrar produto
                        3 - listar clientes
                        4 - listar produtos
                        5 - listar produtos por preço (ordem crescente)
                        6 - Filtrar clientes com email @gmail.com
                        7 - Buscar produto por nome
                        0 - Sair
                    \s""");

            int opcao = -1;

            try {
                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.err.println("Erro na entrada de dados(Apenas números)!!"  );
                scanner.nextLine();
            }


            if (opcao == 0) {
                System.out.println("Saindo do Sistema.......");
                break;

            } else if (opcao == 1) {
                clientes.cadastrar(criarCliente());

            } else if (opcao == 2) {
                produtos.cadastrar(criarProduto());

            } else if (opcao == 3) {
                clientes.listar();

            } else if (opcao == 4) {
                produtos.listar();
            } else if (opcao == 5) {
                produtos.ordenarLista();
            } else if (opcao == 6) {
                clientes.buscarEmail("@gmail.com");
            } else if (opcao == 7) {
                System.out.println(produtos.buscarProduto(nomeProduto()));
            } else {
                System.out.println("Opção não encontrada");
            }


        }
    }

    private static Cliente criarCliente(){
        System.out.println("Nome Cliente: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail Cliente: ");
        String email = scanner.nextLine();

        return new Cliente(nome, email);
    }

    private static Produto criarProduto(){
        System.out.println("Nome Produto: ");
        String nome = scanner.nextLine().trim();

        System.out.println("Preço Produto: ");
        double preco = scanner.nextDouble();

        return new Produto(nome, preco);
    }

    private static String nomeProduto(){
        System.out.println("Nome Produto: ");
        return  scanner.nextLine().trim();
    }
}
