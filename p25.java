public class MethodOverloading {

    // Method 1: adds two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: adds two doubles
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));       // calls method 1
        System.out.println(add(5, 10, 15));   // calls method 2
        System.out.println(add(2.5, 3.5));    // calls method 3
    }
}
