import java.util.Scanner;
import java.util.List;

public class EventoView {
    private Scanner scanner;

    public EventoView() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("1. Adicionar evento");
        System.out.println("2. Remover evento");
        System.out.println("3. Adicionar reserva");
        System.out.println("4. Remover reserva");
        System.out.println("5. Listar eventos");
        System.out.println("6. Listar reservas");
        System.out.println("7. Sair");
    }

    public Evento obterDadosEvento() {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do evento: ");
        String data = scanner.nextLine();
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Lotação máxima do evento: ");
        int lotacaoMaxima = Integer.parseInt(scanner.nextLine());
        System.out.print("Preço do ingresso: ");
        double precoIngresso = Double.parseDouble(scanner.nextLine());
        return new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
    }

    public Reserva obterDadosReserva() {
        System.out.print("Responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = Integer.parseInt(scanner.nextLine());
        System.out.print("Data da reserva: ");
        String dataReserva = scanner.nextLine();
        System.out.print("Valor total da reserva: ");
        double valorTotal = Double.parseDouble(scanner.nextLine());
        return new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
    }

    public int obterOpcao() {
        System.out.print("Escolha uma opção: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirEventos(List<Evento> eventos) {
        System.out.println("===== Eventos =====");
        for (Evento evento : eventos) {
            System.out.println(evento.getNome() + " - " + evento.getData());
        }
    }

    public void exibirReservas(List<Reserva> reservas) {
        System.out.println("===== Reservas =====");
        for (Reserva reserva : reservas) {
            System.out.println(reserva.getResponsavel() + " - " + reserva.getDataReserva());
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}
