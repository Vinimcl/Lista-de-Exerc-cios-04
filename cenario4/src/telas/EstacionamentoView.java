package telas;

import br.edu.up.modelos.Veiculo;
import java.util.Scanner;

public class EstacionamentoView {
    private Scanner scanner;

    public EstacionamentoView() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
    }

    public Veiculo obterDadosVeiculo() {
        System.out.print("Modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Cor do veículo: ");
        String cor = scanner.nextLine();
        return new Veiculo(modelo, placa, cor);
    }

    public String obterPlaca() {
        System.out.print("Digite a placa do veículo: ");
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirRelatorio(int entradas, int saidas, int valor) {
        System.out.println("===== Relatório =====");
        System.out.println("Veículos entraram: " + entradas);
        System.out.println("Veículos saíram: " + saidas);
        System.out.println("Valor total: R$" + valor);
    }

    public void fecharScanner() {
        scanner.close();
    }
}
