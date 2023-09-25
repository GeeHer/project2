package Project2;
/*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2 classes
Circle & Square that implements functionality defined in the Shape Interface. Test your code.*/

public interface Shape {
    void calculateArea();

    void calculatePerimeter();

}
class Circle implements Shape{
    static final double PI=3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area=radius*radius*PI;
        System.out.println("circle area : "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter=2*PI*radius;
        System.out.println("circle perimeter : "+perimeter);
    }
}
class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double areaSquare=side*side;
        System.out.println("Square areaSquare : "+areaSquare);
    }

    @Override
    public void calculatePerimeter() {
        double perimeterSquare=4*side;
        System.out.println("Square perimeterSquare : "+perimeterSquare);


    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape [] arr={new Circle(5),new Square(6)};
        for (Shape a:arr){
            a.calculateArea();
            a.calculatePerimeter();
        }
    }
}