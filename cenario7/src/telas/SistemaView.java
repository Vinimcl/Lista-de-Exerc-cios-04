package telas;

import java.util.Scanner;

import controles.AlunoController;
import controles.Controller;
import controles.DisciplinaController;
import controles.ProfessorController;

public class SistemaView {
    private Scanner scanner;
    private Controller instituicaoController;
    private DisciplinaController disciplinaController;
    private AlunoController alunoController;
    private ProfessorController professorController;
    
    public SistemaView() {
        scanner = new Scanner(System.in);
        instituicaoController = new Controller(null);
        disciplinaController = new DisciplinaController();
        alunoController = new AlunoController();
        professorController = new ProfessorController();
    }
    
    // Métodos para interação com o usuário
}
