public class Triangulo extends FiguraGeometrica {
        private int lado;

        @Override
        public double calcularPerimetro(){
            return lado*3;
        }

        @Override 
        public double calcularArea(){
            return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        }

        @Override
        public String toString(){
            return "triángulo con lado " + this.lado;
        }

        public int getLado() {
            return lado;
        }

        public void setLado(int lado) {
            this.lado = lado;
        }

        public Triangulo(int lado) {
            this.lado = lado;
        }
}
