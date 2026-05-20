public class BatteryLogic {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.brand = "Samsung";
        p1.version = 16.0;
        p1.battery_level = 80;

        Phone p2 = new Phone();
        p2.brand = "IPhone";
        p2.version = 20.2;
        p2.battery_level = 20;

        p1.charge();
        p2.use();

    }
}
