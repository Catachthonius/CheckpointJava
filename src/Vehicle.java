public class Vehicle {

    private String fuelType;
    private int tyresNumber;
    private String manufacturer;
    private String model;
    private double price;

    public Vehicle(String fuelType, int tyresNumber, String manufacturer, String model, double price) {
        this.fuelType = fuelType;
        this.tyresNumber = tyresNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getTyresNumber() {
        return tyresNumber;
    }

    public void setTyresNumber(int tyresNumber) {
        this.tyresNumber = tyresNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        String details = fuelType + "\n" + tyresNumber + "\n" + manufacturer + "\n" + model + "\n" + price + "\n";
        return details;
    }
}
