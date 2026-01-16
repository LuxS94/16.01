package entities;

public class Videogames extends GameCollection {
    private String piattaforma;
    private int durata;
    private Genere genere;


    public Videogames(int id, String titolo, int anno, double prezzo, String piattaforma, int durata, Genere genere) {
        super(id, titolo, anno, prezzo);
        this.piattaforma = piattaforma;
        this.durata = durata;
        this.genere = genere;
        if (durata < 0) {
            throw new IndexOutOfBoundsException("Inserisci una durata valida");
        }
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Videogames{" +
                "id=" + getId() +
                ", titolo=" + getTitolo() +
                ", anno=" + getAnno() +
                ", prezzo=" + getPrezzo() +
                ", piattaforma=" + piattaforma + '\'' +
                ", durata=" + durata +
                ", genere=" + genere +
                '}';
    }
}
