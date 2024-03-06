public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "círculo con radio " + this.radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

}
