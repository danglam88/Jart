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
        // Cast the displayable object to an Image
        Image image = (Image) displayable;

        // Set the color of the graphics object to the color of the shape
        image.getG2d().setColor(this.getColor());

        // Draw the circle (within the square where its top-left point and its side are given) on the image
        image.getG2d().drawOval(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(),
                this.getRadius() * 2, this.getRadius() * 2);
    }

    /**
     * Generates a random Circle object within the specified width and height.
     *
     * @param width  the width of the area
     * @param height the height of the area
     * @return a random Circle object
     */
    public static Circle random(int width, int height) {
        // Generate a random Point object within the specified width and height
        Point center = Point.random(width, height);

        // Calculate the diameter of the circle based on the smaller dimension (width or
        // height)
        int diameter = width;
        if (width > height) {
            diameter = height;
        }

        // Calculate the radius of the circle based on the diameter
        int radius = diameter;

        // Generate a random radius within the range of 1 to half of the diameter
        Random random = new Random();
        do {
            radius = random.nextInt((int) (diameter / 2));
        } while (radius == 0);

        // Create and return a new Circle object with the random center and radius
        return new Circle(center, radius);
    }
}
