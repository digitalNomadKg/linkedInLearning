package example;

import java.util.LinkedList;

public class LinkedListExample {


    private static void testing() {
        System.out.println("Hello this is LinkedList");

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Honda Jazz");
        linkedList.add("My world is great");
        linkedList.add("Mercedes-Benz");

        System.out.println(linkedList);

        linkedList.remove(1);
        linkedList.add(1, "This is new element");
        System.out.println(linkedList);

        linkedList.remove(0);
        linkedList.add(0, "Roger F, need a help");
        System.out.println(linkedList);

        linkedList.add("New item added"); //it will be added at the end
        System.out.println(linkedList);
        System.out.println();

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.contains("Roger F, need a help"));

        System.out.println(linkedList.remove(0));
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);

    }

    public static void main(String[] args) {
        testing();

    }
}
