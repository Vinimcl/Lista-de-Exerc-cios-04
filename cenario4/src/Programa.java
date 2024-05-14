import telas.EstacionamentoView;;

public class Programa {
    public static void main(String[] args) {
        EstacionamentoView view = new EstacionamentoView();

        String opcaoStr;
        do {
            view.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcaoStr = view.obterPlaca(); // Obter a opção como uma String
            try {

            } catch (NumberFormatException e) {

            }

            switch (opcaoStr) { // Comparar como uma String
                case "1": // Opção 1
                    // Código para opção 1
                    break;
                case "2": // Opção 2
                    // Código para opção 2
                    break;
                case "3": // Opção 3
                    // Código para opção 3
                    break;
                case "4": // Opção 4
                    // Código para opção 4
                    break;
                default:
                    view.exibirMensagem("Opção inválida!");
            }
        } while (!opcaoStr.equals("4")); // Verificar a opção como uma String

        view.fecharScanner();
    }
}