import java.util.Scanner;

public class FoolCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;

        do{
            word = scan.next();
        }while(word.length() > 10);

//        System.out.println("Слово слишком длинное");
//        word = scan.next();
    }
}