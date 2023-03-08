package hu.ak_akademia.oop.gtng.game;

class Constants {
    private static final int TARGET_LIMIT = 200;
    private static final int NOMINAL_TIP_COUNT = 8;
    private static final int MAX_TIP_COUNT = 15;

    static int getTargetLimit() {
        return TARGET_LIMIT;
    }

    static int getNominalTipCount() {
        return NOMINAL_TIP_COUNT;
    }

    static int getMaxTipCount() {
        return MAX_TIP_COUNT;
    }
}
