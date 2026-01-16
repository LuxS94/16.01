import entities.GameCollection;
import entities.Genere;
import entities.GiochiDaTavolo;
import entities.Videogames;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GameCollection> Games = new ArrayList<>();
        Videogames skyrim = new Videogames(110, "Skyrim", 2009, 80.00, "PS3", 180, Genere.FANTASY);
        Videogames FIFA26 = new Videogames(111, "FIFA26", 2026, 100.00, "PS5", 200, Genere.SPORT);
        GiochiDaTavolo monopoly = new GiochiDaTavolo(200, "Monopoly", 1980, 50.00, 8, 200);
        GiochiDaTavolo scacchi = new GiochiDaTavolo(201, "Scacchi", 1940, 30.00, 2, 180);
        Games.add(skyrim);
        Games.add(FIFA26);
        Games.add(monopoly);
        Games.add(scacchi);

    }
}
