import java.util.LinkedList;

public class LinkedListJK {
    public static void main(String[] args) {
        /*** LinkedList use more memory than ArrayList
         *   They might be a good choice if you need to insert or remove lots of elements to the list without needing to retrieve them very often,
         *   as this is normally slightly faster with a LinkedList.
         *
         *  on an empty list
         *   .poll = null
         *   .pop = no such element exception. */

        LinkedList <String> myList = new LinkedList<>();
        myList.add("first item");
        String secondItem = "second item";
        myList.add(secondItem);
        myList.add("third item");

        System.out.println(myList);
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

        // da izbrisemo 1. element = poll
        System.out.println(myList.poll());
        System.out.println(myList);

        System.out.println(myList.pop());
        System.out.println(myList);



    }
}
