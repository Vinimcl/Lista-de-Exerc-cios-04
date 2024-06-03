package controles;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.modelos.Disciplina;

public class DisciplinaController {
    private List<Disciplina> disciplinas;
    
    public DisciplinaController() {
        this.disciplinas = new ArrayList<>();
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
    public Disciplina buscarDisciplinaPorIdentificador(int identificador) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getIdentificador() == identificador) {
                return disciplina;
            }
        }
        return null; // Se não encontrar a disciplina
    }
    
    // Outros métodos para manipular disciplinas
}
