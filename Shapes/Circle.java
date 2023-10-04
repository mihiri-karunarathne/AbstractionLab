package Shapes;

public class Circle extends Shape{
    private double radius;

 public Circle(double r){
    radius = r;
 }
 @Override
 public double calculateArea(){
    return Math.PI * radius*radius;
 }
 @Override
public double calculatePerimeter (){
    return radius *2* radius;
}

}

