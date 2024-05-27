public class Programa {
    public static void Programa(String[] args) {
        // Exemplo de utilização das classes
        Professor professor1 = new Professor("João", "123456", "P001", "http://lattes.com/joao", Professor.DOUTORADO);
        Aluno aluno1 = new Aluno("Maria", "654321", "A001", 2022, "Engenharia", "Manhã");
        Disciplina disciplina1 = new Disciplina("Programação", "PROG101", "Engenharia de Software", professor1);
        disciplina1.adicionarAluno(aluno1);

        // Adicionar competências à disciplina
        disciplina1.adicionarCompetencia(new Competencia("Lógica de Programação", Competencia.NECESSARIA));
        disciplina1.adicionarCompetencia(new Competencia("Conhecimento em Java", Competencia.NECESSARIA));
        disciplina1.adicionarCompetencia(new Competencia("Trabalho em equipe", Competencia.COMPLEMENTAR));

    }
}