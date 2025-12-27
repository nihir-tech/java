class MathFunctionsExample {
    public static void main(String[] args) {

        int a = -10;
        int b = 5;
        double c = 4.7;

        System.out.println("---- Math Functions ----");

        System.out.println("Absolute value: " + Math.abs(a));
        System.out.println("Maximum value: " + Math.max(a, b));
        System.out.println("Minimum value: " + Math.min(a, b));

        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Cube root of 27: " + Math.cbrt(27));

        System.out.println("Power (2^3): " + Math.pow(2, 3));

        System.out.println("Round value: " + Math.round(c));
        System.out.println("Ceil value: " + Math.ceil(c));
        System.out.println("Floor value: " + Math.floor(c));

        System.out.println("Random number (0–1): " + Math.random());
    }
}
