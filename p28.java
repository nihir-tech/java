// Class definition
class Car {
    String color;
    String model;

    // Method
    void display() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        // Creating object of Car class
        Car myCar = new Car();
        
        // Accessing object properties
        myCar.model = "Toyota";
        myCar.color = "Red";
        
        // Calling method using object
        myCar.display();
    }
}
