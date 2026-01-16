package entities;

import java.util.ArrayList;

public class Collection {
    //metodo per aggiungere Giochi con ID diversi:
    public boolean addGame(ArrayList<GameCollection> listaGiochi, GameCollection gioco) {
        if (listaGiochi.stream().anyMatch(g -> g.getId() == gioco.getId())) {
            System.out.println("ID gioco già esistente,inserire nuovo ID");
            return false;
        } else {
            listaGiochi.add(gioco);
            System.out.println("Gioco aggiunto correttamente!");
            return true;

        }
    }
}
