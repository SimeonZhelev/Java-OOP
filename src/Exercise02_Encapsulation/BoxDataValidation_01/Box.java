package Exercise02_Encapsulation.BoxDataValidation_01;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }
    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;

    }
    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;

    }
    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;

    }
    public double calculateSurfaceArea(){
        return 2 * (length * width) +
                2 * (length * height) +
                2 * (width * height);
    }
    public double calculateLateralSurfaceArea(){
        return 2 * (length * height) +
                2 * (width * height);
    }
    public double calculateVolume(){
        return this.length * this.width * this.height;
    }
}