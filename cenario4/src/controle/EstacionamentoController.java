import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class EstacionamentoController {
    private static final int CAPACIDADE_PADRAO = 10;
    private List<Veiculo> vagas;
    private int valorPorPeriodo;

    public EstacionamentoController(int capacidade, int valorPorPeriodo) {
        this.vagas = new ArrayList<>(capacidade);
        this.valorPorPeriodo = valorPorPeriodo;
    }

    public void imprimirCapacidadeVeiculos() {
        int capacidadeAtual = vagas.size();
        System.out.println("Capacidade máxima do estacionamento: " + CAPACIDADE_PADRAO);
        System.out.println("Número de veículos estacionados: " + capacidadeAtual);
    }

    public EstacionamentoController(int valorPorPeriodo) {
        this(CAPACIDADE_PADRAO, valorPorPeriodo);
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagas.size() < vagas.size()) { // Usando vagas.size() para verificar a capacidade máxima
            vagas.add(veiculo);
            return true;
        } else {
            return false; // Estacionamento cheio
        }
    }

    public Veiculo saidaVeiculo(String placa) {
        for (Iterator<Veiculo> iterator = vagas.iterator(); iterator.hasNext();) {
            Veiculo veiculo = iterator.next();
            if (veiculo.getPlaca().equals(placa)) {
                iterator.remove();
                return veiculo;
            }
        }
        throw new IllegalArgumentException("Veículo não encontrado.");
    }

    public int getNumeroVeiculos() {
        return vagas.size();
    }

    public int calcularPagamento() {
        return vagas.size() * valorPorPeriodo;
    }
}
