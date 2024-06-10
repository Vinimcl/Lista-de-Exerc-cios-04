// Pasta: view/ClienteView.java
package br.edu.up.telas;

import java.util.Scanner;

public class ClienteView {
    private Scanner scanner;

    public ClienteView() {
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

    public String lerNomeCliente() {
        System.out.print("Nome do cliente: ");
        scanner.nextLine(); // Limpar o buffer do teclado
        return scanner.nextLine();
    }

    public double lerValor() {
        System.out.print("Valor: ");
        return scanner.nextDouble();
    }
}
