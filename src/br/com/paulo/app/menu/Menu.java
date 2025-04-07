package br.com.paulo.app.menu;

import br.com.paulo.model.Cliente;
import br.com.paulo.model.Produto;
import br.com.paulo.service.CadastroCliente;
import br.com.paulo.service.CadastroProduto;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static final CadastroCliente clientes = new CadastroCliente();
    private static final CadastroProduto produtos = new CadastroProduto();

    public static void menu() {

        while (true){

            System.out.println("""
                    \s
                        === MENU PRINCIPAL ====
                        1 - Cadastrar cliente
                        2 - Cadastrar produto
                        3 - Listar clientes
                        4 - Listar produtos
                        5 - Listar produtos por preço (ordem crescente)
                        6 - Filtrar clientes com email @gmail.com
                        7 - Buscar produto por nome
                        0 - Sair
                    \s""");

            int opcao = scanner.nextInt();
            scanner.nextLine();


            if (opcao == 0){
                System.out.println("Saindo do Sistema.......");
                break;

            } else if (opcao == 1) {
                clientes.Cadastrar(CriarCliente());

            } else if (opcao == 2) {
                clientes.Listar();

            } else if (opcao == 3) {
                produtos.Cadastrar(CriarProduto());

            } else if (opcao == 4) {
                produtos.Listar();
            }


        }
    }

    private static Cliente CriarCliente(){
        System.out.println("Nome Cliente: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail Cliente: ");
        String email = scanner.nextLine();

        return new Cliente(nome, email);
    }

    private static Produto CriarProduto(){
        System.out.println("Nome Produto: ");
        String nome = scanner.nextLine();

        System.out.println("Preço Produto: ");
        Double preco = scanner.nextDouble();

        return new Produto(nome, preco);
    };
}
