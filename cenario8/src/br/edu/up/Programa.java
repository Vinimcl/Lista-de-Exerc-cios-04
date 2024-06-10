package br.edu.up;

import br.edu.up.controles.AgendaController;

public class Programa {
    public static void main(String[] args) {
        AgendaController agenda = new AgendaController();
        agenda.iniciar();
    }
}