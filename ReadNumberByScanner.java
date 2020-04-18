package javatraining.oletsky.javastart;

import java.util.Scanner;

/**
 * @author O.Oletsky
 * Reading a number with Scanner
 */
public class ReadNumberByScanner {
    public static void main(String[] args) throws Exception {
        System.out.println("Введіть число");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Квадрат числа "+n+" дорівнює "+n*n);
    }

}
