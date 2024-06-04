import java.util.Scanner;

import br.edu.up.modelos.Aluno;
import telas.SistemaView;

public class Programa {
    public static void main(String[] args) {
        SistemaView view = new SistemaView();
        
        // Exemplo de interação com o usuário
        Scanner scanner = view.getScanner();
        
        System.out.println("Bem-vindo ao sistema!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Adicionar aluno");
        System.out.println("2. Adicionar professor");
        System.out.println("3. Adicionar disciplina");
        System.out.println("4. Sair");
        
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                adicionarAluno(view);
                break;
            case 2:
                adicionarProfessor(view);
                break;
            case 3:
                adicionarDisciplina(view);
                break;
            case 4:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void adicionarAluno(SistemaView view) {
        Scanner scanner = view.getScanner();
        
        System.out.println("Informe o nome do aluno:");
        String nome = scanner.next();
        System.out.println("Informe o RG do aluno:");
        String rg = scanner.next();
        System.out.println("Informe a matrícula do aluno:");
        String matricula = scanner.next();
        System.out.println("Informe o ano de ingresso do aluno:");
        int anoIngresso = scanner.nextInt();
        System.out.println("Informe o curso do aluno:");
        String curso = scanner.next();
        System.out.println("Informe o turno do aluno:");
        String turno = scanner.next();
        
        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        view.getAlunoController().adicionarAluno(aluno);
        
        System.out.println("Aluno adicionado com sucesso!");
    }
    
    private static void adicionarProfessor(SistemaView view) {
        // Lógica para adicionar um professor, similar à adicionarAluno
    }
    
    private static void adicionarDisciplina(SistemaView view) {
        // Lógica para adicionar uma disciplina, similar à adicionarAluno
    }
}
