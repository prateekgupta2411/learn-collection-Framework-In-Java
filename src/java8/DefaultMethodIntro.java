package java8;

interface A {
    default void sayHello() {
        System.out.println("Hii Prateek");
    }
}

interface B {
    default void sayHello() {
        System.out.println("Hii Shobhit");
    }
}

public class DefaultMethodIntro implements A, B {
    public static void main(String[] args) {

        DefaultMethodIntro d = new DefaultMethodIntro();
        d.sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}

