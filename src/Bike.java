public class Bike extends Vehicle{
    private boolean hasSideCar;

    public Bike(String brand, int speed, String fuelType, boolean hasSideCar) {
        super(brand, speed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void wheelie(){
        if (this.hasSideCar) {
            System.out.println("Wheelie not possible due to sidecar");
        }else {
            System.out.println("Wheelie........");
        }
    }
}
