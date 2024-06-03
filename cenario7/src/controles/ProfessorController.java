package controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Professor;

public class ProfessorController {
    private List<Professor> professores;
    
    public ProfessorController() {
        this.professores = new ArrayList<>();
    }
    
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }
    
    public Professor buscarProfessorPorMatricula(String matricula) {
        for (Professor professor : professores) {
            if (professor.getMatricula().equals(matricula)) {
                return professor;
            }
        }
        return null; // Se não encontrar o professor
    }
    
    // Outros métodos para manipular professores
}