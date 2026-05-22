public class Showroom {
    public static void main(String[] args) {
        Car1 c = new Car1(2, "Toyota", 120, "Petrol");
        Bike b= new Bike("Yamaha", 180, "petrol", true);
        c.refuel();
        c.openTrunk();
        c.accelerate(80);
        b.wheelie();
        b.wheelie();
        b.accelerate(70);
        b.refuel();
    }
}
