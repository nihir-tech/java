public class LogicalOperatorsAll {
    public static void main(String[] args) {
        int age = 17;
        boolean hasID = true;
        boolean isMember = false;

        if ((age >= 18 && hasID) || !isMember) {
            System.out.println("Access allowed");
        } else {
            System.out.println("Access denied");
        }
    }
}
