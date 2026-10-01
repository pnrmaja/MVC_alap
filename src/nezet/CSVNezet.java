package nezet;

import modell.Film;
import modell.Filmek;

import java.io.FileWriter;
import java.io.IOException;

public class CSVNezet {

    private Filmek modell;

    public CSVNezet(Filmek modell) {
        this.modell = modell;
    }

    private String fej() {
        return "Mutató;Érték\n";
    }

    private String tartalom() {

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

        String eredmeny = "";

        eredmeny += "Filmek száma;" + darab + "\n";
        eredmeny += "Átlagos pontszám;" + String.format("%.2f", atlag) + "\n";
        eredmeny += "Legjobb értékelés;" + String.format("%.1f", legjobb) + "\n";
        eredmeny += "Legrosszabb értékelés;" + String.format("%.1f", legrosszabb) + "\n";
        eredmeny += "Korhatáros filmek;" + korhataros + "\n";
        eredmeny += "Nem korhatáros filmek;" + (darab - korhataros) + "\n";

        return eredmeny;
    }

    public String megjelenit() {
        return fej() + tartalom();
    }

    public void fajlbaIr() {

        try (FileWriter iro = new FileWriter("statisztika.csv")) {

            iro.write(megjelenit());

            System.out.println("A statisztika elkészült: statisztika.csv");

        } catch (IOException e) {
            System.out.println("Hiba a fájl írásakor: " + e.getMessage());
        }
    }
}