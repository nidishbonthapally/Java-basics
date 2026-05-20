public class Main {
    public static void main(String[] args) {
       Car c1 = new Car();
       c1.brand = "Mazda";
       c1.color = "red";
       c1.speed = 120;

        Car c2 = new Car();
        c2.brand = "Subaru";
        c2.color = "blue";
        c2.speed = 90;

        Car c3 = new Car();
        c3.brand = "Toyota";
        c3.color = "Orange";
        c3.speed = 100;

        c1.acceleration();
        c2.acceleration();
        c3.acceleration();

        c2.breaking();
        c3.breaking();
    }
}
