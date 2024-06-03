package controles;

import Telas.View;

// Classe para controlar as interações entre o modelo e a visualização
public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    // Método para iniciar o programa
    public void iniciar() {
        int opcao;
        do {
            opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    // Aqui você pode adicionar lógica para manipular os dados do passageiro
                    view.exibirMensagem("Passageiro registrado com sucesso!");
                    break;
                case 2:
                    // Aqui você pode adicionar lógica para manipular os dados do comandante
                    view.exibirMensagem("Comandante registrado com sucesso!");
                    break;
                case 3:
                    // Aqui você pode adicionar lógica para manipular os dados do comissário
                    view.exibirMensagem("Comissário registrado com sucesso!");
                    break;
                case 4:
                    // Aqui você pode adicionar lógica para manipular os dados da aeronave
                    view.exibirMensagem("Aeronave registrada com sucesso!");
                    break;
                case 5:
                    view.exibirMensagem("Encerrando o programa...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida!");
            }
        } while (opcao != 5);
    }
}
