public class Triangle implements Drawable {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public Point getPoint3() {
        return this.point3;
    }

    /**
     * Draws a polygon on the given displayable object.
     * 
     * @param displayable The displayable object on which to draw the polygon.
     */
    public void draw(Displayable displayable) {
        try {
            // Cast the displayable object to an Image
            Image image = (Image) displayable;

            // Set the color of the graphics object to the color of the shape
            image.getG2d().setColor(this.getColor());

            // Get the x and y coordinates of the polygon's points
            int[] xPoints = {this.getPoint1().getX(), this.getPoint2().getX(), this.getPoint3().getX()};
            int[] yPoints = {this.getPoint1().getY(), this.getPoint2().getY(), this.getPoint3().getY()};

            // Draw the polygon with 3 sides (triangle) on the image
            image.getG2d().drawPolygon(xPoints, yPoints, 3);
        } catch (ClassCastException e) {
            // Handle the case where casting to an Image fails
            System.out.println("Displayable object is not an Image");
            e.printStackTrace();
        }
    }
}
