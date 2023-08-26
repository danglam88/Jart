public class Cube implements Drawable {
    private Point point;
    private int width;

    public Cube(Point point, int width) {
        int x = point.getX();
        int y = point.getY();
        this.point = new Point(x, y);
        this.width = width;
    }

    public Point getPoint() {
        return this.point;
    }

    public int getWidth() {
        return this.width;
    }

    /**
     * Draws a cube on the given displayable object.
     * 
     * @param displayable The object on which the cube will be drawn.
     */
    public void draw(Displayable displayable) {
        int x = this.getPoint().getX();
        int y = this.getPoint().getY();
        int quarterWidth = this.getWidth() / 4;

        // Cast the displayable object to an Image
        Image image = (Image) displayable;

        // Set the color of the graphics object to the color of the shape
        image.getG2d().setColor(this.getColor());

        // Draw 2 squares
        image.getG2d().drawRect(x, y, this.getWidth(), this.getWidth());
        image.getG2d().drawRect(x + quarterWidth, y + quarterWidth, this.getWidth(), this.getWidth());

        // Draw the lines connecting the squares
        image.getG2d().drawLine(x, y, x + quarterWidth, y + quarterWidth);
        image.getG2d().drawLine(x + this.getWidth(), y, x + this.getWidth() + quarterWidth, y + quarterWidth);
        image.getG2d().drawLine(x + this.getWidth(), y + this.getWidth(), x + this.getWidth() + quarterWidth,
                y + this.getWidth() + quarterWidth);
        image.getG2d().drawLine(x, y + this.getWidth(), x + quarterWidth, y + this.getWidth() + quarterWidth);
    }
}
