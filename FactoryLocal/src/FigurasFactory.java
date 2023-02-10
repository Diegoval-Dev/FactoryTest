import Model.*;

public class FigurasFactory {
    public Figura generateFigura(String name){
        switch (name){
            case "CUADRADO":
                return new Cuadrado(10);
                break;
            case "RECTANGULO":
                return new Rectangulo();
                break;
            case "TRIANGULO":
                return new Triangulo();
                break;
            case "CIRCULO":
                return new Circulo();
                break;
        }

    }
}
