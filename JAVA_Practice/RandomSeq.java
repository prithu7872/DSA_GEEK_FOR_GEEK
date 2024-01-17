import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//take arguments from command line and print a n random numbers
public class RandomSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(args[0]);
        double start = Double.parseDouble(args[1]);
        double end = Double.parseDouble(args[2]);
        Random random = new Random();//creating a random number object..
        double[] randomNumbers = new double[N];
        for (int i = 0; i < N; i++) {
            randomNumbers[i] = random.nextDouble(end - start + 1)+start;
        }
        Arrays.sort(randomNumbers);
        System.out.println("Random numbers in increasing order:");
        // We can also use System.out.println(" "+String.format("%.2f", num));
        for(double num : randomNumbers) System.out.format(" %.2f\n",num);

    }
}
