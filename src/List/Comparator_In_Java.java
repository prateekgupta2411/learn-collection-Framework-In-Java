package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1-o2;
////        return o2 - o1; // decending order
//    }
//}
//class MyComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() - o1.length();// decending
//    }
// For ascending order: o1 - o2 gives negative value if o1 < o2, so o1 comes before o2.
// For descending order: o2 - o1 gives positive value if o2 > o1, so o2 comes before o1.
//}
public class Comparator_In_Java {
    public static void main(String[] args) {
//        ArrayList<Integer>list = new ArrayList<>();
//        list.add(1);
//        list.add(0);
//        list.add(5);
//        list.sort(new MyComparator());
//        System.out.println(list);
//         List<String> list = Arrays.asList("Apple", "Roys", "Banana");
//         list.sort(new MyComparator());
//        System.out.println(list);

        // use directly arrow function donot use Comparator implementation
        List<String> list3 = Arrays.asList("man", "Roys", "Banana");
        list3.sort((a,b) -> b.length() - a.length());
        System.out.println(list3);
    }
}
