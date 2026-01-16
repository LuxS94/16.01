package entities;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    //metodo per cercare per ID
    public static void researchById(ArrayList<GameCollection> listaGiochi, int id) {
        listaGiochi.stream().filter(g -> g.getId() == id).forEach(g -> System.out.println("Gioco= " + g.getTitolo() + ", " + "Prezzo=" + g.getPrezzo()));

    }

    //metodo per aggiungere Giochi con ID diversi:
    public static boolean addGame(ArrayList<GameCollection> listaGiochi, GameCollection gioco) {
        if (listaGiochi.stream().anyMatch(g -> g.getId() == gioco.getId())) {
            System.out.println("ID gioco già esistente,inserire nuovo ID");
            return false;
        } else {
            listaGiochi.add(gioco);
            System.out.println("Gioco aggiunto correttamente!");
            return true;

        }
    }

    // metodo per cercare per prezzo che torni lista di giochi con prezzo inferiore
    public static List<GameCollection> researchByPrice(ArrayList<GameCollection> listaGiochi, double price) {
        List<GameCollection> lessPrice = new ArrayList<>();
        lessPrice = listaGiochi.stream().filter(g -> g.getPrezzo() < price).toList();
        System.out.println(lessPrice.toString());
        return lessPrice;

    }

    ;
}
