public class Tester {
    public static void main(String[] args) {

        Vehicle automobile1 = new Vehicle("Diesel", 4, "Fiat", "Idea", 50000);
        Vehicle automobile2 = new Vehicle("Senza Piombo", 4, "Ford", "Fiesta", 25000);
        Vehicle automobile3 = new Vehicle("Diesel", 6, "Ferrari", "F16", 200000);
        //System.out.println(automobile);

        Garage garage = new Garage();

        garage.addVehicle(automobile1);
        garage.addVehicle(automobile2);
        garage.addVehicle(automobile3);

        //garage.printArrayList();

        System.out.println(garage.filterByFuel("Diesel"));

    }
}
