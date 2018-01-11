
package demonlord;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre1 extends JPanel{
 public Fenetre(){
        /*this.setTitle("Ma première fenêtre Java");
        this.setSize(100, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
       // this.setContentPane(new Panneau());
      File f = new File("map.JPG") ;
      try{
            Image img = ImageIO.read(f);
            //g.drawImage(img, 0, 0, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setVisible(true);
  }


public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("map.jpg"));
      g.drawImage(img, 1000, 1000, null);
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
