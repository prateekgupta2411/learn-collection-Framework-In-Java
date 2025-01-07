package List;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
//        int num = 2;
//
//        // Adding with a character
//        System.out.println(num + ' '); // Output: 34 (2 + 32)
//
//        // Adding with a string
////        System.out.println(num + " "); // Output: 2 (with space)
//        ArrayList<Integer> list  = new ArrayList<>();
//        list.add(2);
//        list.add(4);
//        list.add(6);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//        for(int lists : list){
//            System.out.print(lists + " ");
//        }
//        System.out.println();
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(50));
//        System.out.println(list.remove(2));
//        for(int lists : list){
//            System.out.print(lists + " ");
//        }
//        list.add(2,80);
//        for(int lists : list){
//            System.out.print(lists + " ");
//        }
//        list.set(2, 50);
//        System.out.println(list);
//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//        List<String> list1 = Arrays.asList("monday", "Tuesday");
//        list1.set(1,"Sunday");
//        System.out.println(list1.get(1));
//        System.out.println(list1.getClass().getName());
//        List<String> list4 = new ArrayList<>(list1);
//        list4.add("Mango");
//        System.out.println(list4);
//        List<Integer> list3 = List.of(1,2,5,4);
//        list3.set(1,"Sunday"); // nhi kr pa rhe he
//        System.out.println(list1.get(1));
//        System.out.println(list1.getClass().getName());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(0,5);
        List<Integer> list1 = List.of(8,9,7,4,8);
        list.addAll(list1);
        System.out.println(list);
        list.remove(Integer.valueOf(4)); // index nhi value remove hogi
        System.out.println(list);
//        Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }
}
