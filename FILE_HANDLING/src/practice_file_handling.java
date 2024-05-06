
import java.io.*;

public class practice_file_handling {
    public static void main(String[] args) {
        String file = "test.txt";
        try{
            FileOutputStream fox = new FileOutputStream(file);
            String input = "hello world 123";
            fox.write(input.getBytes());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            FileInputStream fis = new FileInputStream(file);
            StringBuilder result = new StringBuilder();
            int res ;
            while((res = fis.read())!=-1){
                result.append((char)res);
            }
            System.out.println(result.toString());
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
