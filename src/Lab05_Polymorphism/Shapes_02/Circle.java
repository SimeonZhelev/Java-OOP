package Lab05_Polymorphism.Shapes_02;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public final double getRadius() {
        return this.radius;
    }

    @Override
    protected void calculateArea() {
        super.setArea(Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.radius);
    }
}
