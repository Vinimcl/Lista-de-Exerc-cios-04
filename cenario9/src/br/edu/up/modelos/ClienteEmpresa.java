package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito,
            String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    @Override
    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }

    public String getDados() {
        return "Nome: " + nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: "
                + endereco.toString() + "\nInscrição Estadual: " + inscEstadual + "\nAno de Fundação: " + anoFundacao;
    }
}
