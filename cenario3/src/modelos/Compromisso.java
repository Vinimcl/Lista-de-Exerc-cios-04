class Compromisso {
    private String pessoa;
    private String local;
    private String horario;
    private String assunto;

    public Compromisso(String pessoa, String local, String horario, String assunto) {
        this.pessoa = pessoa;
        this.local = local;
        this.horario = horario;
        this.assunto = assunto;
    }


    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "pessoa='" + pessoa + '\'' +
                ", local='" + local + '\'' +
                ", horario='" + horario + '\'' +
                ", assunto='" + assunto + '\'' +
                '}';
    }
}