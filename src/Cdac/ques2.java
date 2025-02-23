package Cdac;

public class ques2 {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.println("A");
        } catch (Throwable ex) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void badMethod() {
        throw new Error();
    }
}
