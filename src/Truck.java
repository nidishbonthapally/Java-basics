public class Truck extends Vehicle {
    private int payLoadCapacity;

    public Truck(int payLoadCapacity, String brand, int speed, String fuelType){
        super(brand, speed, fuelType);
        this.payLoadCapacity = payLoadCapacity;
    }

    public int getPayLoadCapacity() {
        return payLoadCapacity;
    }

    public void setPayLoadCapacity(int payLoadCapacity) {
        this.payLoadCapacity = payLoadCapacity;
    }

    public void loadCargo(int tonnes){
        if (this.payLoadCapacity > tonnes){
            System.out.println("Cargo loaded.....");
        }else {
            System.out.println("Load capacity exceeded.......");
        }
    }

    @Override
    public void accelerate(int speed ) {
        if (this.getSpeed()< 30){
            System.out.println("Acceleration too slow.....");
        }else {
            System.out.println("Acceleration started.....");
        }
    }

    @Override
    public void refuel() {
        System.out.println("Re-filling diesel........");
    }
}
