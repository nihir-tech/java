class StringExample {
    public static void main(String[] args) {

        String str = "  Hello Java World  ";
        String name = "Ferved";

        System.out.println("Original String: " + str);

        // length()
        System.out.println("Length: " + str.length());

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trimmed: " + str.trim());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // substring()
        System.out.println("Substring: " + str.substring(2, 7));

        // equals()
        System.out.println("Equals 'Ferved': " + name.equals("Ferved"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case 'ferved': " + name.equalsIgnoreCase("ferved"));

        // contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // replace()
        System.out.println("Replace Java with Python: " + str.replace("Java", "Python"));

        // indexOf()
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // concat()
        System.out.println("Concatenated String: " + name.concat(" Learning Java"));
    }
}
