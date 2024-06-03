package Telas;

import java.util.Date;
import java.util.Scanner;

import modelos.Aeronave;
import modelos.Comandante;
import modelos.Comissario;
import modelos.Passageiro;
import modelos.Passagem;

// Classe para lidar com a interação do usuário
public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // Exibir menu de opções
    public int mostrarMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Registrar passageiro");
        System.out.println("2. Registrar comandante");
        System.out.println("3. Registrar comissário");
        System.out.println("4. Registrar aeronave");
        System.out.println("5. Sair");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    // Método para coletar dados de um passageiro
    public Passageiro coletarDadosPassageiro() {
        System.out.println("Digite o nome do passageiro:");
        String nome = scanner.next();
        System.out.println("Digite o RG do passageiro:");
        String rg = scanner.next();
        System.out.println("Digite o identificador de bagagem:");
        String identificadorBagagem = scanner.next();
        // Para simplificação, vamos assumir que a data do voo é fixa
        Passagem passagem = new Passagem(1, "Econômica", new Date());
        return new Passageiro(nome, rg, identificadorBagagem, passagem);
    }

    // Método para coletar dados de um comandante
    public Comandante coletarDadosComandante() {
        System.out.println("Digite o nome do comandante:");
        String nome = scanner.next();
        System.out.println("Digite o RG do comandante:");
        String rg = scanner.next();
        System.out.println("Digite a identificação aeronáutica:");
        String identificacaoAeronautica = scanner.next();
        System.out.println("Digite a matrícula do funcionário:");
        String matriculaFuncionario = scanner.next();
        System.out.println("Digite o total de horas de voo:");
        int totalHorasVoo = scanner.nextInt();
        return new Comandante(nome, rg, identificacaoAeronautica, matriculaFuncionario, totalHorasVoo);
    }

    // Método para coletar dados de um comissário
    public Comissario coletarDadosComissario() {
        System.out.println("Digite o nome do comissário:");
        String nome = scanner.next();
        System.out.println("Digite o RG do comissário:");
        String rg = scanner.next();
        System.out.println("Digite a identificação aeronáutica:");
        String identificacaoAeronautica = scanner.next();
        System.out.println("Digite a matrícula do funcionário:");
        String matriculaFuncionario = scanner.next();
        System.out.println("Digite os idiomas de fluência separados por vírgula:");
        String idiomas = scanner.next();
        String[] idiomasFluencia = idiomas.split(",");
        return new Comissario(nome, rg, identificacaoAeronautica, matriculaFuncionario, idiomasFluencia);
    }

    // Método para coletar dados de uma aeronave
    public Aeronave coletarDadosAeronave() {
        System.out.println("Digite o código da aeronave:");
        String codigo = scanner.next();
        System.out.println("Digite o tipo da aeronave:");
        String tipo = scanner.next();
        System.out.println("Digite a quantidade de assentos:");
        int quantidadeAssentos = scanner.nextInt();
        return new Aeronave(codigo, tipo, quantidadeAssentos);
    }

    // Método para exibir mensagem
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
