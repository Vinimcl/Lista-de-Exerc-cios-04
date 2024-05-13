public class Programa {
    public static void main(String[] args) {
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(10, 5);

        int opcao;
        do {
            view.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(view.obterPlaca());
            switch (opcao) {
                case 1:
                    Veiculo novoVeiculo = view.obterDadosVeiculo();
                    if (controller.entradaVeiculo(novoVeiculo)) {
                        view.exibirMensagem("Veículo estacionado com sucesso!");
                    } else {
                        view.exibirMensagem("Estacionamento cheio!");
                    }
                    break;
                case 2:
                    String placa = view.obterPlaca();
                    Veiculo veiculoSaindo = controller.saidaVeiculo(placa);
                    if (veiculoSaindo != null) {
                        view.exibirMensagem("Veículo de placa " + placa + " saiu do estacionamento.");
                    } else {
                        view.exibirMensagem("Veículo não encontrado no estacionamento.");
                    }
                    break;
                case 3:
                    int entradas = controller.getNumeroVeiculos();
                    int saidas = 10 - entradas;
                    int valor = controller.calcularPagamento();
                    view.exibirRelatorio(entradas, saidas, valor);
                    break;
                case 4:
                    view.exibirMensagem("Saindo...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida!");
            }
        } while (opcao != 4);

        view.fecharScanner();
    }
}