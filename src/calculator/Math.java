package calculator;

public class Math {
    public static void add(int x, int y) {
        System.out.println(x+y);
    }
    public static void subtract(int x, int y) {
        System.out.println(x-y);
    }
    public static void multiply(int x, int y) {
        System.out.println(x*y);
    }
    public static void divide(int x, int y) {
        System.out.println(x/y);
    }
    public static void modulus(int x, int y) {
        System.out.println(x%y);
    }
    public static void greaterThan(int x, int y) {
        if (x > y) {
            System.out.println(x + " är större än " + y);
        }
        else {
            System.out.println(x + " är inte större än " + y);
        }
    }
    public static void lesserThan(int x, int y) {
        if(x < y) {
            System.out.println(x + " är mindre än " + y);
        }
        else {
            System.out.println(x + " är inte mindre än " + y);
        }
    }
    public static void equals(int x, int y) {
        if(x == y) {
            System.out.println(x + " är lika med " + y);
        }
        else {
            System.out.println(x + " är inte lika med " + y);
        }
    }
}
