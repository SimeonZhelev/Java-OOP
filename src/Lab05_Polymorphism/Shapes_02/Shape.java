package Lab05_Polymorphism.Shapes_02;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return this.perimeter;
    }

    public Double getArea() {
        return this.area;
    }

    protected abstract void calculateArea();
    protected abstract void calculatePerimeter();
}