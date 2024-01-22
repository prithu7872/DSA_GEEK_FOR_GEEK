import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.println("Enter no to check kth bit : ");
        n = sc.nextInt();
        k = sc.nextInt();
        boolean answer = checkKthBit_BitManipulation(n, k);
        System.out.println("Is kth bit set : "+ answer);
        boolean answer2 = checkKthBit(n, k);
        System.out.println("Is kth bit set (using String) : "+ answer2);
    }
    /**/
    public static boolean checkKthBit(int n, int k)
    {
        // Your code here
        String bin = Integer.toBinaryString(n);
        if(k>=bin.length()) return false;
        return bin.charAt(bin.length()-k-1)=='1';
    }
    public static boolean checkKthBit_BitManipulation(int n, int k){
        return ((n&(1<<k))!=0);
    }

}
