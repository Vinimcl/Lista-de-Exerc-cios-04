
// ContatosController.java
import java.util.ArrayList;
import java.util.List;

public class ContatosController {
    private ContatosView view;
    private List<Contato> agenda;

    public ContatosController(ContatosView view) {
        this.view = view;
        this.agenda = new ArrayList<>();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    view.mostrarMensagem("Encerrando o programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private void incluirContatoPessoal() {
        String bairro = view.lerString("Digite o bairro: ");
        String cep = view.lerString("Digite o cep: ");
        String nomeCidade = view.lerString("Digite o nome da cidade: ");
        String UF = view.lerString("Digite a UF da cidade: ");
        String CPF = view.lerString("Digite o CPF: ");
        double peso = view.lerDouble("Digite o peso: ");
        double altura = view.lerDouble("Digite a altura: ");
        double credito = view.lerDouble("Digite o crédito: ");

        Cidade cidade = new Cidade(nomeCidade, UF);
        ClientePessoa contato = new ClientePessoa(bairro, cep, cidade, CPF, peso, altura, credito);
        agenda.add(contato);

        view.mostrarMensagem("Contato pessoal incluído com sucesso!");
    }

private void incluirContatoComercial() {
        String bairro = view.lerString("Digite o bairro: ");
        String cep =
