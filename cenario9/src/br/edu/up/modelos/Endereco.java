package br.edu.up.modelos;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;

    public Endereco(String rua, String numero, String bairro, String cep, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return rua + ", " + numero + " - " + bairro + ", CEP: " + cep + ", " + cidade;
    }
}
