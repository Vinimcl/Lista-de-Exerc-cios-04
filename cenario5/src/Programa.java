// Classe principal que inicia a execução do software
public class Programa {
    public static void main(String[] args) {
        EventoView view = new EventoView();
        EventoController controller = new EventoController();

        int opcao;
        do {
            view.exibirMenu();
            opcao = view.obterOpcao();
            switch (opcao) {
                case 1:
                    Evento novoEvento = view.obterDadosEvento();
                    controller.adicionarEvento(novoEvento);
                    view.exibirMensagem("Evento adicionado com sucesso!");
                    break;
                case 2:
                    view.exibirMensagem("Digite o nome do evento a ser removido: ");
                    String nomeEventoRemover = view.obterDadosEvento().getNome();
                    controller.removerEvento(nomeEventoRemover);
                    view.exibirMensagem("Evento removido com sucesso!");
                    break;
                case 3:
                    Reserva novaReserva = view.obterDadosReserva();
                    controller.adicionarReserva(novaReserva);
                    view.exibirMensagem("Reserva adicionada com sucesso!");
                    break;
                case 4:
                    view.exibirMensagem("Digite o nome do responsável pela reserva a ser removida: ");
                    String nomeResponsavelRemover = view.obterDadosReserva().getResponsavel();
                    controller.removerReserva(nomeResponsavelRemover);
                    view.exibirMensagem("Reserva removida com sucesso!");
                    break;
                case 5:
                    view.exibirEventos(controller.getEventos());
                    break;
                case 6:
                    view.exibirReservas(controller.getReservas());
                    break;
                case 7:
                    view.exibirMensagem("Saindo...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida!");
            }
        } while (opcao != 7);

        view.fecharScanner();
    }
}