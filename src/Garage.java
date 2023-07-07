import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {

    public Garage() {

    }

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle veicolo) {
        vehicleList.add(veicolo);
    }

    public void printArrayList() {
        for (Vehicle veicolo : vehicleList) {
            System.out.println(veicolo.toString());
        }
    }

    public ArrayList filterByFuel(String fuelType) {
        ArrayList listaVeicoli = new ArrayList();
        for (Vehicle veicolo : vehicleList) {
            if (veicolo.getFuelType() == fuelType) {
                listaVeicoli.add(veicolo);
            }
        }
        return listaVeicoli;
    }

    public double totalValue() {
        double sum = 0;
        for (Vehicle veicolo : vehicleList) {
        sum = sum + veicolo.getPrice();
        }
        return sum;
    }
}
