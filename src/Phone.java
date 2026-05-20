public class Phone {
    String brand;
    double version;
    int battery_level;

    void charge(){
        battery_level = battery_level + 20;
        System.out.println(brand + " is charging at " + battery_level +"% battery level");
    }

    void use(){
        battery_level = battery_level - 10;
        System.out.println(brand + " is being used at " + battery_level +"% battery level");
    }
}
