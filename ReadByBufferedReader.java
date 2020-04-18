package javatraining.oletsky.javastart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author O.Oletsky
 * Read a string with BufferedReader
 */
public class ReadByBufferedReader {
    public static void main(String[] args) throws Exception {
        System.out.println("Введіть Ваше ім'я");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String name = br.readLine();
        System.out.println("Привіт Вам, "+name);
    }

}
