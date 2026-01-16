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
}
