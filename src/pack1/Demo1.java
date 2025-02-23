package pack1;


public class Demo1 {
    protected static int number = 42; // Protected member

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        // System.out.println(obj.number); // Error: number has protected access in Parent
        System.out.println(number); // Works because it's inherited
    }
}


class SubClass extends Demo1 {
    public static void accessProtected() {

    }
}

