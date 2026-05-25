public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color){
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void display(){
        System.out.println("Color of the shape: "+ color + " Area of the shape: " + calculateArea() + " Perimeter of the shape: " + calculatePerimeter());
    }
}
