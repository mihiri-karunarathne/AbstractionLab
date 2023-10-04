package Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.4, 3);
         System.out.println("Circle");
         System.out.println("C AREA:"+ circle.calculateArea());
         System.out.println("C perimeter:"+ circle.calculatePerimeter());
         System.out.println();
         System.out.println("Rectangle");
         System.out.println("R Area :"+ rectangle.calculateArea());
         System.out.println("R perimeter:"+ rectangle.calculatePerimeter());
    }
    
}
