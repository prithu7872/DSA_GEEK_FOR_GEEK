import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class file_inpt_bufferReader {
    public static void main(String[] args) {
        try{
            FileInputStream file_inpt = new FileInputStream("C:/Users/PRITHU MISRA/IdeaProjects/GEEK_FOR_GEEK_QUESTIONS/MATRIX/src/new_file.txt");
            BufferedInputStream buffered_input = new BufferedInputStream(file_inpt);
            int i ;
            while((i=buffered_input.read())!=-1){
                System.out.println((char)i);
            }
            buffered_input.close();
            file_inpt.close();
        }catch(Exception e){
            System.out.println("Exception is " + e.getMessage());
        }
    }
}
