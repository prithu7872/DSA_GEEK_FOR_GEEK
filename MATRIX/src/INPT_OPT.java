import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class INPT_OPT {
    public static void main(String[] args) {
        try{
            //creating an array of byte
            byte[] btarr = {'A','B','C','D','E','F'};
            FileOutputStream file_out = new FileOutputStream("C:/Users/PRITHU MISRA/IdeaProjects/GEEK_FOR_GEEK_QUESTIONS/MATRIX/src/new_file.txt");
            for(int i = 0; i < btarr.length; i++){
                file_out.write(btarr[i]);
            }
            file_out.close();
            FileInputStream file_in = new FileInputStream("C:/Users/PRITHU MISRA/IdeaProjects/GEEK_FOR_GEEK_QUESTIONS/MATRIX/src/new_file.txt");
            int file_size = file_in.available();

            for(int i =0;i<file_size;i++){
                System.out.print((char)file_in.read()+" ");
            }
        }catch(IOException e){
            System.out.println("File is not writable");
        }
    }
}
