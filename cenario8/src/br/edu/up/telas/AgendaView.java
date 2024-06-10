package br.edu.up.telas;

import java.util.Scanner;

public class AgendaView {
    private Scanner scanner;

    public AgendaView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerNome() {
        System.out.print("Nome: ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String lerTelefone() {
        System.out.print("Telefone: ");
        return scanner.nextLine();
    }

    public String lerEndereco() {
        System.out.print("Endereço: ");
        return scanner.nextLine();
    }

    public String lerEmpresa() {
        System.out.print("Empresa: ");
        return scanner.nextLine();
    }
}
