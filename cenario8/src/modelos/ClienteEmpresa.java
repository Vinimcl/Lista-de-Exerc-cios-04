// ClienteEmpresa.java
public class ClienteEmpresa extends Contato {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;
    private double credito;

    public ClienteEmpresa(String bairro, String cep, Cidade cidade, String cnpj, String inscEstadual, int anoFundacao,
            double credito) {
        super(bairro, cep, cidade);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
        this.credito = credito;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getSaldo() {
        return credito; // Poderia ser implementada a lógica para saldo se necessário
    }

    public String getDados() {
        return "Cliente Empresa: " + toString();
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
                "cnpj='" + cnpj + '\'' +
                ", inscEstadual='" + inscEstadual + '\'' +
                ", anoFundacao=" + anoFundacao +
                ", credito=" + credito +
                "} " + super.toString();
    }
}
