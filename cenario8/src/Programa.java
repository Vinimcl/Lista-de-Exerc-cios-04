// Programa.java
public class Programa {

    public static void main(String[] args) {
        ContatosView view = new ContatosView();
        ContatosController controller = new ContatosController(view);

        controller.iniciar();
    }
}
