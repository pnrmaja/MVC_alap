package nezet;

import modell.Film;
import modell.Filmek;

public class TablazatNezet {

    private Filmek modell;

    public TablazatNezet(Filmek modell) {
        this.modell = modell;
    }
    private void fej(){
        System.out.printf("%-25s %-25s %-8s %-8s %-12s%n",
            "Rendező", "Cím", "Év", "Pont", "Korhatáros");

        System.out.println("----------------------------------------------------------------------------------");
    }
    
    private void tartalom(){
        for (Film film : modell.getFilmek()) {
        System.out.printf("%-25s %-25s %-8d %-8.1f %-12s%n",
                film.getRendezo(),
                film.getCim(),
                film.getKiadasEve(),
                film.getPont(),
                film.isKorhataros() ? "igen" : "nem"
            );
        }
    }
    public void megjelenit() {
        fej();
        tartalom();
    
    }
}
  
