package fillarraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleFill {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        try {
            while (scan.hasNext()) {
                list.add(scan.nextInt());
            }
        }
        catch (InputMismatchException ime){
            System.out.println("Input finished");
        }
        System.out.println(list);

    }
}
