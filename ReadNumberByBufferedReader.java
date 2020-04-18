package javatraining.oletsky.javastart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author O.Oletsky
 * Reading a number by BufferedReader
 */
public class ReadNumberByBufferedReader {
    public static void main(String[] args) throws Exception {
        System.out.println("Введіть число");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String inp = br.readLine();
        int n=Integer.parseInt(inp);
        System.out.println("Квадрат числа "+n+" дорівнює "+n*n);
    }

}
