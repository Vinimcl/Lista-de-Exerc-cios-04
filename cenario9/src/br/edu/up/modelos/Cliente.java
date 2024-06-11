package br.edu.up.modelos;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }


    public abstract double getSaldo();

    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= vlrMaxCredito) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Limite de crédito excedido!");
        }
    }

    public double devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
            return valor;
        } else {
            double valorDevolvido = vlrEmprestado;
            vlrEmprestado = 0;
            return valorDevolvido;
        }
    }
}