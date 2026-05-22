public class Car1 extends Vehicle {
    private int numberOfDoors;

    public Car1(int numberOfDoors, String brand, int speed, String fuelType){
        super(brand, speed, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors >= 1 && numberOfDoors <= 5) {
            this.numberOfDoors = numberOfDoors;
        }
    }

    public void openTrunk(){
        System.out.println("Trunk is open");
    }
}

