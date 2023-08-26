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

    /**
     * Draws a rectangle on the given displayable object.
     * 
     * @param displayable The object on which the rectangle will be drawn.
     */
    public void draw(Displayable displayable) {
        // Cast the displayable object to an Image
        Image image = (Image) displayable;

        // Set the color of the graphic context to the color of this object
        image.getG2d().setColor(this.getColor());

        // Draw a rectangle with the specified dimensions at the specified position
        image.getG2d().drawRect(
                this.getPoint().getX(),
                this.getPoint().getY(),
                this.getWidth(),
                this.getHeight());
    }
}
