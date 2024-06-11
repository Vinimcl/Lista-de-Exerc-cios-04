
// View.java
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Contato lerContato() {
        System.out.print("Digite o código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        return new Contato(codigo, nome, telefone) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

    public int lerCodigo() {
        System.out.print("Digite o código do contato: ");
        return scanner.nextInt();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarContato(Contato contato) {
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void mostrarContatos(Iterable<Contato> contatos) {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
