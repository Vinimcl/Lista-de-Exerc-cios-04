class Professor {
    private String nome;
    private String rg;
    private String matricula;
    private String lattes;
    private int titulacao; // Representado por constantes

    // Constantes para representar a titulação do professor
    public static final int GRADUACAO = 1;
    public static final int ESPECIALIZACAO = 2;
    public static final int MESTRADO = 3;
    public static final int DOUTORADO = 4;

    public Professor(String nome, String rg, String matricula, String lattes, int titulacao) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.lattes = lattes;
        this.titulacao = titulacao;
    }
}