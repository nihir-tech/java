public class WhileDoWhileExample {
    public static void main(String[] args) {
        int i = 1;

        // while loop
        while (i <= 3) {
            System.out.println("While loop: " + i);
            i++;
        }

        int j = 1;

        // do-while loop
        do {
            System.out.println("Do-While loop: " + j);
            j++;
        } while (j <= 3);
    }
}
