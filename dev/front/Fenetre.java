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