package run;

import controller.MidSquare;

public class Runner {

    /*
     * Si se desea hacer uso de un caso de prueba en particular basta con comentar el caso de prueba
     * que se está evaluando con el fin de que no entorpezca la lectura de los datos del caso de prueba
     * que se desea probar, posteriormente llame el caso de prueba que desea evaluar pasando como tercer
     * parametro la cantidad de numeros que desea generar.
     * */

    public static void main(String[] args) {
        //  caseOne(4, 727, 100);
        caseTwo(4, 128, 100);
    }

    public static void caseOne(int digits, int seed, int count) {
        new MidSquare(digits, seed, count).generateValues();
    }

    public static void caseTwo(int digits, int seed, int count) {
        new MidSquare(digits, seed, count).generateValues();
    }

}
