package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private String CPF;
    private double peso;
    private double altura;

    public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CPF, double peso, double altura) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
    }


    @Override
    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }

    public String getDados() {
        return "Nome: " + nome + "\nCPF: " + CPF + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: " + endereco.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
