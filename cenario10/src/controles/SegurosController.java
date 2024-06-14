import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SegurosController {
    private SegurosView view;
    private List<Seguro> seguros;

    public SegurosController(SegurosView view) {
        this.view = view;
        this.seguros = new ArrayList<>();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirSeguroVida();
                    break;
                case 2:
                    incluirSeguroVeiculo();
                    break;
                case 3:
                    localizarSeguro();
                    break;
                case 4:
                    excluirSeguro();
                    break;
                case 5:
                    excluirTodosSeguros();
                    break;
                case 6:
                    listarTodosSeguros();
                    break;
                case 7:
                    verQuantidadeSeguros();
                    break;
                case 8:
                    view.mostrarMensagem("Encerrando o programa...");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 8);
    }

    private void incluirSeguroVida() {
        String apolice = obterApolice();
        if (apolice == null) return;

        Segurado segurado = criarSegurado();
        if (segurado == null) return;

        double vlrApolice = view.lerDouble("Digite o valor da apólice: ");
        LocalDate dtaInicio = view.lerData("Digite a data de início (YYYY-MM-DD): ");
        boolean cobreDoenca = view.lerBoolean("O seguro cobre doença?");
        boolean cobreAcidente = view.lerBoolean("O seguro cobre acidente?");

        SeguroVida seguro = new SeguroVida(apolice, segurado, vlrApolice, dtaInicio, cobreDoenca, cobreAcidente);
        if (adicionarSeguro(seguro)) {
            view.mostrarMensagem("Seguro de vida incluído com sucesso!");
        }
    }

    private void incluirSeguroVeiculo() {
        String apolice = obterApolice();
        if (apolice == null) return;

        Segurado segurado = criarSegurado();
        if (segurado == null) return;

        double vlrApolice = view.lerDouble("Digite o valor da apólice: ");
        LocalDate dtaInicio = view.lerData("Digite a data de início (YYYY-MM-DD): ");
        double vlrFranquia = view.lerDouble("Digite o valor da franquia: ");
        boolean temCarroReserva = view.lerBoolean("O seguro possui carro reserva?");
        boolean cobreVidros = view.lerBoolean("O seguro cobre vidros?");

        SeguroVeiculo seguro = new SeguroVeiculo(apolice, segurado, vlrApolice, dtaInicio, vlrFranquia, temCarroReserva, cobreVidros);
        if (adicionarSeguro(seguro)) {
            view.mostrarMensagem("Seguro de veículo incluído com sucesso!");
        }
    }

    private void localizarSeguro() {
        String apolice = view.lerString("Digite o número da apólice: ");
        Seguro encontrado = buscarSeguro(apolice);
        if (encontrado != null) {
            view.mostrarMensagem("Seguro encontrado:\n" + encontrado.getDados());
        } else {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        String apolice = view.lerString("Digite o número da apólice a ser excluída: ");
        Seguro seguro = buscarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            view.mostrarMensagem("Seguro excluído com sucesso.");
        } else {
            view.mostrarMensagem("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        boolean confirmacao = view.lerBoolean("Tem certeza que deseja excluir todos os seguros? (true/false): ");
        if (confirmacao) {
            seguros.clear();
            view.mostrarMensagem("Todos os seguros foram excluídos.");
        } else {
            view.mostrarMensagem("Exclusão de todos os seguros cancelada.");
        }
    }

    private void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            view.mostrarMensagem("Não há seguros cadastrados.");
        } else {
            view.mostrarMensagem("Lista de Seguros:");
            for (Seguro seguro : seguros) {
                view.mostrarMensagem(seguro.getDados());
            }
        }
    }

    private void verQuantidadeSeguros() {
        int quantidade = seguros.size();
        view.mostrarMensagem("Quantidade de seguros cadastrados: " + quantidade);
    }

    private String obterApolice() {
        String apolice = view.lerString("Digite o número da apólice: ");
        if (buscarSeguro(apolice) != null) {
            view.mostrarMensagem("Número da apólice já existe. Por favor, escolha outro número.");
            return null;
        }
        return apolice;
    }

    private Segurado criarSegurado() {
        String nome = view.lerString("Digite o nome do segurado: ");
        String RG = view.lerString("Digite o RG: ");
        String CPF = view.lerString("Digite o CPF: ");
        Sexo sexo = escolherSexo();
        String telefone = view.lerString("Digite o telefone: ");
        String endereco = view.lerString("Digite o endereço: ");
        String CEP = view.lerString("Digite o CEP: ");
        String cidade = view.lerString("Digite a cidade: ");

        Segurado segurado = new Segurado(nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);
        return segurado;
    }

    private Sexo escolherSexo() {
        int opcao;
        do {
            System.out.println("\nEscolha o sexo:");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            System.out.println("3. Outro");
            System.out.print("Opção: ");
            opcao = view.lerInt("");
            switch (opcao) {
                case 1:
                    return Sexo.MASCULINO;
                case 2:
                    return Sexo.FEMININO;
                case 3:
                    return Sexo.OUTRO;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (true);
    }

    private boolean adicionarSeguro(Seguro seguro) {
        return seguros.add(seguro);
    }

    private Seguro buscarSeguro(String apolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro;
            }
        }
        return null;
    }
}
