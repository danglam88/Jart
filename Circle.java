import java.awt.Graphics2D;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public int getRadius() {
        return this.radius;
    }

    public void draw(Displayable displayable) {
        Image image = (Image) displayable;
        image.getG2d().setColor(this.getColor());
        image.getG2d().drawOval(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), this.getRadius() * 2, this.getRadius() * 2);
    }

    public static Circle random(int width, int height) {
        Point center = Point.random(width, height);
        int diameter = width;
        if (width > height) {
            diameter = height;
        }
        int radius = diameter;
        Random random = new Random();
        do {
            radius = random.nextInt((int) (diameter / 2));
        } while (radius == 0);
        return new Circle(center, radius);
    }
}
