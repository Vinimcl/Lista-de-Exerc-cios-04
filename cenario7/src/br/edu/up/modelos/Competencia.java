package br.edu.up.modelos;

public class Competencia {
    private String descricao;
    private boolean atingida;
    
    public Competencia(String descricao, boolean atingida) {
        this.descricao = descricao;
        this.atingida = atingida;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtingida() {
        return atingida;
    }

    public void setAtingida(boolean atingida) {
        this.atingida = atingida;
    }
}