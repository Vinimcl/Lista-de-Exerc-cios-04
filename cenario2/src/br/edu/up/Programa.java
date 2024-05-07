import java.lang.Math;

class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double distancia = Math
                .sqrt(Math.pow((outroPonto.getX() - this.x), 2) + Math.pow((outroPonto.getY() - this.y), 2));
        return distancia;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

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
