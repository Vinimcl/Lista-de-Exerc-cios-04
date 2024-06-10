// Pasta: controller/ClienteController.java
package br.edu.up.controles;

import java.util.HashMap;

import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.telas.ClienteView;

public class ClienteController {
    private HashMap<String, Cliente> clientes;
    private ClienteView view;

    public ClienteController() {
        clientes = new HashMap<>();
        view = new ClienteView();
    }

    public void incluirClientePessoa() {
        String nome = view.lerNomeCliente();
        ClientePessoa cliente = new ClientePessoa(nome);
        clientes.put(nome, cliente);
        System.out.println("Cliente pessoa adicionado com sucesso!");
    }

    public void incluirClienteEmpresa() {
        String nome = view.lerNomeCliente();
        ClienteEmpresa cliente = new ClienteEmpresa(nome);
        clientes.put(nome, cliente);
        System.out.println("Cliente empresa adicionado com sucesso!");
    }

    public void mostrarDadosClientePessoa() {
        String nome = view.lerNomeCliente();
        Cliente cliente = clientes.get(nome);
        if (cliente instanceof ClientePessoa) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Valor emprestado: R$ " + cliente.getVlrEmprestado());
        } else {
            System.out.println("Cliente não encontrado ou não é uma pessoa.");
        }
    }

    // Métodos para emprestar e devolver dinheiro...

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirClientePessoa();
                    break;
                case 2:
                    incluirClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                // Implementar os outros casos...
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }
}
