import java.awt.Polygon;

public class Pentagon implements Drawable {
    private Point point;
    private int radius;

    public Pentagon(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return this.point;
    }

    public void draw(Displayable displayable) {
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();

        // Cast the displayable object to an Image
        Image image = (Image) displayable;

        // Set the color of the graphics object to the color of the shape
        image.getG2d().setColor(this.getColor());

        // Create a new Polygon object to represent the pentagon
        Polygon pentagon = new Polygon();

        // Calculate the x and y coordinates of the five points of the pentagon
        for (int i = 0; i < 5; i++) {
            double angle = 2 * Math.PI / 5 * i;
            int px = (int) (x + radius * Math.cos(angle));
            int py = (int) (y + radius * Math.sin(angle));
            pentagon.addPoint(px, py);
        }

        // Draw the pentagon on the image
        image.getG2d().drawPolygon(pentagon);
    }
}