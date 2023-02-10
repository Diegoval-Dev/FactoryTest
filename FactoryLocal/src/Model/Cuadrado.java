package Model;

import javax.management.StringValueExp;

public class Cuadrado implements Figura{
    int a;
    int area;
    int perimetro;

    public Cuadrado(int a) {
        this.a = a;
    }

    @Override
    public String printfigura() {
        return "SOY UN CIRCULO";
    }

    @Override
    public String printArea() {
        area = a*a;
        return String.valueOf(area);
    }

    @Override
    public String printPerimetro() {
        perimetro = 4 * a;
        return String.valueOf(perimetro);
    }
}
