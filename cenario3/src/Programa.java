import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programa {
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
