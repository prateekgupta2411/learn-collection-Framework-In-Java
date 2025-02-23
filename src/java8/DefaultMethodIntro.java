package java8;

interface A {
    default void sayHello() {
        System.out.println("Hi Prateek");
    }
}

interface B {
    default void sayHello() {
        System.out.println("Hi Ritik");
    }
}

public class DefaultMethodIntro implements A, B {
    public static void main(String[] args) {
        DefaultMethodIntro d = new DefaultMethodIntro();
        d.sayHello(); // Explicitly defining which method to call
    }

    @Override
    public void sayHello() {
        A.super.sayHello(); // Resolving ambiguity by specifying A's method
    }
}
