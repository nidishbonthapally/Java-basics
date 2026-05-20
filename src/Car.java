public class Car {
    String brand;
    String color;
    int speed;

    void acceleration(){
        speed = speed + 10;
        System.out.println(brand+" is going at " + speed + "km/h");
    }

    void breaking(){
        speed = speed - 10;
        System.out.println(brand +" will decrease speed from " + speed + "km/h"  );
    }
}
