package javatraining.oletsky.javastart;

public class DemoConstuctors {
    public static void main(String[] args) {
        DemoClass ekz1 = new DemoClass(5);
        DemoClass ekz2 = new DemoClass(20);
        System.out.println(ekz1.calculateSquare());
        System.out.println(ekz2.calculateSquare());
    }
}

class DemoClass {
    int i = 10;

    public DemoClass(int i) {
        this.i = i;
    }

    public int calculateSquare() {
        return i*i;
    }



}
