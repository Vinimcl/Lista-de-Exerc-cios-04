class Aluno {
    private String nome;
    private String rg;
    private String matricula;
    private int anoIngresso;
    private String curso;
    private String turno;
    private int situacao; // Representado por constantes

    // Constantes para representar a situação do aluno
    public static final int APROVADO = 1;
    public static final int REPROVADO = 2;
    public static final int PENDENTE = 3;

    // Construtor
    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
        this.situacao = PENDENTE; // Situação inicial pendente
    }

}
