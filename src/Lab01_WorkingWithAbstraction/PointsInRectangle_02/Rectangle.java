package Lab01_WorkingWithAbstraction.PointsInRectangle_02;


public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    private Point getBottomLeft() {
        return bottomLeft;
    }

    private Point getTopRight() {
        return topRight;
    }
    public boolean contains(Point point){
        boolean isInBounds = (this.getBottomLeft().getX() <= point.getX() &&
                this.getTopRight().getX() >= point.getX()) &&
                (this.getBottomLeft().getY() <= point.getY() &&
                this.getTopRight().getY() >= point.getY());
        return isInBounds;
    }
}
