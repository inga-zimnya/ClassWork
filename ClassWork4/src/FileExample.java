import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File newDir = new File("C:\\Users\\Inga\\Desktop");
        File newFile = new File("C:\\Users\\Inga\\Desktop", "test.txt");

//        System.out.println(newDir.exists());
//        System.out.println(newFile.canExecute());
//        System.out.println(newDir.isDirectory());
//        System.out.println(newFile.getParentFile());

        File fileToCreate = new File("C:\\Users\\Inga\\Desktop\\example");
        System.out.println(fileToCreate.createNewFile());

        System.out.println(fileToCreate.renameTo(new File("C:\\Users\\Inga\\Desktop\\ex")));

        System.out.println(fileToCreate.delete());


    }
}
