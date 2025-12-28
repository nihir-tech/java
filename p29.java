// Class definition
class Car {
    String color;
    String model;
}

public class AccessModifyAttributes {
    public static void main(String[] args) {
        // Creating object
        Car myCar = new Car();
        
        // Accessing attributes
        myCar.model = "Honda";
        myCar.color = "Blue";
        System.out.println("Before modification: " + myCar.model + ", " + myCar.color);
        
        // Modifying attributes
        myCar.model = "Toyota";
        myCar.color = "Red";
        System.out.println("After modification: " + myCar.model + ", " + myCar.color);
    }
}
