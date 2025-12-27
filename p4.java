class AllDataTypes {

    // Instance variables
    byte byteVar = 10;
    short shortVar = 1000;
    int intVar = 50000;
    long longVar = 1000000000L;

    float floatVar = 10.5f;
    double doubleVar = 99.99;

    char charVar = 'F';
    boolean booleanVar = true;

    String stringVar = "Hello Ferved";

    // Static variables
    static int staticInt = 999;
    static String staticString = "Static Variable";

    public static void main(String[] args) {

        // Local variables
        byte localByte = 5;
        short localShort = 50;
        int localInt = 500;
        long localLong = 5000L;

        float localFloat = 5.5f;
        double localDouble = 55.55;

        char localChar = 'A';
        boolean localBoolean = false;

        String localString = "Local String";

        // Object creation to access instance variables
        AllDataTypes obj = new AllDataTypes();

        System.out.println("---- Instance Variables ----");
        System.out.println("byte: " + obj.byteVar);
        System.out.println("short: " + obj.shortVar);
        System.out.println("int: " + obj.intVar);
        System.out.println("long: " + obj.longVar);
        System.out.println("float: " + obj.floatVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("char: " + obj.charVar);
        System.out.println("boolean: " + obj.booleanVar);
        System.out.println("String: " + obj.stringVar);

        System.out.println("\n---- Static Variables ----");
        System.out.println("static int: " + staticInt);
        System.out.println("static String: " + staticString);

        System.out.println("\n---- Local Variables ----");
        System.out.println("byte: " + localByte);
        System.out.println("short: " + localShort);
        System.out.println("int: " + localInt);
        System.out.println("long: " + localLong);
        System.out.println("float: " + localFloat);
        System.out.println("double: " + localDouble);
        System.out.println("char: " + localChar);
        System.out.println("boolean: " + localBoolean);
        System.out.println("String: " + localString);
    }
}
