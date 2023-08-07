import java.awt.Graphics2D;

public class Line implements Drawable {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public void draw(Displayable displayable) {
        Image image = (Image) displayable;
        image.getG2d().setColor(this.getColor());
        image.getG2d().drawLine(this.getPoint1().getX(), this.getPoint1().getY(), this.getPoint2().getX(), this.getPoint2().getY());
    }

    public static Line random(int width, int height) {
        Point point1 = Point.random(width, height);
        Point point2 = Point.random(width, height);
        while (point1.getX() == point2.getX() && point1.getY() == point2.getY()) {
            point1 = Point.random(width, height);
            point2 = Point.random(width, height);
        }
        return new Line(point1, point2);
    }
}
