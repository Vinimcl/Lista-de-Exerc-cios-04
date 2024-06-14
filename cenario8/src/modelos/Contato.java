// Contato.java
public abstract class Contato {
    private String bairro;
    private String cep;
    private Cidade cidade;

    public Contato(String bairro, String cep, Cidade cidade) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
