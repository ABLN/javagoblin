import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
class Launch{
	public static void main(String[] args){
		Fenetre fen = new Fenetre();
	}
}

class Fenetre extends JFrame {
  public Fenetre(){
    this.setTitle("DemonLord");
    this.setSize(1920, 1000);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    
	this.setContentPane(new Panneau());
    this.setVisible(true);
  }
}

class Panneau extends JPanel { 
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
