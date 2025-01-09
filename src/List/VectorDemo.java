package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
//        Vector<Integer> vector = new Vector<>(5,3);
//        vector.add(1);
//        vector.add(2);
//        vector.add(3);
//        vector.add(4);
//        vector.add(5);
//        System.out.println(vector.capacity());
//        vector.add(5);
//        System.out.println(vector.capacity());
//        vector.add(5);
//        vector.add(5);
//        System.out.println(vector.capacity());
//        vector.add(5);
//        System.out.println(vector.capacity());
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        Vector<Integer> vector1 = new Vector<>(list);
//        System.out.println(vector1);
//        vector1.clear();
//        System.out.println(vector1);

        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                list.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("List Of Size :" + list.size());
    }
}
