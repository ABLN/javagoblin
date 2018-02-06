public class Arche {
  public int Hexa1;
  public int Hexa2;
  public TypesTerrain TypeTerrain;

  public Arche(int Hexa11, int Hexa12, TypesTerrain TTerrain)
  {
    Hexa1 = Hexa11;
    Hexa2 = Hexa12;
    TypeTerrain = TTerrain;
  }
  public enum TypesTerrain{
    Campagne,
    Riviere,
    Route,
    Colline
  }
}
