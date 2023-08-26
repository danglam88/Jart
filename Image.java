import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private int width;
    private int height;
    private BufferedImage image;
    private Graphics2D g2d;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.display(width, height, Color.BLACK);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public BufferedImage getImage() {
        return this.image;
    }

    public Graphics2D getG2d() {
        return this.g2d;
    }

    /**
     * Display the image with the specified dimensions and color.
     * 
     * @param width  The width of the image.
     * @param height The height of the image.
     * @param color  The color to fill the image with.
     */
    public void display(int width, int height, Color color) {
        // Create a new BufferedImage with the specified dimensions and type.
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Get the Graphics2D object from the image.
        this.g2d = this.image.createGraphics();

        // Set the color of the Graphics2D object to the specified color.
        this.g2d.setColor(color);
    }

    /**
     * Saves the image to a file.
     *
     * @param filePath The path of the file to save the image to.
     */
    public void save(String filePath) {
        // Dispose the graphics object
        this.getG2d().dispose();

        try {
            File output = new File(filePath);

            ImageIO.write(this.getImage(), "PNG", output);

            System.out.println("Image saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
