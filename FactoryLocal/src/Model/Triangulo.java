package Model;

public class Triangulo implements Figura{

    int l1;
    int l2;
    int base;
    int altura;


    @Override
    public String printfigura() {
        return "Soy un triangulo";
    }

    @Override
    public String printArea() {
        int areaTrian = (base * altura)/2;
        return String.valueOf(areaTrian);
    }

    @Override
    public String printPerimetro() {
        int periTrian = l1+l2+base;
        return String.valueOf(periTrian);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }
}
