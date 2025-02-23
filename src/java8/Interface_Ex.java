package java8;

interface Vehicle {
    void start();  // ✅ Abstract Method (Java 1.0 - By Default Public & Abstract)

    default void stop() {  // ✅ Default Method (Java 8)
        System.out.println("Vehicle stopped");
        System.out.println(getFuelInfo()); // ✅ Private Method को अंदर से Call किया
    }

    static void refuel() {  // ✅ Static Method (Java 8)
        System.out.println("Vehicle refueled");
    }

    private String getFuelInfo() { // ✅ Private Method (Java 9+)
        return "Fuel Type: Petrol/Diesel";
    }

    int MAX_SPEED = 200; // ✅ By Default public static final (Java 1.0)
}

// Implementing the Interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class Interface_Ex {
    public static void main(String[] args) {
        Car myCar = new Car();

        // ✅ Calling Abstract Method
        myCar.start();

        // ✅ Calling Default Method (Java 8)
        myCar.stop();

        // ✅ Calling Static Method (Java 8) - Call using Interface Name
        Vehicle.refuel();


        // ✅ Accessing Public Static Final Variable (Java 1.0)
        System.out.println("Max Speed: " + Vehicle.MAX_SPEED);
    }
}
