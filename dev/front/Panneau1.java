import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panneau1 extends JPanel {

public void paintComponent(Graphics g){
    try {
		Image img = ImageIO.read(new File("map.jpg"));
//		g.drawImage(img, 0, 0, this);
		g.drawImage(img, 0, 0, this.getWidth(), this.getWidth(), this);
    }
	catch (IOException e) {
      e.printStackTrace();
    }

    int x[] = {20, 30, 50, 60, 60, 50};
    int y[] = {30, 20, 20, 30, 50, 60};
    g.drawPolygon(x, y, 6);

    int x2[] = {50, 60, 80, 90, 90, 80};
    int y2[] = {60, 50, 50, 60, 80, 90};
    g.drawPolygon(x2, y2, 6);
  }
}