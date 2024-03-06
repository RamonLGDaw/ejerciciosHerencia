import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangulo figuraRectangulo1 = new Rectangulo(100, 20);
        Rectangulo figuraRectangulo2 = new Rectangulo(150, 30);
        Circulo figuraCirculo1 = new Circulo(10);
        Triangulo figurTriangulo = new Triangulo(10);

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(figuraRectangulo1);
        figuras.add(figuraRectangulo2);
        figuras.add(figuraCirculo1);
        figuras.add(figurTriangulo);

        System.out.println("El perímetro de la figuraRectangulo1 es: " + figuraRectangulo1.calcularPerimetro());
        System.out.println("El área de la figuraRactangulo1 es: " + figuraRectangulo1.calcularArea());
        System.out.println("El perímetro de la figuraRectangulo2 es: " + figuraRectangulo2.calcularPerimetro());
        System.out.println("El área de la figuraRactangulo2 es: " + figuraRectangulo2.calcularArea());
        System.out.println("El perímetro de la figuraCirculo1 es: " + figuraCirculo1.calcularPerimetro());
        System.out.println("El área de la figuraCirculo1 es: " + figuraCirculo1.calcularArea());

        for (int i = 0; i < figuras.size(); i++) {
            System.out.println("Área del " + figuras.get(i) + " = " + figuras.get(i).calcularArea());
        }

    }
}
