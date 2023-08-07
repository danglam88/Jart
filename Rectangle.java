import java.awt.Graphics2D;

public class Rectangle implements Drawable {
    private Point point;
    private int width;
    private int height;

    public Rectangle(Point point1, Point point2) {
        int x = point1.getX();
        int y = point1.getY();
        if (point1.getX() > point2.getX()) {
            x = point2.getX();
        }
        if (point1.getY() > point2.getY()) {
            y = point2.getY();
        }
        this.point = new Point(x, y);
        this.width = Math.abs(point1.getX() - point2.getX());
        this.height = Math.abs(point1.getY() - point2.getY());
    }

    public Point getPoint() {
        return this.point;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void draw(Displayable displayable) {
        Image image = (Image) displayable;
        image.getG2d().setColor(this.getColor());
        image.getG2d().drawRect(this.getPoint().getX(), this.getPoint().getY(), this.getWidth(), this.getHeight());
    }
}
