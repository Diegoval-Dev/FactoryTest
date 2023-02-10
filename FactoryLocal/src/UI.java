import java.util.Scanner;

public class UI {
    public void print(String S){
        System.out.println(S);
    }
    public String read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la figura: ");
        System.out.println("CUADRADO");
        System.out.println("RECTANGULO");
        System.out.println("TRIANGULO");
        System.out.println("CIRCULO");
        return sc.nextLine();
    }
}
