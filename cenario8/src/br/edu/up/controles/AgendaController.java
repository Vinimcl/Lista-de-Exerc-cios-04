package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.telas.AgendaView;
import modelos.Contato;
import modelos.ContatoComercial;
import modelos.ContatoPessoal;

public class AgendaController {
    private List<Contato> contatos;
    private AgendaView telas;

    public AgendaController() {
        contatos = new ArrayList<>();
        telas = new AgendaView();
    }

    public void incluirContatoPessoal() {
        ContatoPessoal contatoPessoal = new ContatoPessoal();
        contatoPessoal.setNome(telas.lerNome());
        contatoPessoal.setTelefone(telas.lerTelefone());
        contatoPessoal.setEndereco(telas.lerEndereco());
        contatos.add(contatoPessoal);
    }

    public void incluirContatoComercial() {
        ContatoComercial contatoComercial = new ContatoComercial();
        contatoComercial.setNome(telas.lerNome());
        contatoComercial.setTelefone(telas.lerTelefone());
        contatoComercial.setEmpresa(telas.lerEmpresa());
        contatos.add(contatoComercial);
    }


    public void iniciar() {
        int opcao;
        do {
            opcao = telas.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }
}
