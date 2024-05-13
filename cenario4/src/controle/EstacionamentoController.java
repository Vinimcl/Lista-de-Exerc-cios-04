// Controlador para gerenciar as operações do estacionamento
class EstacionamentoController {
    private List<Veiculo> vagas;
    private int valorPorPeriodo;

    public EstacionamentoController(int capacidade, int valorPorPeriodo) {
        this.vagas = new ArrayList<>(capacidade);
        this.valorPorPeriodo = valorPorPeriodo;
    }

    public boolean entradaVeiculo(Veiculo veiculo) {
        if (vagas.size() < 10) {
            vagas.add(veiculo);
            return true;
        } else {
            return false; // Estacionamento cheio
        }
    }

    public Veiculo saidaVeiculo(String placa) {
        Iterator<Veiculo> iterator = vagas.iterator();
        while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            if (veiculo.getPlaca().equals(placa)) {
                iterator.remove();
                return veiculo;
            }
        }
        return null; // Veículo não encontrado
    }

    public int getNumeroVeiculos() {
        return vagas.size();
    }

    public int calcularPagamento() {
        return vagas.size() * valorPorPeriodo;
    }
}