import java.util.Random;
import java.awt.Color;

interface Displayable {
    void display(int x, int y, Color color);

    void save(String string);
}

interface Drawable {
    void draw(Displayable displayable);

    default Color getColor() {
        Random random = new Random();
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}

public class Main {
    /*
     * This is the main method of the program.
     * It creates and image and draws shapes on it.
     * Finally, it saves the image as "image.png"
     */
    public static void main(String[] args) {
        // Create a mew image with dimentions 1000x1000
        Image image = new Image(1000, 1000);

        // Create a rectangle with two points and draw it on the image
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);

        // Create a triangle with three points and draw it on the image
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        // Create 50 random circles and draw them on the image
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        // Save the image as "image.png"
        image.save("image.png");
    }
}
