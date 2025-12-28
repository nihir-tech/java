// Class definition
class Car {
    String model;
    String color;

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    // Method to change car color
    void changeColor(String newColor) {
        color = newColor;
    }
}

public class ClassMethodExample {
    public static void main(String[] args) {
        // Creating object
        Car myCar = new Car();
        myCar.model = "Honda";
        myCar.color = "Blue";

        // Calling method
        myCar.displayDetails();

        // Modifying attribute via method
        myCar.changeColor("Red");
        myCar.displayDetails();
    }
}
