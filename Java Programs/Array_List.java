package aditi;
//import java.util.ArrayList;
//import java.util.Collections;
import java.util.*;

/* Heap Memory, size not fixed, non-contiguous, create objects, perform operations -> add, get, modify, delete/remove, iterate.*/

class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // or ArrayList<Integer> list = new ArrayList<>();
        /*ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        By the we can create array list for strings and booleans as well.
         */

        //add a elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element = list.get(1);
        System.out.println(element);
        //System.out.println(list.get(0));

        //to add element in between
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of arraylist
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
