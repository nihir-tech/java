public class ArrayLoopExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For loop: " + arr[i]);
        }

        // for-each loop
        for (int value : arr) {
            System.out.println("For-each loop: " + value);
        }

        // while loop
        int i = 0;
        while (i < arr.length) {
            System.out.println("While loop: " + arr[i]);
            i++;
        }
    }
}
