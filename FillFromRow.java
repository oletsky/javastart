package fillarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FillFromRow {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int nextNumb;
        System.out.println("Enter your numbers");
        while ((nextNumb=scan.nextInt())!=0) {
            list.add(nextNumb);
        }
        System.out.println("Resulting list:");
        System.out.println(list);
    }
}
