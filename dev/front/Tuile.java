import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.image.BufferedImage;

public class Tuile {
  public String Image;

  
    public static Image chargerImage(String nomFic){
		//BufferedImage img = null;
        Image img = null ;
        File f = new File(nomFic);
        try {
            img = ImageIO.read(f);
        } catch (IOException ex) {
            Logger.getLogger(Tuile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return img ;
    }
}