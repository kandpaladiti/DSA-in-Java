package aditi;
import java.util.*;

public class linked_list_collection_framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        list.add("of");
        list.add("Strings");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.add(1,"my");
        System.out.println(list);
    }
}
