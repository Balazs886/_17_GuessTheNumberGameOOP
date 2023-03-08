package hu.ak_akademia.oop.gtng.game;

import java.util.Random;

class TargetSetter {
    int getNext() {
        Random random = new Random();
        System.out.println("Megvan a kitalálandó szám.\n");
        return random.nextInt(1, Constants.getTargetLimit() + 1);
    }
}
