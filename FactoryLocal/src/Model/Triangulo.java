package Model;

public class Triangulo implements Figura{

    int cOp;
    int cAdy;
    int hipo;


    @Override
    public String printfigura() {
        return "Soy un triangulo";
    }

    @Override
    public String printArea() {
        return null;
    }

    @Override
    public String printPerimetro() {
        return null;
    }

    public int getcAdy() {
        return cAdy;
    }

    public void setcAdy(int cAdy) {
        this.cAdy = cAdy;
    }

    public int getcOp() {
        return cOp;
    }

    public void setcOp(int cOp) {
        this.cOp = cOp;
    }

    public int getHipo() {
        return hipo;
    }

    public void setHipo(int hipo) {
        this.hipo = hipo;
    }
}
