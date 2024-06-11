package br.edu.up.telas;

// AgendaView.java
import java.util.Scanner;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Emprestar para cliente empresa");
        System.out.println("7. Devolução de cliente pessoa");
        System.out.println("8. Devolução de cliente empresa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    // Métodos para ler os dados do cliente pessoa
    public String lerNome() {
        System.out.print("Nome: ");
        scanner.nextLine(); // Limpar o buffer do teclado
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Telefone: ");
        return scanner.nextLine();
    }

    public String lerEmail() {
        System.out.print("Email: ");
        return scanner.nextLine();
    }

    public String lerRua() {
        System.out.print("Rua: ");
        return scanner.nextLine();
    }

    public String lerNumero() {
        System.out.print("Número: ");
        return scanner.nextLine();
    }

    public String lerBairro() {
        System.out.print("Bairro: ");
        return scanner.nextLine();
    }

    public String lerCEP() {
        System.out.print("CEP: ");
        return scanner.nextLine();
    }

    public String lerCidade() {
        System.out.print("Cidade: ");
        return scanner.nextLine();
    }

    public String lerCPF() {
        System.out.print("CPF: ");
        return scanner.nextLine();
    }

    public double lerPeso() {
        System.out.print("Peso: ");
        return scanner.nextDouble();
    }

    public double lerAltura() {
        System.out.print("Altura: ");
        return scanner.nextDouble();
    }

    // Métodos para ler os dados do cliente empresa
    public String lerCNPJ() {
        System.out.print("CNPJ: ");
        scanner.nextLine(); // Limpar o buffer do teclado
        return scanner.nextLine();
    }

    public String lerInscEstadual() {
        System.out.print("Inscrição Estadual: ");
        return scanner.nextLine();
    }

    public int lerAnoFundacao() {
        System.out.print("Ano de Fundação: ");
        return scanner.nextInt();
    }

    public double lerValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lerValor'");
    }
}
