import java.util.InputMismatchException;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r;
        double s;

        boolean condition = true;

        while(condition){
            try{
                r = scan.nextInt();
                s = Math.PI * Math.pow(r, 2);
                System.out.println(s);
                condition = false;
            }
            catch(InputMismatchException e){
                System.out.println("Введено не число");
            }

        }






    }
}
