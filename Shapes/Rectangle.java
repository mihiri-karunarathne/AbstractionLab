package Shapes;
    
    public class Rectangle extends Shape{
        private double width;
        private double length;
    
        public Rectangle(double w, double l){
            width = w;
            length = l;
        }
        @Override
        public double calculateArea(){
            return width * length;
        }
        @Override
        public double calculatePerimeter(){
            return ((width*2)+(length*2));
        }
    }   

