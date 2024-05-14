package br.edu.up;

import br.edu.up.modelos.Ponto;

public class Programa {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distanciaPonto1Ponto2);

        Ponto coordenadas = new Ponto(7, 2);
        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(coordenadas);
        System.out.println("Distância do ponto2 às coordenadas (7,2): " + distanciaPonto2Coordenadas);

        ponto1.setX(10);

        ponto1.setY(3);
    }
}
