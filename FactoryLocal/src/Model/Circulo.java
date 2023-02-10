package Model;

public class Circulo implements Figura{

    int circu;
    int radio;

    @Override
    public String printfigura() {
        return "Soy un circulo";
    }

    @Override
    public String printArea() {
        return null;
    }

    @Override
    public String printPerimetro() {
        return null;
    }

    public int getCircu() {
        return circu;
    }

    public void setCircu(int circu) {
        this.circu = circu;
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }



}
