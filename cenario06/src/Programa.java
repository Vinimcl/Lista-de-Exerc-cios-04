import Telas.View;
import controles.Controller;

public class Programa {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.iniciar();
    }
}