package java8;

@FunctionalInterface
interface Greeting {
    void sayGreeting(); // Functional Interface ka ek abstract method
    default void sayHello(){

    }
}

public class LamdaExpressionExample {
    public static void main(String[] args) {
        // Lambda Expression
        Greeting greeting = () -> {
            System.out.println("Hello");
        };

        // Method call
        greeting.sayGreeting(); // Output: Hello
    }
}
