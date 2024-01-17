import java.util.Scanner;

public class Set_Bit {
    public static int setKthBit(int n,int k){
        return n|(1<<k);
    }
    /*Given an integer N. The task is to return the position of first set bit found from the right
    side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.

Example 1:

Input:
N = 18
Output:
2
Explanation:
Binary representation of 18 is 010010,the first set bit from the right side is at position 2.
*/
    public static int getFirstSetBit(int m){
        if(m==0)return 0;
        int position = 1;
        while ((m & 1) == 0) {
            m = m >> 1;
            position++;
        }
        return position;
    }
    //The loop starts from the least significant bit (LSB) of the variable m. This is because the condition
    // in the while loop checks if the least significant bit of m is 0, and then shifts m to the right by 1 bit in each iteration.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        System.out.println("Enter no set bit at kth position : ");
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println("Number after setting kth bit : "+setKthBit(n,k));
        System.out.println("Check the position of first set bit from LSB: "+getFirstSetBit(n));
    }

}
