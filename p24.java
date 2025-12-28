public class MethodWithReturn {

    // method that returns a value
    static int square(int num) {
        return num * num;  // returns the square of num
    }

    public static void main(String[] args) {
        int result = square(5);  // method call
        System.out.println("Square: " + result);
    }
}
