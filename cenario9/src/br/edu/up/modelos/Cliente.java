// Pasta: model/Cliente.java
package br.edu.up.modelos;

public abstract class Cliente {
    protected String nome;
    protected double vlrEmprestado;

    public Cliente(String nome) {
        this.nome = nome;
        this.vlrEmprestado = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    // Métodos abstratos
    public abstract double getLimiteCredito();

    // Métodos
    public void emprestar(double valor) {
        double limiteCredito = getLimiteCredito();
        if (vlrEmprestado + valor <= limiteCredito) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Limite de crédito excedido!");
        }
    }

    public void devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Valor a devolver maior que o valor emprestado!");
        }
    }
}
