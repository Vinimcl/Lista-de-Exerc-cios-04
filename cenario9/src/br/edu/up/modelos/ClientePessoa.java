// Pasta: model/ClientePessoa.java
package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
    private static final double LIMITE_CREDITO = 10000;

    public ClientePessoa(String nome) {
        super(nome);
    }

    @Override
    public double getLimiteCredito() {
        return LIMITE_CREDITO;
    }
}
