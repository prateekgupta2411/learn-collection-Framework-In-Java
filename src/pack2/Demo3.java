package pack2;
interface Greeting {
    void sayHello();
}
public class Demo3 {
    public static void main(String[] args) {
        // Anonymous inner class implementing the Greeting interface
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greet.sayHello();
    }
}
