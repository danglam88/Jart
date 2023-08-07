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

    public void display(int x, int y, Color color) {
        this.image = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
        this.g2d = this.image.createGraphics();
        this.g2d.setColor(color);
    }

    public void save(String string) {
        this.getG2d().dispose();
        try {
            File output = new File(string);
            ImageIO.write(this.getImage(), "PNG", output);
            System.out.println("Image saved to " + string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
