class OperatorsExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("---- Arithmetic Operators ----");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n---- Relational Operators ----");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\n---- Logical Operators ----");
        System.out.println("(a > b && b > 0) : " + (a > b && b > 0));
        System.out.println("(a > b || b > 10): " + (a > b || b > 10));
        System.out.println("!(a > b) : " + !(a > b));

        // Assignment Operators
        System.out.println("\n---- Assignment Operators ----");
        int c = 10;
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 3;
        System.out.println("c -= 3 : " + c);

        // Unary Operators
        System.out.println("\n---- Unary Operators ----");
        int x = 5;
        System.out.println("x++ : " + x++);
        System.out.println("++x : " + ++x);
        System.out.println("x-- : " + x--);
        System.out.println("--x : " + --x);

        // Ternary Operator
        System.out.println("\n---- Ternary Operator ----");
        int max = (a > b) ? a : b;
        System.out.println("Greater value is: " + max);
    }
}
