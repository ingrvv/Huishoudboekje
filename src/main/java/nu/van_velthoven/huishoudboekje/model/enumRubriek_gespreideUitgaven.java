package nu.van_velthoven.huishoudboekje.model;

/**
 *
 * @author R. van Velthoven, BSc.
 */
public enum enumRubriek_gespreideUitgaven{
   
UITGAVEN0("Autoverzekering"),
UITGAVEN1("Rijtaksen"),
UITGAVEN2("Woningverzekering"),
UITGAVEN3("Renovatie"),
UITGAVEN4("Water"),
UITGAVEN5("Ziekenfonds"),
UITGAVEN6("Levensverzekering"),
UITGAVEN7("Hospitalisatieverzekering"),
UITGAVEN8("Andere verzekeringen"),
UITGAVEN9("Abonnement Kranten - Tijdschriften"),
UITGAVEN10("Lidmaatschap hobby- of sportclub"),
UITGAVEN11("Vakanties"),
UITGAVEN12("Personenbelasting"),
UITGAVEN13("Onroerende voorheffing"),
UITGAVEN14("Gemeentebelasting"),
UITGAVEN15("Provinciebelasting");

private final String txt;
enumRubriek_gespreideUitgaven(String txt){
    this.txt = txt;
}

public String txt(){
    return txt;
    }
}
