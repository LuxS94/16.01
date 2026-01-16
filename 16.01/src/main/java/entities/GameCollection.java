package entities;

public abstract class GameCollection {
    private int id;
    private String titolo;
    private int anno;
    private double prezzo;

    public GameCollection(int id, String titolo, int anno, double prezzo) {
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
        this.prezzo = prezzo;
        if (anno < 1940 || anno > 2030) {
            throw new IndexOutOfBoundsException("Inserisci un anno valido");
        }
        ;
        if (prezzo < 0) {
            throw new IndexOutOfBoundsException("Inserisci un prezzo valido");
        }
        ;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnno() {
        return anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "GameCollection{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", prezzo=" + prezzo +
                '}';
    }
}
