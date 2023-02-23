import java.util.Scanner;
public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        try{
            System.out.println(10 / a);
        }
        catch(ArithmeticException e){
            System.out.println("0 is a bad divisor");
        }
        finally{
            System.out.println("End of the program");
        }

    }
}
