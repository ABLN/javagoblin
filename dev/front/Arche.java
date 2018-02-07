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
/*
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
Arche arche022 = new Arche(0303, 0402, Arche.TypesTerrain.Campagne);*/