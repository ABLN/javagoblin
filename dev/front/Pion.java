class Pion{

    public String Nom;
    public char modeDeMouvement;
    public String Localisation;
    public int deplacement;
    public String image;

}

class Personnage extends Pion{

    public char type;
    public int niveauMagie;
    public int niveauHabilite;

}

class Troupe extends Pion{

    public char typeArmement;
    public char typeTroupe;
    public int moral;
    public int valeurMele;
    public int valeurMissile;
    public int etatArmure;

}

/*
public class Personnage extends Pion {


    pion p1 = new pion("Hight Priest", "C", "HO", "5", "5", "0", "5");
    pion p2 = new pion("Priest", "C", "HO", "4", "4", "null", "6");
    pion p3 = new pion("Monks", "C", "HO", "3", "3", "null", "7");
    pion p4 = new pion("Bishop", "C", "HO", "2", "3", "1", "7");
    pion p5 = new pion("Duke d'Ansar", "C", "DA", "4", "4", "1", "7");
    pion p6 = new pion("Prince Timur", "C", "TI", "1", "0", "2", "6");
    pion p7 = new pion("Wizard Rabat", "F", "CR", "2", "4", "0", "5");
    pion p8 = new pion("Baron Barthek", "C", "BA", "2", "1", "2", "7");
    pion p9 = new pion("Count Lojar", "C", "CL", "2", "1", "2", "7");
    pion p10 = new pion("Captain General", "C", "ME", "2", "0", "1", "7");
    pion p11 = new pion("Captain Dar", "C", "ME", "0", "0", "7", "1");
    pion p12 = new pion("Light Spirit", "W", "IN", "4", "6", "0", "8");
    pion p13 = new pion("West Wizart", "F", "INR", "4", "7", "0", "5");
    pion p14 = new pion("Lord Nish", "C", "NI", "4", "4", "2", "7");
    pion p15 = new pion("Lord Taegul", "C", "TA", "3", "2", "1", "7");
    pion p16 = new pion("Captain General", "C", "IK", "3", "2", "1", "7");
    pion p17 = new pion("High Priest", "F", "IK", "5", "4", "0", "3");
    pion p18 = new pion("Prince Tor", "W", "IK", "3", "3", "1", "9");
    pion p19 = new pion("Shaman", "C", "TS", "3", "8", "0", "6");
    pion p20 = new pion("Yorgash", "W", "YO", "5", "2", "1", "8");
    pion p21 = new pion("Worm Lord", "W", "TNC", "4", "5", "0", "9");
    pion p22 = new pion("Temple Priests", "F", "TN", "2", "6", "0", "3");
    pion p23 = new pion("Lord erush", "C", "ER", "2", "2", "1", "7");
    pion p24 = new pion("Forest Spririt", "W", "GW", "5", "0", "0", "8");
    pion p25 = new pion("Best God", "F", "GW", "4", "3", "1", "4");
    pion p26 = new pion("Cloud Prince", "W", "LY", "2", "4", "0", "9");
    pion p27 = new pion("Duke Han", "F", "AH", "3", "4", "0", "5");
    pion p28 = new pion("Old One", "F", "AN", "5", "2", "0", "3");
    pion p29 = new pion("Balron", "W", "MU", "4", "1", "2", "8");
    pion p30 = new pion("Dwarf King", "F", "MU", "2", "1", "1", "4");

}

public class troupe extends pion{

    pion p31 = new pion("","W","HO","9","4","6","4");
    pion p32 = new pion("","C","HO","6","6","6","0");
    pion p33 = new pion("","F","HO","4","6","5","0");
    pion p34 = new pion("","W","HO","4","5","5","4");
    pion p35 = new pion("","C","DA","5","5","8","0");
    pion p36 = new pion("","W","DA","5","4","7","0");
    pion p37 = new pion("","F","DA","3","4","7","5");
    pion p38 = new pion("","F","DA","3","4","6","5");
    pion p39 = new pion("","F","DA","3","2","4","4");
    pion p40 = new pion("","C","GU","5","4","7","5");
    pion p41 = new pion("","F","GU","3","2","4","3");
    pion p42 = new pion("","C","TI","5","5","8","0");
    pion p43 = new pion("","C","TI","5","5","8","0");
    pion p44 = new pion("","C","TI","5","5","8","0");
    pion p45 = new pion("","C","TI","5","4","7","4");
    pion p46 = new pion("","C","TI","5","4","7","4");
    pion p47 = new pion("","C","TI","5","4","7","0");
    pion p48 = new pion("","F","TI","3","4","7","5");
    pion p49 = new pion("","F","TI","3","4","6","7");
    pion p50 = new pion("","F","TI","4","4","6","0");
    pion p51 = new pion("","F","TI","3","3","5","3");
    pion p52 = new pion("","F","CR","3","5","7","0");
    pion p53 = new pion("","F","CR","3","5","7","0");
    pion p54 = new pion("","F","CR","4","4","6","7");
    pion p55 = new pion("","F","CR","4","2","4","0");
    pion p56 = new pion("","C","WT","6","3","6","6");
    pion p57 = new pion("","F","CR","4","3","4","6");
    pion p58 = new pion("","F","CR","3","2","4","4");
    pion p59 = new pion("","F","CR","8","5","7","6");
    pion p60 = new pion("","C","BA","6","5","7","7");
    pion p61 = new pion("","C","BA","6","4","6","6");
    pion p62 = new pion("","C","BA","6","4","6","6");
    pion p63 = new pion("","F","BA","4","4","5","6");
    pion p64 = new pion("","F","BA","3","4","5","6");
    pion p65 = new pion("","C","BA","7","5","5","5");
    pion p66 = new pion("","C","CL","6","4","7","5");
    pion p67 = new pion("","F","CL","4","4","6","5");
    pion p68 = new pion("","C","ME","5","5","8","0");
    pion p69 = new pion("","C","ME","5","4","6","7");
    pion p70 = new pion("","C","ME","5","3","5","7");
    pion p71 = new pion("","C","ME","5","4","7","0");
    pion p72 = new pion("","C","ME","3","4","7","0");
    pion p73 = new pion("","F","ME","4","4","5","6");
    pion p74 = new pion("","F","ME","4","4","6","0");
    pion p75 = new pion("","W","NI","8","5","8","4");
    pion p76 = new pion("","C","NI","5","6","9","0");
    pion p77 = new pion("","C","NI","6","5","7","5");
    pion p78 = new pion("","C","NI","5","4","6","5");
    pion p79 = new pion("","C","NI","5","4","6","5");
    pion p80 = new pion("","F","NI","3","6","8","6");
    pion p81 = new pion("","F","GW","4","5","7","5");
    pion p82 = new pion("","F","LY","2","6","5","0");
    pion p83 = new pion("","F","AH","4","5","7","0");
    pion p84 = new pion("","F","AN","3","5","7","0");
    pion p85 = new pion("","F","MU","3","3","5","4");
    pion p86 = new pion("","F","MU","3","3","5","4");

}*/

