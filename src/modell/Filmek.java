package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filmek {
    private ArrayList<Film> filmek;

    public Filmek() {
        filmek = new ArrayList<>();
        
        Film film1 = new Film("Christopher Nolan", "Eredet", 2010, 8.8, false);
        Film film2 = new Film("Steven Spielberg", "Jurassic Park", 1993, 8.2, false);
        Film film3 = new Film("Quentin Tarantino", "Ponyvaregény", 1994, 8.9, true);
        Film film4 = new Film("James Cameron", "Avatar", 2009, 7.8, false);
        Film film5 = new Film("Robert Eggers", "A boszorkány", 2015, 7.0, true);
        Film[] filmek = {film1, film2, film3, film4, film5};
        for (Film film : filmek) {
            felvesz(film);
        }
    }

    /* ez setter */
    public void felvesz(Film film) {
        filmek.add(film);
    }

    public List<Film> getFilmek() {
        return Collections.unmodifiableList(filmek);
    }
    
    
}
