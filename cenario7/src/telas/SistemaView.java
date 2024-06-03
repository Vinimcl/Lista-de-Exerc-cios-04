package telas;

import java.util.Scanner;

import controles.AlunoController;
import controles.DisciplinaController;
import controles.InstituicaoController;
import controles.ProfessorController;

public class SistemaView {
    private Scanner scanner;
    private InstituicaoController instituicaoController;
    private DisciplinaController disciplinaController;
    private AlunoController alunoController;
    private ProfessorController professorController;
    
    public SistemaView() {
        scanner = new Scanner(System.in);
        instituicaoController = new InstituicaoController();
        disciplinaController = new DisciplinaController();
        alunoController = new AlunoController();
        professorController = new ProfessorController();
    }
    
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public InstituicaoController getInstituicaoController() {
        return instituicaoController;
    }

    public void setInstituicaoController(InstituicaoController instituicaoController) {
        this.instituicaoController = instituicaoController;
    }

    public DisciplinaController getDisciplinaController() {
        return disciplinaController;
    }

    public void setDisciplinaController(DisciplinaController disciplinaController) {
        this.disciplinaController = disciplinaController;
    }

    public AlunoController getAlunoController() {
        return alunoController;
    }

    public void setAlunoController(AlunoController alunoController) {
        this.alunoController = alunoController;
    }

    public ProfessorController getProfessorController() {
        return professorController;
    }

    public void setProfessorController(ProfessorController professorController) {
        this.professorController = professorController;
    }
    
    // Métodos para interagir com o usuário
}
