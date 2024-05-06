import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // Getters and setters
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

class Agenda {
    private Map<String, List<Compromisso>> compromissos;

    public Agenda() {
        compromissos = new HashMap<>();
    }

    public void adicionarCompromisso(String data, Compromisso compromisso) {
        if (!compromissos.containsKey(data)) {
            compromissos.put(data, new ArrayList<>());
        }
        compromissos.get(data).add(compromisso);
    }

    public List<Compromisso> getCompromissos(String data) {
        return compromissos.getOrDefault(data, new ArrayList<>());
    }
}

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Compromisso compromisso1 = new Compromisso("João", "Café", "10:00", "Reunião de trabalho");
        Compromisso compromisso2 = new Compromisso("Maria", "Escritório", "14:30", "Apresentação de projeto");

        agenda.adicionarCompromisso("2024-05-06", compromisso1);
        agenda.adicionarCompromisso("2024-05-07", compromisso2);

        List<Compromisso> compromissosDoDia = agenda.getCompromissos("2024-05-06");
        for (Compromisso compromisso : compromissosDoDia) {
            System.out.println(compromisso);
        }
    }
}
