package Functional_Interface_Example;
@FunctionalInterface
interface MyFunctionalInterface{
    void show(); // Functional interface ka ek abstract method
}
public class Test {
    public static void main(String[] args) {
        //Implement through Lambda Expression
        MyFunctionalInterface obj = () -> System.out.println("Hello, Functional Interface!");
        obj.show();
    }
}
