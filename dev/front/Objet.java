
class Partie {
  public int NumeroTour;
  public Hexagone Hexagones;
  public String NomPartie;

  public static void main(String[] args){

  }
}

class Tuile {
  public String NomTuile;
}

class Troupe extends Tuile {

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

class Personnage extends Tuile {
  public String Nom;
  public char ModeMouvement;
  public String LocalisationBase;
  public int NiveauMagiePuissance;
  public int NiveauHabilite;
  public int Deplacement;
  public String Type;
}

class Hexagone {

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
  public int CoordonneeX;
  public int CoordonneeY;
}

class CarteDePouvoir {
  public int NiveauMinimum;
  public String Nom;
  public String TypePersonnage;
}
