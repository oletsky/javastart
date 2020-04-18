package javatraining.oletsky.javastart;

/**
 * @author O.Oletsky
 * Illustrating command line arguments
 */
public class DemoCommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Provided arguments:");
        for (var arg:args) {
            System.out.println(arg);
        }
    }

}
