import java.util.Random;
import java.awt.Color;

interface Displayable {
    void display(int x, int y, Color color);

    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);

    /**
     * @return The randomly generated Color object.
     */
    default Color getColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}

public class Main {
    /*
     * This is the main method of the program.
     * It creates an image and draws shapes on it.
     * Finally, it saves the image as "image.png"
     */
    public static void main(String[] args) {
        // Create a mew image with dimensions 1000x1000
        Image image = new Image(1000, 1000);

        // Create a line with two points and draw it on the image
        Line line1 = new Line(new Point(50, 950), new Point(900, 950));
        line1.draw(image);

        // Create another line with two points and draw it on the image
        Line line2 = new Line(new Point(950, 400), new Point(950, 800));
        line2.draw(image);

        // Create a rectangle with two points and draw it on the image
        Rectangle rectangle1 = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle1.draw(image);

        // Create another rectangle with two points and draw it on the image
        Rectangle rectangle2 = new Rectangle(new Point(50, 500), new Point(300, 700));
        rectangle2.draw(image);

        // Create a triangle with three points and draw it on the image
        Triangle triangle1 = new Triangle(new Point(100, 100), new Point(900, 900),
                new Point(100, 900));
        triangle1.draw(image);

        // Create another triangle with three points and draw it on the image
        Triangle triangle2 = new Triangle(new Point(950, 50), new Point(950, 300),
                new Point(750, 50));
        triangle2.draw(image);

        // Create 50 random circles and draw them on the image
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        // Create a pentagon and draw it on the image
        Pentagon pentagon = new Pentagon(new Point(500, 300), 200, 0);
        pentagon.draw(image);

        // Create a cube and draw it on the image
        Cube cube = new Cube(new Point(500, 500), 200);
        cube.draw(image);

        // Save the image as "image.png"
        image.save("image.png");
    }
}
