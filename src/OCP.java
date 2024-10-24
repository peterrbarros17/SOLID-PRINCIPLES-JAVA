class Shape{
    public double area(){
        return 0;
    }
}
// Extends the class method without modifying its original code
class Circle extends Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area(){
        return  width * height;
    }
}

public class OCP {
    public static void main(String[] args) {
        var cir = new Circle(2.1);
        System.out.println("Circle Area: " + cir.area());
        var rec = new Rectangle(3,2.4);
        System.out.println("Rectangle Area: " + rec.area());
    }
}