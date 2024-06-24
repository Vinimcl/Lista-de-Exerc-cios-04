
public class Controller {
    private Agenda agenda;
    private View view;

    public Controller(Agenda agenda, View view) {
        this.agenda = agenda;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    adicionarContatoPessoal();
                    break;
                case 2:
                    adicionarContatoComercial();
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
                    view.mostrarMensagem("Saindo do programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private void adicionarContatoPessoal() {
        Contato contato = view.lerContato();
        String aniversario = view.lerAniversario();
        ContatoPessoal pessoal = new ContatoPessoal(contato.getCodigo(), contato.getNome(), contato.getTelefone(),
                aniversario);
        agenda.adicionarContato(pessoal);
        view.mostrarMensagem("Contato pessoal adicionado com sucesso.");
    }

    private void adicionarContatoComercial() {
        Contato contato = view.lerContato();
        System.out.print("Digite o CNPJ: ");
        String cnpj = view.lerCnpj();
        ContatoComercial comercial = new ContatoComercial(contato.getCodigo(), contato.getNome(), contato.getTelefone(),
                cnpj);
        agenda.adicionarContato(comercial);
        view.mostrarMensagem("Contato comercial adicionado com sucesso.");
    }

    private void excluirContato() {
        int codigo = view.lerCodigo();
        agenda.excluirContato(codigo);
        view.mostrarMensagem("Contato excluído com sucesso.");
    }

    private void consultarContato() {
        int codigo = view.lerCodigo();
        Contato contato = agenda.getContato(codigo);
        view.mostrarContato(contato);
    }

    private void listarContatos() {
        view.mostrarContatos(agenda.listarContatos());
    }
}
