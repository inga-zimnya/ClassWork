import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        ArrayList<String> myList = new ArrayList<>();
        myList.add("123");
        myList.add(0, "345");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

    }
}
