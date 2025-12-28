public class MethodWithIfElse {

    // method with parameter and if-else
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(20);  // Output: You are eligible to vote
        checkAge(15);  // Output: You are not eligible to vote
    }
}
