package nezet;

import modell.Film;
import modell.Filmek;

public class KonzolNezet {
    private Filmek modell;

    public KonzolNezet(Filmek modell) {
        this.modell = modell;
    }
    
    public void megjelenit(){
        for (Film film : modell.getFilmek()) {
            System.out.println(film);
        }
    }
}
