import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteInputs {
    public static void arrayListOfInputs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish): ");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            inputList.add(input);
        }
        for(int a : inputList) {
            System.out.println(a);
        }
    }
    public static void enterAPatternToExit(){
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a number (or 'q' to quit): ");
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    System.out.println("You entered: " + input);
                } else if (scanner.hasNext("q")) {
                    System.out.println("Exiting the program");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number or 'q' to quit.");
                    scanner.next(); // clear the invalid input
                }
            }
        }
    public static void pressEnterToExit(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (press Enter to exit): ");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Exiting the program");
                break;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    System.out.println("You entered: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or press Enter to exit.");
                }
            }
        }

    }
    public static void pract_input(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Enter input and press enter to exit : ");
        while(true){
            String inpt = sc.next();
            if(inpt.equalsIgnoreCase("done"))break;
            inputs.add(inpt);
        }

        for(String inpt : inputs){
            System.out.println(" "+inpt);
        }
        sc.close();
    }
    public static void main(String[] args) {
  //      enterAPatternToExit();
   //     arrayListOfInputs();
   //     pressEnterToExit();
        pract_input();
    }
}
