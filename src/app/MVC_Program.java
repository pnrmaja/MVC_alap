package app;

import nezet.KonzolNezet;
import modell.Filmek;
import nezet.HTMLNezet;
import nezet.TablazatNezet;


public class MVC_Program {

    public static void main(String[] args) {
        Filmek modell = new Filmek();
        new KonzolNezet(new Filmek()).megjelenit();
        new TablazatNezet(modell).megjelenit();
        HTMLNezet html = new HTMLNezet(modell);
        html.fajlbaIr();
    }
    
}
