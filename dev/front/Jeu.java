import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Jeu{

	public static void main(String[] args){
		Fenetre fen = new Fenetre();
		
	}
}

class Fenetre extends JFrame {

  private JMenuBar menuBar = new JMenuBar();
  private JMenu options = new JMenu("Options");

  private JMenuItem newPart = new JMenuItem("Nouvelle partie");
  private JMenuItem tuto = new JMenuItem("Tutoriel");
  private JMenuItem rules = new JMenuItem("Regles");
  private JMenuItem quit = new JMenuItem("Quitter");

  public Fenetre(){
    this.setTitle("DemonLord");
    this.setSize(1920, 1080);
    this.setLocationRelativeTo(null);
	this.setResizable(false);
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
}

class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    try {
		Image img = ImageIO.read(new File("map.jpg"));
		g.drawImage(img, 0, 0, 960, 1010, this);
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
