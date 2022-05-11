package run;

import controller.MidSquare;

public class Runner {

    public static void main(String[] args) {
        int digits = 4;
        int seed = 727;
        int count = 100;

        long timeStart = System.currentTimeMillis();
        new MidSquare(digits, seed, count).generateValues();
        long timeEnd = System.currentTimeMillis();

        System.out.println("Tiempo de: " + (timeEnd - timeStart));

    }


}
