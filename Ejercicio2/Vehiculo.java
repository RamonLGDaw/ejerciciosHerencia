public abstract class Vehiculo {

     protected String brand;
     protected String model;
     protected int yearManufacture;
     protected int aceleracion;
     protected int frenada;
     protected int consumoCombustible;
     protected int velocidad;

     public Vehiculo(String brand, String model, int yearManufacture, int aceleracion, int frenada, int consumoCombustible, int velocidad) {
          this.brand = brand;
          this.model = model;
          this.yearManufacture = yearManufacture;
          this.aceleracion = aceleracion;
          this.frenada = frenada;
          this.consumoCombustible = consumoCombustible;
          this.velocidad = velocidad;
     }

     public abstract void acelerar();

     public abstract void frenar();

     public abstract void consumoCombustible();

     public int getAceleracion() {
          return aceleracion;
     }

     public void setAceleracion(int aceleracion) {
          this.aceleracion = aceleracion;
     }

     public int getFrenada() {
          return frenada;
     }

     public void setFrenada(int frenada) {
          this.frenada = frenada;
     }

     public int getConsumoCombustible() {
          return consumoCombustible;
     }

     public void setConsumoCombustible(int consumoCombustible) {
          this.consumoCombustible = consumoCombustible;
     }

     public String getBrand() {
          return brand;
     }

     public void setBrand(String brand) {
          this.brand = brand;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getYearManufacture() {
          return yearManufacture;
     }

     public void setYearManufacture(int yearManufacture) {
          this.yearManufacture = yearManufacture;
     }

     public int getVelocidad() {
          return velocidad;
     }

     public void setVelocidad(int velocidad) {
          this.velocidad = velocidad;
     }

}