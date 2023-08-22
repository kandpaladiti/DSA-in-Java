package aditi;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing_HashSet {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        //Size
        System.out.println("Size of set is : " + set.size());

        //Print all elements
        System.out.println(set);

        //Search - Contains
        if (set.contains(1)){
            System.out.println("Set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("Does not contains");
        }

        //Delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Does not contains 1 - we deleted 1");
        }

        //Iterator
        Iterator it = set.iterator();
        //hashNext ; next
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
