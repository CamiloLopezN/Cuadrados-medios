package controller;

public class MidSquare {
    private int digits;
    private int seed;
    private int count;

    public MidSquare(int digits, int seed, int count) {
        this.digits = digits;
        this.seed = seed;
        this.count = count;
    }

    public void generateValues(){
        for (int i = 1; i <= count; i++) {
            int number = getNumbers(seed);
            System.out.println(i + " - Probabilidad de " + number / Math.pow(10, digits));
            seed = number;
        }
    }

    public int getNumbers(int seed) {
        int number = (int) Math.pow(seed, 2);
        int lengthNumber = Integer.toString(number).length();
        int initialNumber = (int) (lengthNumber / 2.0 - 1.0);
        String newNumber = "";
        for (int i = initialNumber - 1; i < initialNumber + digits - 1; i++) {
            newNumber += Integer.toString(number).charAt(i);
        }
        return Integer.parseInt(newNumber);
    }

}
