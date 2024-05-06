import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class file_handling_2 {
    public static void main(String[] args) {
        try{
            String file = "test.txt";
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ;
            String res ="";
            String regex = "^[a-zA-Z0-9]*$";
            while((line=br.readLine())!=null){
                res += line;
            }
            System.out.println("res "+res+" check : "+res.matches(regex));
        }catch(IOException e){
            System.out.println("NO file");
        }

    }
}
