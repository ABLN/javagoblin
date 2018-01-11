package demonlord;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panneau1 extends JPanel {


    String adresseImg;

    public JPanel fctAfficherImg(JPanel pan ,int posX ,int posY){

        pan=new JPanel();//

        Icon imgIcon=new ImageIcon("map.jpg");//
        JLabel imgJLabel = new JLabel ();
        imgJLabel.setIcon(imgIcon);

        pan.add(imgJLabel);

        pan.setLayout(null);//positionement-mise en forme du JPanel
        imgJLabel.setSize(1000, 10000);
        imgJLabel.setLocation(posX,posY);

        return pan;
    }

    /* private BufferedImage image;
     public Panneau(){
        setOpaque(true);
        try
        {
            image = ImageIO.read(new File("map.jpg"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        this.setVisible(true);
     }*/

}
