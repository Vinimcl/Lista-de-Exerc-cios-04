
public class Programa {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        View view = new View();
        Controller controller = new Controller(agenda, view);
        controller.iniciar();
    }
}
