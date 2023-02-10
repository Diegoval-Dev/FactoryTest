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
        int areaCir = (int) (Math.PI * radio * radio);
        return String.valueOf(areaCir);
    }

    @Override
    public String printPerimetro() {
        double periCir = Math.PI * 2 * radio;
        return String.valueOf(periCir);
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
