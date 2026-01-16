package entities;

public class GiochiDaTavolo extends GameCollection {
    private int players;
    private int durata;

    public GiochiDaTavolo(int id, String titolo, int anno, double prezzo, int players, int durata) {
        super(id, titolo, anno, prezzo);


        if (players < 2 || players > 10) {
            throw new IndexOutOfBoundsException("Range di giocatori 2-10");
        }
        this.players = players;
        if (durata < 0) {
            throw new IndexOutOfBoundsException("Inserisci una durata valida");
        }
        this.durata = durata;
    }

    public int getPlayers() {
        return players;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "GiochiDaTavolo{" +
                "id=" + getId() +
                ", titolo=" + getTitolo() +
                ", anno=" + getAnno() +
                ", prezzo=" + getPrezzo() +
                ", players=" + players +
                ", durata=" + durata +
                '}';
    }
}

