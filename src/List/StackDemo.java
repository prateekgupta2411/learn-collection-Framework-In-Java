package List;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Integer pop = s.pop();
        System.out.println(s);
        Integer peak = s.peek();
        System.out.println(peak);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        // 1 2 3 4
        int search = s.search(3);
        System.out.println(search);

        LinkedList<Integer> l = new LinkedList<>();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.getLast();// peek
        l.removeLast(); //pop
        s.size();
        s.isEmpty();


    }
}
