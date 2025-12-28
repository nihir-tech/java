public class SimpleRecursion {
    static void countdown(int n) {
        if (n == 0) {   // base case
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
