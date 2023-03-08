package hu.ak_akademia.oop.gtng.game;

import java.util.Scanner;

import static hu.ak_akademia.oop.gtng.startup.Starter.SCANNER;

class Session extends Game {

    public Session() {
        super();
    }

    //    Scanner scanner = new Scanner(System.in);
    static int tipCount;
    static int tip = 0;
    static boolean checker = false;


    Completion play(int target) {
        boolean first = true;

        while (canSessionStart(first)) {
            tipCount = 0;
            do {
                first = false;
                tipCount++;
                tip = giveANumber();
                if (tip == 0) {
                    return Completion.ABRUPT_QUIT;
                }
            } while (!checker(target) && tipCount < Constants.getMaxTipCount());
            evaluate();
        }
        return Completion.NORMAL_END;
    }

    private int giveANumber() {
        System.out.print(tipCount + ". tipp:");
        return SCANNER.nextInt();
    }

    private boolean checker(int target) {
        if (target < tip) {
            System.out.println("kisebb, mint " + tip);
            return false;
        } else if (tip < target) {
            System.out.println("nagyobb, mint " + tip);
            return checker = false;
        }
        return checker = true;
    }

    private void evaluate() {
        if (checker) {
            if (tipCount <= 2) {
                System.out.println("Ráhibáztál! Nagy szerencséd volt!");
            } else if (tipCount < Constants.getNominalTipCount()) {
                System.out.println("Korán eltaláltad, szerencsés vagy!");
            } else if (tipCount == Constants.getNominalTipCount()) {
                System.out.println("Rendben, időben eltaláltad.");
            } else if (tipCount <= Constants.getMaxTipCount()) {
                System.out.println("Eltaláltad, bár lehettél volna kicsit gyorsabb is.");
            }
        } else {
            System.out.println("Ez most nem sikerült. Gondold végig a tippelési stratégiát!");
        }
    }
}