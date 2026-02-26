import java.util.Scanner;
class A {
    int x, y;
    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        x = sc.nextInt();
        System.out.print("Enter value of y: ");
        y = sc.nextInt();
    }
    void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
class B extends A {
    int p, q;
    void get_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of p: ");
        p = sc.nextInt();
        System.out.print("Enter value of q: ");
        q = sc.nextInt();
    }
    void put_data() {
        display();
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}
class C extends B {
    void add() {
        int sum = x + y + p + q;
        System.out.println("Addition (x + y + p + q) = " + sum);
    }
    void mul() {
        long product = (long) x * y * p * q;
        System.out.println("Multiplication (x * y * p * q) = " + product);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C obj = new C();
        obj.get();
        obj.get_data();
        obj.put_data();
        obj.add();
        obj.mul();
        sc.close();
    }
}
