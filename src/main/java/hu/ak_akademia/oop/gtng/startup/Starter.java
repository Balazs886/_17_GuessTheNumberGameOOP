package hu.ak_akademia.oop.gtng.startup;

import hu.ak_akademia.oop.gtng.game.Game;

import java.util.Scanner;


public class Starter extends Game  {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        SCANNER.close();
    }
}
