package demonlord;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Demonlord {

    public static void main(String[] args) {
      /* Image image = null;
        try {
            // Read from a file
            File file = new File("map.jpg");
            image = ImageIO.read(file);
 
            // Read from an input stream
            InputStream is = new BufferedInputStream(new FileInputStream("map.jpg"));
            image = ImageIO.read(is);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
 
        // Use a label to display the image
        JFrame frame = new JFrame();
        
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);*/
        
        JFrame fenetre = new JFrame();
                fenetre.setTitle("Demonlord");
                fenetre.setSize(1000, 1000);
                fenetre.setLocationRelativeTo(null);
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                 
                Icon demon = new ImageIcon("map.jpg");
                JLabel demonlord = new JLabel();
                demonlord.setIcon(demon);
 
               fenetre.add(demonlord); // Ajout à la JFrame
               fenetre.setVisible(true); //On peut enfin afficher le tout*/
        
   
    }
}
