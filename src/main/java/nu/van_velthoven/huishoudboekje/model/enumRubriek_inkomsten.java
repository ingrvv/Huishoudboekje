package nu.van_velthoven.huishoudboekje.model;

/**
 *
 * @author @author R. van Velthoven, BSc.
 */
public enum enumRubriek_inkomsten{
   
INKOMSTEN_0("Loon - Wedde"),
INKOMSTEN_1("Pensioen"),
INKOMSTEN_2("Overboekingen"),
INKOMSTEN_3("Kinderbijslag"),
INKOMSTEN_4("Werkloosheidsuitkering"),
INKOMSTEN_5("Invaliditeitsuitkering"),
INKOMSTEN_6("Ziekteuitkering"),
INKOMSTEN_7("Beleggingen / Intresten"),
INKOMSTEN_8("Terugbetaling medische kosten"),
INKOMSTEN_9("Ontvangen giften");

private final String txt;
enumRubriek_inkomsten(String txt){
    this.txt = txt;
}

public String txt(){
    return txt;
    }
}