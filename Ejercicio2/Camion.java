public class Camion extends Vehiculo {
    private int relCargaCapacidad; // Valor entre 0 - 100 para simular la cantidad de carga en relación a su capacidad en %.

    public Camion(String brand, String model, int yearManufacture, int aceleracion, int frenada, int consumoCombustible, int relCargaCapacidad, int velocidad) {
        super(brand, model, yearManufacture, aceleracion, frenada, consumoCombustible, velocidad);
        this.relCargaCapacidad = relCargaCapacidad;
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad() + 1); 
        consumoCombustible(); 
    }

    @Override
    public void consumoCombustible() {
        // Cálculo del consumo de combustible condicionado a la carga.
        if (relCargaCapacidad > 60) {
            setConsumoCombustible(getConsumoCombustible() + 3); // Incrementa el consumo si la carga supera el 60%
            System.out.println("Incrementa el consumo de combustible: " + getConsumoCombustible());
        } else {
            setConsumoCombustible(getConsumoCombustible() - 1); // Incrementa el consumo si la carga NO supera el 60%
            System.out.println("Disminuye el consumo de combustible: " + getConsumoCombustible());
        }
    }

    @Override
    public void frenar() {
        setVelocidad(getVelocidad() - 1);
    }

    public int getRelCargaCapacidad() {
        return relCargaCapacidad;
    }

    public void setRelCargaCapacidad(int relCargaCapacidad) {
        this.relCargaCapacidad = relCargaCapacidad;
    }
}
