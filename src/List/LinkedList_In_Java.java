package List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_In_Java {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add((2));
        ll.add(3);
        ll.add(2,10);
        ll.get(2); // O(n)
        ll.addFirst(0); // O(1)
        ll.addLast(4); // O(1)
        System.out.println(ll);
        ll.removeIf(x -> x % 2 == 0);
        System.out.println(ll);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Tiger", "Lion", "Eleplant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("Tiger", "Dog"));
        animal.removeAll(animalToRemove);
        System.out.println(animal);
    }
}
