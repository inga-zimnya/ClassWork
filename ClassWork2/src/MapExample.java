import java.util.HashMap;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("apple", "яблоко");
        myHashMap.put("pear", "груша");

        Set<String> keySet = myHashMap.keySet();
        //set of keys of our hashMap
        for (String key : keySet) {
            System.out.println(key + ": ");
            System.out.println(myHashMap.get(key));
        }


        myHashMap.forEach();
    }
}
