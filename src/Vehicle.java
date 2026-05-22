public class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType){
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void accelerate(int speed){
        if(this.speed>0){
            System.out.println("The vehicle is accelerating...... at " + speed + " km/ph");
        }else {
            System.out.println("The vehicle is at stop or going reverse......");
        }
    }

    public void refuel(){
        System.out.println("The vehicle is being refueled");
    }
}
