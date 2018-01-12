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

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Desktop;

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
	this.setSize(1300, 950); //longeur et hauteur
    this.setLocationRelativeTo(null);
	this.setResizable(false); 	
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Panneau pan = new Panneau();
	this.setContentPane(pan);	
	
	//les options de la barre de menu
	this.options.add(newPart);
	//action de l'option de la nouvelle partie dans la même classe à la case de départ => à voir
	newPart.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {System.exit(0);}
	});
	
	this.options.add(tuto);
	//action de l'option de tutoriel en pdf => à voir
	tuto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {System.exit(0);}
	});
	
	this.options.add(rules);
	//action de l'option de règles en pdf => à voir
	rules.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			try{
				Panneau pan = new Panneau();
				File myFile = new File("Regles.pdf");
				Desktop.getDesktop().open(myFile);
			}catch (IOException error){
				error.printStackTrace();
			}
			
		}
	});
	
	this.options.add(quit);
	//action de l'option de quitter => OK
	quit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {System.exit(0);}
	});
	
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
		
		//ImageIcon   trait = new ImageIcon(ImageIO.read(new File("map.jpg")));
		//Image         im   =  trait.getImage();
		//int	hauteur	= im.getHeight(this);
		//int	largeur	= im.getHeight(this);
		//im	= im.getScaledInstance(largeur,hauteur,Image.SCALE_DEFAULT);
		g.drawImage(img, 0, 0, 1204, 1461, this);//largeur et hauteur
		//g.drawImage(img,0,0,this.getWidth() , this.getHeight(), this);
    }
	catch (IOException e) {
      e.printStackTrace();
    }
	
	int R = 40;
	int Ox = 60;
	int Oox = 60;
	int Oy = 60;
	
	int Col = 3;
	int Ligne = 3;
	
	int x[] = {0, 0, 0, 0, 0, 0};
	int y[] = {0, 0, 0, 0, 0, 0};
	
	for (int j = 0; j < Ligne; j++){
		for (int i = 0; i < Col; i++){
		
			x[0] = (int)Ox - R;
			y[0] = (int)Oy;
			System.out.println("x0 : " + x[0]);
			System.out.println("y0 : " + y[0]);
			
			x[1] = (int)Ox - R/2;
			y[1] = (int)Oy - R;
			System.out.println("x1 : " + x[1]);
			System.out.println("y1 : " + y[1]);
			
			x[2] = (int)Ox + R/2;
			y[2] = (int)Oy - R;
			System.out.println("x2 : " + x[2]);
			System.out.println("y2 : " + y[2]);
			
			x[3] = (int)Ox + R;
			y[3] = (int)Oy;
			System.out.println("x3 : " + x[3]);
			System.out.println("y3 : " + y[3]);
			
			x[4] = (int)Ox + R/2;
			y[4] = (int)Oy + R;
			System.out.println("x4 : " + x[4]);
			System.out.println("y4 : " + y[4]);
			
			x[5] = (int)Ox - R/2;
			y[5] = (int)Oy + R;
			System.out.println("x5 : " + x[5]);
			System.out.println("y5 : " + y[5]);
			
			// incrémentation pour le prochain de droite 
			Ox = Ox + 3*R;
			System.out.println("inc " + Ox);

			
			g.drawPolygon(x, y, 6);
		}
		
		Oy = Oy + R;
		if (Ox == Oox + R * 3 * Col){
			Ox = Oox;
		}
		else {
			Ox = Oox + R + R/2;
		}
		System.out.println("inc " + Oy);
	}
  }
}
