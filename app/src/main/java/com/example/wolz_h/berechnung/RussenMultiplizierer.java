package com.example.wolz_h.berechnung;


public class RussenMultiplizierer {


    public static boolean isCreaterOrEqualOne(Integer zaehler) {
        return zaehler >= 1;
    }

    public static boolean shouldAddValue(Integer multiplier) {
        return multiplier % 2 != 0;
    }

    public static int divideByTwo(int ersteZahl) {
        return new Integer(ersteZahl / 2);
    }

    public static int multiyplyByTwo(int multiplier) {
        return multiplier * 2;
    }

    public static int addValues(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }


    public static int mult(int ersteZahl, int zweiteZahl) {
        return calc(ersteZahl, zweiteZahl);
    }

    public static int calc(int zaehler, int zweiteZahl) {
        int result = 0;


        while (isCreaterOrEqualOne(zaehler)) {

            if (shouldAddValue(zaehler)) {
                result += zweiteZahl;
            }
            zaehler = divideByTwo(zaehler);
            zweiteZahl = multiyplyByTwo(zweiteZahl);
        }
        return result;

    }


    public static int Mult(int x, int y){
        int sum = 0;

        while(x>=1){
            if(x %2 !=0){
                sum +=y;
            }
            x = x /2;
            y= y*2;
        }
        return sum;
    }
}
