package hu.ak_akademia.oop.gtng.game;

class GreetingsAndInfo {
    void welcome() {
        System.out.println("Üdvözöllek a számkitalálós játékban!\n");
    }

    void printGuidelines() {
        System.out.println("A játék lényege, hogy a program \"gondol\" egy számra 1 és 200 közt, amit Neked ki kell találnod, mégpedig minél kevesebb tippeléssel.\n" +
                "A program minden tipped után közli, hogy a kitalálandó szám kisebb vagy nagyobb, mint a tipp.\n" +
                "Ha viszont a kettő éppen megegyezik, az aktuális menet véget ér - de ha akarod, kezdődhet a következő.\n" +
                "Nulla megadásával bármikor, menet közben is ki tudsz lépni a programból.");
    }

    void farewell() {
        System.out.println("\nViszlát!");
    }
}
