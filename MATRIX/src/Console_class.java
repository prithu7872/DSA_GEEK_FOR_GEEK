import java.io.Console;
import java.util.Arrays;

public class Console_class {
    public static void main(String[] args) {
        //creating a console object
        //Factory concept
        Console obj = System.console();
        String name;
        String[] arr ;
        System.out.print("Enter Name :");
        name = obj.readLine();
        System.out.println("Enter password : ");

        System.out.println();
    }
}
