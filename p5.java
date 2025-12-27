class TypeCastingExample {
    public static void main(String[] args) {

        // Implicit casting (Widening)
        int intValue = 10;
        double doubleValue = intValue;

        // Explicit casting (Narrowing)
        double doubleNum = 15.75;
        int intNum = (int) doubleNum;

        // Explicit casting (int to char)
        int ascii = 65;
        char character = (char) ascii;

        // Explicit casting (int to byte - overflow case)
        int bigNumber = 130;
        byte byteValue = (byte) bigNumber;

        System.out.println("---- Implicit Casting ----");
        System.out.println("int to double: " + doubleValue);

        System.out.println("\n---- Explicit Casting ----");
        System.out.println("double to int: " + intNum);
        System.out.println("int to char: " + character);
        System.out.println("int to byte: " + byteValue);
    }
}
