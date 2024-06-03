import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Competencia> competencias;

    // Construtor
    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.competencias = new ArrayList<>();
    }

    // Métodos para adicionar/remover alunos e competências
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void adicionarCompetencia(Competencia competencia) {
        this.competencias.add(competencia);
    }

    public void removerCompetencia(Competencia competencia) {
        this.competencias.remove(competencia);
    }

    // Outros métodos, se necessário
}
