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

public class Panneau extends JPanel {

	//Tab récupération coordonnées
	public int HexX[] = new int[528];
	public int HexY[] = new int[528];
	private int k = 0;

	// Rayon Hex
	private int R = 35;
	// coordonnées Hex
	private int Ox = 48;
	private int Oox = 48; //remettre valeur de X
	private int Oy = 52;

	private int Col = 11;
	private int Ligne = 48;

	private int x[] = {0, 0, 0, 0, 0, 0};
	private int y[] = {0, 0, 0, 0, 0, 0};

	public void paintComponent(Graphics g){

		try {
			Image img = ImageIO.read(new File("map.jpg"));
			//ImageIcon   trait = new ImageIcon(ImageIO.read(new File("map.jpg")));
			//Image         im   =  trait.getImage();
			//int	hauteur	= im.getHeight(this);
			//int	largeur	= im.getHeight(this);
			//im	= im.getScaledInstance(largeur,hauteur,Image.SCALE_DEFAULT);
			g.drawImage(img, 0, 0, 1198, 1678, this);//largeur et hauteur
			//g.drawImage(img,0,0,this.getWidth() , this.getHeight(), this);
		}
		catch (IOException e) {
		  e.printStackTrace();
		}







		for (int j = 0; j < Ligne; j++){
			for (int i = 0; i < Col; i++){

				// ajout dans le tableau en dur
				HexX[k] = Ox;
				HexY[k] = Oy;
				k = k + 1;

				x[0] = (int)Ox - R;
				y[0] = (int)Oy;
				// System.out.println("x0 : " + x[0]);
				// System.out.println("y0 : " + y[0]);

				x[1] = (int)Ox - R/2;
				y[1] = (int)Oy - R;
				// System.out.println("x1 : " + x[1]);
				// System.out.println("y1 : " + y[1]);

				x[2] = (int)Ox + R/2;
				y[2] = (int)Oy - R;
				// System.out.println("x2 : " + x[2]);
				// System.out.println("y2 : " + y[2]);

				x[3] = (int)Ox + R;
				y[3] = (int)Oy;
				// System.out.println("x3 : " + x[3]);
				// System.out.println("y3 : " + y[3]);

				x[4] = (int)Ox + R/2;
				y[4] = (int)Oy + R;
				// System.out.println("x4 : " + x[4]);
				// System.out.println("y4 : " + y[4]);

				x[5] = (int)Ox - R/2;
				y[5] = (int)Oy + R;
				// System.out.println("x5 : " + x[5]);
				// System.out.println("y5 : " + y[5]);

				// incrémentation pour le prochain de droite
				Ox = Ox + 3*R;
				// System.out.println("inc x : " + Ox);

				g.drawPolygon(x, y, 6);
			}

			Oy = Oy + R;
			if (Ox == Oox + R * 3 * Col){
				Ox = Oox + R + R/2;
			}
			else {
				Ox = Oox;
			}

			// System.out.println("inc y : " + Oy);
		}

		/* for (int i = 0; i < HexX.length; i++){
			System.out.println("pour : "+ i + "On a en X : " + HexX[i]);
			System.out.println("pour : "+ i + "On a en Y : " + HexY[i]);
		} TEST AFFICHAGE VALEUR ORIGINE DES HEXAGONE*/
		
		try {
			Image img1 = ImageIO.read(new File("ressources\\demon_character_ik_high_priest.png"));
			//ImageIcon   trait = new ImageIcon(ImageIO.read(new File("map.jpg")));
			//Image         im   =  trait.getImage();
			//int	hauteur	= im.getHeight(this);
			//int	largeur	= im.getHeight(this);
			//im	= im.getScaledInstance(largeur,hauteur,Image.SCALE_DEFAULT);
			g.drawImage(img1, HexX[1]-20, HexY[1]-20, 40, 40, this);//largeur et hauteur
			//g.drawImage(img,0,0,this.getWidth() , this.getHeight(), this);
		}
		catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
