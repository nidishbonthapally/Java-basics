public class Area_Perimeter {
    public static void main(String[] args) {
        Shape s1 = new Circle("red", 3);
        Shape s2 = new Rectangle(6, 5,"blue");

        s1.display();
        s2.display();
        System.out.println(s1.calculatePerimeter());
        System.out.println(s2.calculatePerimeter());
    }
}
