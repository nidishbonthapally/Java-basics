public class Phone {
    String brand;
    double version;
    int batteryLevel;

    Phone(String brand, double version, int batteryLevel){
        this.brand = brand;
        this.version = version;
        this.batteryLevel = batteryLevel;
    }

    void charge(){
        batteryLevel = batteryLevel + 20;
        System.out.println(brand + " is charging at " + batteryLevel +"% battery level");
    }

    void use(){
        batteryLevel = batteryLevel - 10;
        System.out.println(brand + " is being used at " + batteryLevel +"% battery level");
    }
}
