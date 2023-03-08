package hu.ak_akademia.oop.gtng.game;

import java.util.Scanner;

import static hu.ak_akademia.oop.gtng.startup.Starter.SCANNER;

public class Game {

//    Scanner scanner = new Scanner(System.in);
    public Game() {
    }

    public void play() {
        GreetingsAndInfo greetingsAndInfo = new GreetingsAndInfo();
        greetingsAndInfo.welcome();
        greetingsAndInfo.printGuidelines();

        TargetSetter targetSetter = new TargetSetter();

        Session session = new Session();
        session.play(targetSetter.getNext());


        greetingsAndInfo.farewell();
    }

    boolean canSessionStart(boolean first) {

        if (first) {
            System.out.println("Kezdődhet az első menet (i/n)?");
        } else {
            System.out.println("\nKezdődhet a következő menet (i/n)?");
        }
        do {
            String response = SCANNER.nextLine();
            if (response.equals("i")) {
                return true;
            } else if (response.equals("n")) {
                return false;
            }
            System.out.println("Ooopsz valami félre ment! Kérlek igen esetén I betűt, nem esetén N betűt üss le, majd nyomj entert.");
        } while (true);

    }

}