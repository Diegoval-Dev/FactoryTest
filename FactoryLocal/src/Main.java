public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        FigurasFactory fg = new FigurasFactory();
        String figura = ui.read();
        String nombreFigura = fg.generateFigura(figura).printfigura();
        String area = fg.generateFigura(figura).printArea();
        String perimetro = fg.generateFigura(figura).printPerimetro();
        ui.print("Su nombre es: " + nombreFigura + " EL AREA ES DE: " + area + " EL PERIMETRO DE: " + perimetro);
    }
}