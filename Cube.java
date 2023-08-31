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
        try {
            int x = this.getPoint().getX();
            int y = this.getPoint().getY();
            int halfWidth = this.getWidth() / 2;

            // Cast the displayable object to an Image
            Image image = (Image) displayable;

            // Set the color of the graphics object to the color of the shape
            image.getG2d().setColor(this.getColor());

            // Draw 2 squares
            image.getG2d().drawRect(x, y, this.getWidth(), this.getWidth());
            image.getG2d().drawRect(x + halfWidth, y + halfWidth, this.getWidth(), this.getWidth());

            // Draw the lines connecting the squares
            image.getG2d().drawLine(x, y, x + halfWidth, y + halfWidth);
            image.getG2d().drawLine(x + this.getWidth(), y, x + this.getWidth() + halfWidth, y + halfWidth);
            image.getG2d().drawLine(x + this.getWidth(), y + this.getWidth(), x + this.getWidth() + halfWidth,
                    y + this.getWidth() + halfWidth);
            image.getG2d().drawLine(x, y + this.getWidth(), x + halfWidth, y + this.getWidth() + halfWidth);
        } catch (ClassCastException e) {
            // Handle the case where casting to an Image fails
            System.out.println("Displayable object is not an Image");
            e.printStackTrace();
        }
    }
}
