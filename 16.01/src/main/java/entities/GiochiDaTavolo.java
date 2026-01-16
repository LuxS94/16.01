package entities;

public class GiochiDaTavolo extends GameCollection {
    private int players;
    private int durata;

    public GiochiDaTavolo(int id, String titolo, int anno, double prezzo, int players, int durata) {
        super(id, titolo, anno, prezzo);
        this.players = players;
        this.durata = durata;
        if (players < 2 || players > 10) {
            throw new IndexOutOfBoundsException("Range di giocatori 2-10");
        }
        if (durata < 0) {
            throw new IndexOutOfBoundsException("Inserisci una durata valida");
        }

    }

    public int getPlayers() {
        return players;
    }

    public int getDurata() {
        return durata;
    }
}

