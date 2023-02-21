import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Boolean> myLinkedList = new LinkedList<Boolean>();
        myLinkedList.add(true);
        myLinkedList.add(false);

        myLinkedList.addFirst(true);
        myLinkedList.addLast(false);

        System.out.println(myLinkedList.poll());
        System.out.println();

        for (Boolean el : myLinkedList) {
            System.out.println(el);
        }
    }
}
