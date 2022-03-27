package task2;

/**
 * Применить на практике возможные преобразования без потери точности.
 * 1. byte->short->int->long
 * 2. int->double
 * 3. short->float->double
 * 4. char->int
 */

public class Main {

    public static void main(String[] args) {

        byte a = 127;
        short b = a;
        int c = a;
        long d = a;
        System.out.println(d);

        int a1 = 999999999;
        double b1 = a1;
        System.out.println(b1);

        short a2 = 32111;
        float b2 = a2;
        double c2 = b2;
        System.out.println(c2);

        int a3 = 'a' + 5;
        System.out.println(a3);
    }
}