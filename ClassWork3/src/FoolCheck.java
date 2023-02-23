import java.util.InputMismatchException;
import java.util.Scanner;

public class FoolCheck {

    public static void methodToTest(int number){
        int res = 100 / number;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String word;
//
//        do{
//            word = scan.next();
//        }while(word.length() > 10);

        try{
            int a = scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Введено не число");
        }

    }
}