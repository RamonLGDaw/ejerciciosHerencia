import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Mercedes", "Actros", 2024, 5, 3, 5, 65, 100);
        camion1.acelerar();
        Camion camion2 = new Camion("Scania", "1000", 2023, 5, 3, 4, 65, 100);
        camion2.acelerar();
        Camion camion3 = new Camion("Renault", "R850", 2023, 5, 3, 6, 65, 100);
        camion3.acelerar();

        ArrayList<Vehiculo> camiones = new ArrayList<>(Arrays.asList(camion1, camion2, camion3));

        for (int i = 0; i < camiones.size(); i++) {
            System.out.println("El camión de marca " + camiones.get(i).brand + " tiene un consumo de " + camiones.get(i).getConsumoCombustible() + ".");
        }
    }
}
