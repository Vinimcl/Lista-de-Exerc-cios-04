
public class ContatoPessoal extends Contato {
    private String aniversario;

    public ContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        super(codigo, nome, telefone);
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aniversário: " + aniversario;
    }
}
