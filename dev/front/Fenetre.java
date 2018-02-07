import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Desktop;
import java.awt.Dimension;

class Fenetre extends JFrame {

  private JMenuBar menuBar = new JMenuBar();
  private JMenu options = new JMenu("Options");
  private JMenuItem newPart = new JMenuItem("Nouvelle partie");
  private JMenuItem tuto = new JMenuItem("Tutoriel");
  private JMenuItem rules = new JMenuItem("Regles");
  private JMenuItem quit = new JMenuItem("Quitter");
 
  public Fenetre(){

    this.setTitle("DemonLord");
	this.setSize(1300, 1000); //longeur et hauteur
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	Panneau pan = new Panneau();
    JScrollPane scrollPane = new JScrollPane(pan);
    pan.setPreferredSize(new Dimension(1198, 1678));
  
    this.add(scrollPane);
    
	setMenu();
	
    //Barre de menu
  this.menuBar.add(options);
  this.setJMenuBar(menuBar);
  this.setVisible(true);
  }
  
  
  
  public void setMenu() {
	  
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
  }
  
}
