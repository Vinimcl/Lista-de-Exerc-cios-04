
// ContatosView.java
import java.util.Scanner;

public class ContatosView {
    private Scanner scanner;

    public ContatosView() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\n### MENU ###");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerString(String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // Limpar o buffer do scanner
        return scanner.nextLine();
    }

    public double lerDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public int lerInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
