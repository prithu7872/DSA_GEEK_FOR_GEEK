import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void FILE_CREATE(File newFile) {
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created Successfully");
            }
            else{
                System.out.println("File already exists!!");
            }
        } catch (IOException e) {
            System.out.println("FILE CREATE FAIL!!");
        }
    }
    public static String FILE_READ(File newFile)  {
        try {
            if (newFile.exists() && newFile.canRead()) {
                Scanner sc = new Scanner(newFile);
                String fileDATA = "";
                while (sc.hasNextLine()) {
                    fileDATA = sc.nextLine();
                }
                return (fileDATA);
            }
        } catch (IOException e) {
            return "FILE CAN NOT BE READ";
        }
        return "FILE NOT FOUND";
    }
    public static void main(String[] args) {
        String name = args[0];
        File newFile = new File("C:\\Users\\PRITHU MISRA\\Downloads\\"+name+".txt");
        FILE_CREATE(newFile);

        System.out.println("FILE DATA : "+FILE_READ(newFile));
    }
}
