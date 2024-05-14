import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

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
