// ClientePessoa.java
public class ClientePessoa extends Contato {
    private String CPF;
    private double peso;
    private double altura;
    private double credito;

    public ClientePessoa(String bairro, String cep, Cidade cidade, String CPF, double peso, double altura,
            double credito) {
        super(bairro, cep, cidade);
        this.CPF = CPF;
        this.peso = peso;
        this.altura = altura;
        this.credito = credito;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return "Cliente Pessoa: " + toString();
    }

    @Override
    public String toString() {
        return "ClientePessoa{" +
                "CPF='" + CPF + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", credito=" + credito +
                "} " + super.toString();
    }
}
