package javatraining.oletsky.javastart;

import java.util.Random;

/**
 * @author O.Oletsky
 * Illustrating instances of classes.
 * Simulation of tossing a coin
 */

public class TossACoin {
    public static void main(String[] args) {
        final int N=10;
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            double d = rand.nextDouble();
            String s=(d<=0.5)?"Орел":"Решка";
            System.out.printf("%8.4f - %s\n",d,s);
        }
    }

}
