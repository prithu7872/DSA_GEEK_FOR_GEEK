import java.util.Scanner;

public class HCF_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Give two numbers to check for HCF :");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("HCF of two numbers :"+HCF(a,b));
    }
    public static int HCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        else return HCF(b,a%b);
    }

}
