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
import javax.swing.*;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Desktop;

class Fenetre extends JFrame {

  private JMenuBar menuBar = new JMenuBar();
  private JMenu options = new JMenu("Options");

  private JMenuItem newPart = new JMenuItem("Nouvelle partie");
  private JMenuItem tuto = new JMenuItem("Tutoriel");
  private JMenuItem rules = new JMenuItem("Regles");
  private JMenuItem quit = new JMenuItem("Quitter");

  public Fenetre(){



    Arche arche001 = new Arche(0101, 0102, Arche.TypesTerrain.Campagne);
		Arche arche002 = new Arche(0101, 0201, Arche.TypesTerrain.Campagne);
		Arche arche003 = new Arche(0201, 0102, Arche.TypesTerrain.Colline);
		Arche arche004 = new Arche(0301, 0201, Arche.TypesTerrain.Campagne);
		Arche arche005 = new Arche(0301, 0401, Arche.TypesTerrain.Campagne);
		Arche arche006 = new Arche(0201, 0302, Arche.TypesTerrain.Colline);
		Arche arche007 = new Arche(0102, 0202, Arche.TypesTerrain.Colline);
		Arche arche008 = new Arche(0102, 0103, Arche.TypesTerrain.Riviere);
		Arche arche009 = new Arche(0103, 0202, Arche.TypesTerrain.Riviere);
		Arche arche010 = new Arche(0201, 0202, Arche.TypesTerrain.Colline);
		Arche arche011 = new Arche(0202, 0302, Arche.TypesTerrain.Colline);
		Arche arche012 = new Arche(0301, 0302, Arche.TypesTerrain.Route);
		Arche arche013 = new Arche(0401, 0302, Arche.TypesTerrain.Colline);
		Arche arche014 = new Arche(0401, 0501, Arche.TypesTerrain.Campagne);
		Arche arche015 = new Arche(0104, 0103, Arche.TypesTerrain.Riviere);
		Arche arche016 = new Arche(0104, 0203, Arche.TypesTerrain.Riviere);
		Arche arche017 = new Arche(0203, 0202, Arche.TypesTerrain.Riviere);
		Arche arche018 = new Arche(0203, 0103, Arche.TypesTerrain.Colline);
		Arche arche019 = new Arche(0203, 0303, Arche.TypesTerrain.Riviere);
		Arche arche020 = new Arche(0303, 0202, Arche.TypesTerrain.Colline);
		Arche arche021 = new Arche(0303, 0302, Arche.TypesTerrain.Route);
		Arche arche022 = new Arche(0303, 0402, Arche.TypesTerrain.Campagne);

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
