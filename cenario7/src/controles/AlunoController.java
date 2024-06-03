package controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Aluno;

public class AlunoController {
    private List<Aluno> alunos;
    
    public AlunoController() {
        this.alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null; // Se não encontrar o aluno
    }
    
    // Outros métodos para manipular alunos
}