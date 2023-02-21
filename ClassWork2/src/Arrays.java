import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        ArrayList<String> myList = new ArrayList<>();
        myList.add("123");
        myList.add(0, "345");

        for (String el : myList) {
            System.out.println(el);
        }

        //myList.remove(2);
        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("apple");
        myList2.add("banana");

        myList.addAll(myList2);
        for (String el : myList) {
            System.out.println(el);
        }
    }
}
