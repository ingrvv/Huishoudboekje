package nu.van_velthoven.huishoudboekje.model;

/**
 *
 * @author R. van Velthoven, BSc.
 */
public enum enumRubriek_uitgaven{
   
DAGELIJKSLEVEN_0("DAGELIJKS LEVEN"),
DAGELIJKSLEVEN_1("Boodschappen"),
DAGELIJKSLEVEN_2("Kledij"),
DAGELIJKSLEVEN_3("Poetsen"),
DAGELIJKSLEVEN_4("Opleiding / Lessen"),
DAGELIJKSLEVEN_5("Restaurant"),
DAGELIJKSLEVEN_6("Kapper"),
DAGELIJKSLEVEN_7("Dierenvoeding"),
DAGELIJKSLEVEN_8("Rookwaren"),
DAGELIJKSLEVEN_9("Cosmetica/Parfumerie"),
DAGELIJKSLEVEN_10("Bank- en financiële kosten"),
VERVOER_0("VERVOER"),
VERVOER_1("Autolening"),
VERVOER_2("Brandstof"),
VERVOER_3("Openbaar vervoer"),
VERVOER_4("Onderhoud - Herstellingen"),
ABONNEMENTEN_1("ABONNEMENTEN"),
ABONNEMENTEN_2("Telefoon"),
ABONNEMENTEN_3("GSM"),
ABONNEMENTEN_4("Televisie"),
ABONNEMENTEN_5("Internet"),
HUIS_0("HUIS"),
HUIS_1("Hypotheek/Huur"),
HUIS_2("Elektriciteit"),
HUIS_3("Gas of Aardolie"),
HUIS_4("Huishoudtoestellen"),
HUIS_5("Tuin"),
HUIS_6("Onderhoud - Klusjes"),
HUIS_7("Inrichting"),
GEZONDHEID_0("GEZONDHEID"),
GEZONDHEID_1("Doktersbezoeken"),
GEZONDHEID_2("Apotheek"),
KINDEREN_0("KINDEREN"),
KINDEREN_1("Creche / Babysit"),
KINDEREN_2("School"),
KINDEREN_3("Kinderen - Andere"),
ONTSPANNING_0("ONTSPANNING"),
ONTSPANNING_1("CD's - DVD's - Boeken - Games"),
ONTSPANNING_2("Bioscoop - Concert - Cultuur"),
ONTSPANNING_3("Hobby - Sport"),
ONTSPANNING_4("Uitstapjes"),
ONTSPANNING_5("Speelgoed"),
ONTSPANNING_6("Cadeautjes"),
ONTSPANNING_7("Goede doelen"),
VERPLICHTINGEN_0("VERPLICHTINGEN"),
VERPLICHTINGEN_1("Lening"),
VERPLICHTINGEN_2("Kredietkaart"),
VERPLICHTINGEN_3("Alimentatiegeld"),
ANDERE_0("ANDERE"); 

private final String txt;
enumRubriek_uitgaven(String txt){
    this.txt = txt;
}

public String txt(){
    return txt;
    }
}
