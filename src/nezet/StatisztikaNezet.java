package nezet;

import modell.Film;
import modell.Filmek;

public class StatisztikaNezet {

    private Filmek modell;

    public StatisztikaNezet(Filmek modell) {
        this.modell = modell;
    }

    private void fej() {
        System.out.println("========== FILM STATISZTIKA ==========");
    }

    private void tartalom() {
        int darab = 0;
        int korhataros = 0;
        double osszeg = 0;
        double legjobb = 0;
        double legrosszabb = 10;

        for (Film film : modell.getFilmek()) {

            darab++;

            osszeg += film.getPont();

            if (film.getPont() > legjobb) {
                legjobb = film.getPont();
            }

            if (film.getPont() < legrosszabb) {
                legrosszabb = film.getPont();
            }

            if (film.isKorhataros()) {
                korhataros++;
            }
        }

        double atlag = osszeg / darab;

        System.out.println();
        System.out.println("Filmek száma:             " + darab + " db");
        System.out.printf("Átlagos pontszám:         %.2f%n", atlag);
        System.out.printf("Legjobb értékelés:        %.1f%n", legjobb);
        System.out.printf("Legrosszabb értékelés:    %.1f%n", legrosszabb);
        System.out.println();
        System.out.println("Korhatáros filmek:        " + korhataros + " db");
        System.out.println("Nem korhatáros filmek:    " + (darab - korhataros) + " db");
        System.out.println();
    }

    public void megjelenit() {
        fej();
        tartalom();
        System.out.println("======================================");
    }
}