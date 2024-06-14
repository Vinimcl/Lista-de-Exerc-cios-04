public class Programa {

    public static void main(String[] args) {
        SegurosView view = new SegurosView();
        SegurosController controller = new SegurosController(view);

        controller.iniciar();
    }
}
