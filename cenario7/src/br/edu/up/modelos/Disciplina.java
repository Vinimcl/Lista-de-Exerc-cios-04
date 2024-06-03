package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int identificador;
    private String curriculo;
    private List<Titulacao> competenciasNecessarias;
    private List<Titulacao> competenciasComplementares;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    
    public Disciplina(String nome, int identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.competenciasNecessarias = new ArrayList<>();
        this.competenciasComplementares = new ArrayList<>();
        this.alunosMatriculados = new ArrayList<>();
    }
    
    // Métodos para adicionar competências, alunos, etc.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public List<Titulacao> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void setCompetenciasNecessarias(List<Titulacao> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public List<Titulacao> getCompetenciasComplementares() {
        return competenciasComplementares;
    }

    public void setCompetenciasComplementares(List<Titulacao> competenciasComplementares) {
        this.competenciasComplementares = competenciasComplementares;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
