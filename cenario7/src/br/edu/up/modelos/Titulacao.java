package br.edu.up.modelos;
public class Titulacao {
    private String nomeInstituicao;
    private int anoConclusao;
    private String tituloObtido;
    public Titulacao(String nomeInstituicao, int anoConclusao, String tituloObtido, String tituloTrabalhoConclusao) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.tituloObtido = tituloObtido;
    }
    
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getTituloObtido() {
        return tituloObtido;
    }

    public void setTituloObtido(String tituloObtido) {
        this.tituloObtido = tituloObtido;
    }

    public String getTituloTrabalhoConclusao(){
        return nomeInstituicao;

    }
    
}