package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
//          CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
          // "copy on write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying that existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // this ensure that other threads reading the list while it's being modified are unaffected.
        // read operation : fast and direct, since they happen on a stable list without interference from modifications.
        // write operation: a new copy of the list is created for every modification.
        // the reference to the list is then updated reads use this new list;
        // read more
// copyOnwrite me reading and modify same time me ho rhe hee
//        List<String> shoppingList = new CopyOnWriteArrayList<>();
//        shoppingList.add("Milk");
//        shoppingList.add("Bread");
//        shoppingList.add("Elaichii");
//        System.out.println("Initial Shopping List : " + shoppingList);
//
//        for(String item : shoppingList){
//            System.out.println(item);
//            // try to modify the list while reading
//            if(item.equals("Bread")){
//                shoppingList.add("Tea");
//                System.out.println("Add tea while reading");
//            }
//        }
//        System.out.println("updated shopping list: " + shoppingList);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (Integer item : list) {
            if (item == 2) {
                list.remove(item);
            }
        }
        System.out.println(list);

    }
}
