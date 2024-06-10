// Pasta: model/ClienteEmpresa.java
package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private static final double LIMITE_CREDITO = 25000;

    public ClienteEmpresa(String nome) {
        super(nome);
    }

    @Override
    public double getLimiteCredito() {
        return LIMITE_CREDITO;
    }
}
