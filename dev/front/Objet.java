public class Partie {
  public NumeroTour NumeroTour;
  
  public String NomPartie;
}

public class Tuile {

}

public class Troupe extends Tuile {
  public String Nom;
  public char ModeMouvement;
  public String LocalisationBase;
  public String TypeArmement;
  public String TypeTroupe;
  public int Deplacement;
  public int Moral;
  public int ValeurMele;
  public int ValeurMissile;
  public String EtatArmure;
}

public class Personnage extends Tuile {
  public String Nom;
  public char ModeMouvement;
  public String LocalisationBase;
  public int NiveauMagiePuissance;NiveauHabilité
  public int NiveauHabilité;
  public int Deplacement;
  public String Type;
}

public class Hexagone extends NumeroTour {

  public String Territoire;
  public String Occupation;
  public String SousTypeTerrainArrete1;
  public String SousTypeTerrainArrete2;
  public String SousTypeTerrainArrete3;
  public String SousTypeTerrainArrete4;
  public String SousTypeTerrainArrete5;
  public String SousTypeTerrainArrete6;
  public String TypeTerrain;
  public Tuile Tuiles;
  public int CoordonnéeX;
  public int CoordonnéeY;
}
