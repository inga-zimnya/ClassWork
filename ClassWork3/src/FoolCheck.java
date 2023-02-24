import java.io.FileWriter;
import java.io.IOException;
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
            throw new ArithmeticException();
            //сами бросили exception
        }
        catch (ArithmeticException e){
            System.out.println("Введено не число");
        }
        finally{
            System.out.println("КОнец программы");
        }

        methodWithException();

    }

    public static void methodWithException() throws ArithmeticException{
        throw new ArithmeticException();
    }

    public static void methodWithExcOfIO() throws IOException {
        FileWriter a = new FileWriter("aka Programmer");
    }

    public static void methodWithAr() throws ArithmeticException{
        throw new ArithmeticException();
    }
}