import java.awt.Graphics2D;

public class Triangle implements Drawable {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public Point getPoint3() {
        return this.point3;
    }

    public void draw(Displayable displayable) {
        Image image = (Image) displayable;
        image.getG2d().setColor(this.getColor());
        int[] xPoints = {this.getPoint1().getX(), this.getPoint2().getX(), this.getPoint3().getX()};
        int[] yPoints = {this.getPoint1().getY(), this.getPoint2().getY(), this.getPoint3().getY()};
        image.getG2d().drawPolygon(xPoints, yPoints, 3);
    }
}
