import java.time.LocalDate;
import java.util.Scanner;

public class SegurosView {
    private Scanner scanner;

    public SegurosView() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\n### MENU ###");
        System.out.println("1. Incluir seguro de vida");
        System.out.println("2. Incluir seguro de veículo");
        System.out.println("3. Localizar seguro");
        System.out.println("4. Excluir seguro");
        System.out.println("5. Excluir todos os seguros");
        System.out.println("6. Listar todos os seguros");
        System.out.println("7. Ver quantidade de seguros");
        System.out.println("8. Sair");
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

    public boolean lerBoolean(String prompt) {
        System.out.print(prompt + " (true/false): ");
        return scanner.nextBoolean();
    }

    public LocalDate lerData(String prompt) {
        System.out.print(prompt + " (YYYY-MM-DD): ");
        String dataStr = scanner.next();
        return LocalDate.parse(dataStr);
    }
}
