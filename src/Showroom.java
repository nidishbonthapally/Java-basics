public class Showroom {
    public static void main(String[] args) {
        Car1 c = new Car1(2, "Toyota", 120, "Petrol");
        Bike b= new Bike("Yamaha", 180, "petrol", false);
        Truck t = new Truck(6, "Ashok Layland",50, "Diesel" );
        Vehicle[] vehicles = {c, b, t};
        c.refuel();
        c.openTrunk();
        c.accelerate(90);
        b.wheelie();
        b.accelerate(50);
        b.refuel();
        t.accelerate(40);
        t.loadCargo(5);
        t.refuel();
        for (Vehicle v : vehicles ){
            System.out.println(v.getBrand() + " - "+ v.getFuelType());
            v.accelerate(90);
            v.refuel();
        }
    }
}
