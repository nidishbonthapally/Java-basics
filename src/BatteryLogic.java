public class BatteryLogic {
    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung",16, 50);
        Phone p2 = new Phone("IPhone", 22, 30);


        p1.charge();
        p2.use();

        p1.use();
        p2.charge();
    }
}
