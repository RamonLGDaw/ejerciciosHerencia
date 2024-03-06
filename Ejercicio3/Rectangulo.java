public class Rectangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "rectángulo con base " + this.base + " y altura " + this.altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
