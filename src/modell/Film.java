package modell;

public class Film {
    private String rendezo;
    private String cim;
    private int kiadasEve;
    private double pont;
    private boolean korhataros;

    public Film(String rendezo, String cim, int kiadasEve, double pont, boolean korhataros) {
        this.rendezo = rendezo;
        this.cim = cim;
        this.kiadasEve = kiadasEve;
        this.pont = pont;
        this.korhataros = korhataros;
    }

    public String getRendezo() {
        return rendezo;
    }

    public String getCim() {
        return cim;
    }

    public int getKiadasEve() {
        return kiadasEve;
    }

    public double getPont() {
        return pont;
    }

    public boolean isKorhataros() {
        return korhataros;
    }

    @Override
    public String toString() {
        return "Film{" + "rendezo=" + rendezo + ", cim=" + cim + ", kiadasEve=" + kiadasEve + ", pont=" + pont + ", korhataros=" + korhataros + '}';
    }
   
}
