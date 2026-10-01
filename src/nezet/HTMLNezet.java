package nezet;

import modell.Film;
import modell.Filmek;

import java.io.FileWriter;
import java.io.IOException;

public class HTMLNezet {

    private Filmek modell;

    public HTMLNezet(Filmek modell) {
        this.modell = modell;
    }

    private String fej() {
        return """
               <!DOCTYPE html>
               <html>
               <head>
               <meta charset="UTF-8">
               <title>Filmek</title>
               </head>
               <body>
               <table border="1">
               <tr>
               <th>Rendező</th>
               <th>Cím</th>
               <th>Év</th>
               <th>Pont</th>
               <th>Korhatáros</th>
               </tr>
               """;
    }

    private String tartalom() {
        String eredmeny = "";

        for (Film film : modell.getFilmek()) {
            eredmeny += "<tr>";
            eredmeny += "<td>" + film.getRendezo() + "</td>";
            eredmeny += "<td>" + film.getCim() + "</td>";
            eredmeny += "<td>" + film.getKiadasEve() + "</td>";
            eredmeny += "<td>" + film.getPont() + "</td>";
            eredmeny += "<td>" + (film.isKorhataros() ? "igen" : "nem") + "</td>";
            eredmeny += "</tr>";
        }

        return eredmeny;
    }

    public String megjelenit() {
        return fej()
                + tartalom()
                + """
                  </table>
                  </body>
                  </html>
                  """;
    }

    public void fajlbaIr() {
        try (FileWriter iro = new FileWriter("filmek.html")) {
            iro.write(megjelenit());
            System.out.println("HTML fájl elkészült.");
        } catch (IOException e) {
            System.out.println("Hiba a fájl írásakor: " + e.getMessage());
        }
    }
}