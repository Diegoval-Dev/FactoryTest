package Model;

public class Rectangulo implements Figura{
    int largo;
    int ancho;


    @Override
    public String printfigura() {
        return null;
    }

    @Override
    public String printArea() {
        return null;
    }

    @Override
    public String printPerimetro() {
        return null;
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
