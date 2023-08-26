import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Generates a random Point within the specified width and height.
     *
     * @param width  The maximum x-coordinate value.
     * @param height The maximum y-coordinate value.
     * @return A randomly generated Point.
     */
    public static Point random(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(width), random.nextInt(height));
    }
}
