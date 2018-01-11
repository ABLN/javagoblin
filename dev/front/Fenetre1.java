import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Fenetre1 extends JFrame{
	
  private JMenuBar menuBar = new JMenuBar();
  private JMenu options = new JMenu("Options");

  private JMenuItem newPart = new JMenuItem("Nouvelle partie");
  private JMenuItem tuto = new JMenuItem("Tutoriel");
  private JMenuItem rules = new JMenuItem("Regle");
  private JMenuItem quit = new JMenuItem("Quitter");
 public Fenetre1(){
    this.setTitle("DemonLord");
    this.setSize(1920, 1000);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	this.setContentPane(new Panneau());
	
	//les options de la barre de menu
	this.options.add(newPart);
	this.options.add(tuto);
	this.options.add(rules);
	this.options.add(quit);
	//Barre de menu
	this.menuBar.add(options);

	this.setJMenuBar(menuBar);
	
    this.setVisible(true);
  }


/*public void paintComponent(Graphics g){
    try {
      Image img = ImageIO.read(new File("map.jpg"));
      g.drawImage(img, 1000, 1000, null);
      //Pour une image de fond
      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }*/
}
