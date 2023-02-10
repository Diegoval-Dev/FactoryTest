package Model;

public class Rectangulo implements Figura{
    int largo;
    int ancho;


    @Override
    public String printfigura() {
        return "Soy un rectangulo";
    }

    @Override
    public String printArea() {
        int areaTriang = largo*ancho;
        return String.valueOf(areaTriang);
    }

    @Override
    public String printPerimetro() {
        int periRectan = 2* (largo+ancho);
        return String.valueOf(periRectan);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
