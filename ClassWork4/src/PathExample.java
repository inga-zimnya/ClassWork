import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PathExample {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Inga\\Desktop");
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.startsWith("C:\\Users\\Inga"));
        //проверка идёт с корня

//        Path pathForNewFile = Path.of("C:\\Users\\Inga\\Desktop\\ex2");
//        try{
//            Path exFile = Files.createFile(pathForNewFile);
//            System.out.println(Files.exists(exFile));
//
//            try{
//                Path dir  = Path.of("C:\\Users\\Inga\\Desktop\\newDir");
//                Files.createDirectory(dir);
//                Files.move(exFile, dir);
//            }
//            catch (Exception e){
//                System.out.println("Directory already exists");
//            }
//        }
//        catch (FileAlreadyExistsException e){
//            System.out.println("File already exists");
//        }

        try{
            Path pathForNewFile = Path.of("C:\\Users\\Inga\\Desktop\\test.txt");
            Files.newOutputStream(pathForNewFile);
        } catch (IOException e){
            System.out.println("Проблема при записи в файл");
        }

        FileWriter fw = new FileWriter("C:\\Users\\Inga\\Desktop\\test.txt");
        fw.write("Inga is the best, she will achieve all her goals and she'll find a man for love");
        fw.close();

        FileReader fr = new FileReader("C:\\Users\\Inga\\Desktop\\test.txt");
        Scanner scan = new Scanner(fr);

        try {
            System.out.println(scan.nextLine());
        }
        catch (NoSuchElementException e){
            System.out.println("Файл пуст");
        }

        fr.close();




    }
}
