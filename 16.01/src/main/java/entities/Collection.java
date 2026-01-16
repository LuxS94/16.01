package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {
    Scanner scanner = new Scanner(System.in);

    //metodo per cercare per ID
    public void researchById(ArrayList<GameCollection> listaGiochi) {
        System.out.println("Inserisci l'ID del gioco...");
        int id = Integer.parseInt(scanner.nextLine());
        listaGiochi.stream().filter(g -> g.getId() == id).forEach(g -> System.out.println("Gioco= " + g.getTitolo() + ", " + "Prezzo=" + g.getPrezzo()));

    }

    // metodo per cercare per prezzo che torni lista di giochi con prezzo inferiore
    public List<GameCollection> researchByPrice(ArrayList<GameCollection> listaGiochi) {
        System.out.println("Inserisci il prezzo del gioco...");
        double price = scanner.nextDouble();
        List<GameCollection> lessPrice = new ArrayList<>();
        lessPrice = listaGiochi.stream().filter(g -> g.getPrezzo() < price).toList();
        System.out.println(lessPrice.toString());
        return lessPrice;

    }

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

    //metodo per cercare per numero di giocatori
    public void researchByPlayers(ArrayList<GiochiDaTavolo> listaGiochi) {
        System.out.println("Inserisci il numero di giocatori...;");
        int players = Integer.parseInt(scanner.nextLine());
        listaGiochi.stream().filter(g -> g.getPlayers() == players).forEach(g -> System.out.println("Gioco= " + g.getTitolo() + ", " + "Players=" + g.getPlayers()));

    }

    //metodo per rimuovere un elemento ,dato un id
    public void removeById(ArrayList<GameCollection> listaGiochi) {
        System.out.println("Inserisci l'ID del gioco...;");
        int id = Integer.parseInt(scanner.nextLine());
        listaGiochi.removeIf(g -> g.getId() == id);
        System.out.println(listaGiochi.toString());

    }

    //metodo per aggiornare elemento esistente dato un id
    public GameCollection updateById(ArrayList<GameCollection> listagiochi) {
        System.out.println("Inserisci l'ID del gioco...");
        int id = Integer.parseInt(scanner.nextLine());
        List<GameCollection> list = listagiochi.stream().filter(g -> g.getId() == id).toList();
        GameCollection element = list.getFirst();
        System.out.println("Inserisci il nuovo titolo...;");
        String titolo = scanner.nextLine();
        element.setTitolo(titolo);
        System.out.println("Inserisci il nuovo anno...;");
        int anno = Integer.parseInt(scanner.nextLine());
        element.setAnno(anno);
        System.out.println("Inserisci il nuovo prezzo...;");
        double prezzo = scanner.nextDouble();
        element.setPrezzo(prezzo);
        System.out.println(element.toString());
        return element;
    }

    //stampa numero totale di videogiochi,giochi da tavolo,gioco con prezzo più alto,media prezzi;
    public void statistic(ArrayList<GameCollection> listagiochi) {
        long totVideogames = listagiochi.stream().filter(g -> g instanceof Videogames).count();
        long totTableGames = listagiochi.stream().filter(g -> g instanceof GiochiDaTavolo).count();
        double mp = listagiochi.stream().mapToDouble(g -> g.getPrezzo()).max().orElse(0.0);
        double average = listagiochi.stream().mapToDouble(g -> g.getPrezzo()).average().orElse(0.0);
        System.out.println("tot videogames = " + totVideogames + "; " + "tot giochi da tavolo=" + totTableGames + "; " + "prezzo più alto=" + mp + "; " + "media dei prezzi=" + average + ".");
    }

    ;
}
