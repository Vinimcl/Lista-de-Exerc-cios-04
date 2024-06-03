class competencias {
    private String nome;
    private String tipo; // Representado por strings
    private String situacao; // Representado por strings

    // Constantes para representar o tipo de competência (Necessária ou
    // Complementar)
    public static final String NECESSARIA = "Necessária";
    public static final String COMPLEMENTAR = "Complementar";

    // Constantes para representar a situação da competência do aluno
    public static final String ATINGIDA = "Atingida";
    public static final String NAO_ATINGIDA = "Não Atingida";

    // Construtor
    public void Competencia(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.situacao = NAO_ATINGIDA; // Situação inicial não atingida
    }
}