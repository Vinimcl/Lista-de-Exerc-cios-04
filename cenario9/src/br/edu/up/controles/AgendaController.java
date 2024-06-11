package br.edu.up.controles;

// AgendaController.java
import java.util.HashMap;

import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.Endereco;
import br.edu.up.telas.AgendaView;

public class AgendaController {
    private HashMap<String, ClientePessoa> clientesPessoa;
    private HashMap<String, ClienteEmpresa> clientesEmpresa;
    private AgendaView view;

    public AgendaController() {
        clientesPessoa = new HashMap<>();
        clientesEmpresa = new HashMap<>();
        view = new AgendaView();
    }

    public void incluirClientePessoa() {
        String nome = view.lerNome();
        String telefone = view.lerTelefone();
        String email = view.lerEmail();
        String rua = view.lerRua();
        String numero = view.lerNumero();
        String bairro = view.lerBairro();
        String cep = view.lerCEP();
        String cidade = view.lerCidade();
        String CPF = view.lerCPF();
        double peso = view.lerPeso();
        double altura = view.lerAltura();
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        ClientePessoa cliente = new ClientePessoa(nome, telefone, email, endereco, 10000, CPF, peso, altura);
        clientesPessoa.put(CPF, cliente);
        System.out.println("Cliente pessoa adicionado com sucesso!");
    }

    public void incluirClienteEmpresa() {
        String nome = view.lerNome();
        String telefone = view.lerTelefone();
        String email = view.lerEmail();
        String rua = view.lerRua();
        String numero = view.lerNumero();
        String bairro = view.lerBairro();
        String cep = view.lerCEP();
        String cidade = view.lerCidade();
        String CNPJ = view.lerCNPJ();
        String inscEstadual = view.lerInscEstadual();
        int anoFundacao = view.lerAnoFundacao();
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        ClienteEmpresa cliente = new ClienteEmpresa(nome, telefone, email, endereco, 25000, CNPJ, inscEstadual,
                anoFundacao);
        clientesEmpresa.put(CNPJ, cliente);
        System.out.println("Cliente empresa adicionado com sucesso!");
    }

    public void mostrarDadosClientePessoa() {
        String CPF = view.lerCPF();
        ClientePessoa cliente = clientesPessoa.get(CPF);
        if (cliente != null) {
            System.out.println(cliente.getDados());
        } else {
            System.out.println("Cliente pessoa não encontrado!");
        }
    }

    public void mostrarDadosClienteEmpresa() {
        String CNPJ = view.lerCNPJ();
        ClienteEmpresa cliente = clientesEmpresa.get(CNPJ);
        if (cliente != null) {
            System.out.println(cliente.getDados());
        } else {
            System.out.println("Cliente empresa não encontrado!");
        }
    }

    public void emprestarParaClientePessoa() {
        String CPF = view.lerCPF();
        ClientePessoa cliente = clientesPessoa.get(CPF);
        if (cliente != null) {
            double valor = view.lerValor();
            cliente.emprestar(valor);
        } else {
            System.out.println("Cliente pessoa não encontrado!");
        }
    }

    public void emprestarParaClienteEmpresa() {
        String CNPJ = view.lerCNPJ();
        ClienteEmpresa cliente = clientesEmpresa.get(CNPJ);
        if (cliente != null) {
            double valor = view.lerValor();
            cliente.emprestar(valor);
        } else {
            System.out.println("Cliente empresa não encontrado!");
        }
    }

    public void devolverClientePessoa() {
        String CPF = view.lerCPF();
        ClientePessoa cliente = clientesPessoa.get(CPF);
        if (cliente != null) {
            double valor = view.lerValor();
            double valorDevolvido = cliente.devolver(valor);
            System.out.println("Valor devolvido: " + valorDevolvido);
        } else {
            System.out.println("Cliente pessoa não encontrado!");
        }
    }

    public void devolverClienteEmpresa() {
        String CNPJ = view.lerCNPJ();
        ClienteEmpresa cliente = clientesEmpresa.get(CNPJ);
        if (cliente != null) {
            double valor = view.lerValor();
            double valorDevolvido = cliente.devolver(valor);
            System.out.println("Valor devolvido: " + valorDevolvido);
        } else {
            System.out.println("Cliente empresa não encontrado!");
        }
    }

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
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarParaClientePessoa();
                    break;
                case 6:
                    emprestarParaClienteEmpresa();
                    break;
                case 7:
                    devolverClientePessoa();
                    break;
                case 8:
                    devolverClienteEmpresa();
                    break;
                case 9:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }
}
