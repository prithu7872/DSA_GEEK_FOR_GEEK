import java.sql.SQLOutput;

public class Bit_basic_tricks {
    public static int multiply_by_2(int n) {
        return (n << 1);
    }

    public static int divide_by_2(int n) {
        return (n >> 1);
    }

    public static int maxConsecutiveOnes(int N) {

        // Your code here
        if ((N & (N - 1)) == 0) return 1;
        else if (((N + 1) & (N)) == 1) return ((int) (Math.log(N) / Math.log(2)));
        else if (((N + 2) & (N + 1)) == 1) return ((int) ((Math.log(N + 2) / Math.log(2)) - 1));
        else if (((N + 3) & (N + 2)) == 1) return ((int) ((Math.log(N + 3) / Math.log(2)) - 2));
        int max = 0;
        int count = 0;
        while (N > 0) {
            if ((N & 1) == 1) count++;
            else count = 0;
            if (count > max) max = count;
            N >>= 1;
        }
        return max;
    }

    public static int flipBits(int x) {
        int value = 0;
        int num = x;
        while (x > 0) {
            value = (value << 1) + 1;
            x = x >> 1;
        }
        return value - num;
    }

    public static void swapNUM(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    public static boolean checkPower_of_2(int num) {
 /*If we subtract a number which is a power of 2 with 1 then all of it's unset bits
   after the only set bit become set and the set bit become unset. For example,
   consider 4 ( Binary representation: 100) and 16(Binary representation: 10000),
           we get following after subtracting 1 from them:
       3 –> 011
       15 –> 01111
 You can clearly see that bitwise-AND(&) of 4 and 3 gives zero, similarly 16 and 15
 also gives zero. So, if a number N is a power of 2 then bitwise-AND(&) of N and
 N-1 will be zero. We can say that N is a power of 2 or not based on the value of N&(N-1).
 */
        return (num & (num - 1)) == 0;
    }

    public static int posOfRightMostDiffBit(int m, int n) {
        int pos = 0;
        if (m == n) return -1;
        int Min_num = Math.min(m, n);
        int Max_num = Math.max(m, n);
        while (Max_num > 0) {
            ++pos;
            if ((Max_num & 1) != (Min_num & 1)) break;
            Min_num >>= 1;
            Max_num >>= 1;
        }
        return pos;
    }

    public static int countBitsFlip(int a, int b) {
        int XOR_of_a_b = a ^ b;
        int bits = 0;
        while (XOR_of_a_b > 0) {
            if ((XOR_of_a_b & 1) == 1) bits += 1;
            XOR_of_a_b >>= 1;
        }
        return bits;
    }

    public static int swapBits(int n) {
        // Get all even bits
        int evenBits = n & 0xAAAAAAAA;
        // Get all odd bits
        int oddBits = n & 0x55555555;
        // Right shift even bits, left shift odd bits, and combine them
        return (evenBits >> 1) | (oddBits << 1);
    }

    public static int most_significant_bit(int num) {
        //check its log2(num) value
        int power = 0;
        while (num > 0) {
            num >>= 1;//right shifting until num becomes zero
            power++;
        }
        return power - 1;//calculating 2 the power n..
    }

    public static int XOR_1_to_n(int n) {
        int num = n;
        switch (n % 4) {
            case 0:
                break;
            case 1:
                num = 1;
                break;
            case 2:
                num += 1;
                break;
            case 3:
                num = 0;
                break;
        }
        return num;
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Is the number " + num1 + "a power of 2 : " + checkPower_of_2(num1));
        System.out.println("Most significant bit of number " + num2 + " is " + most_significant_bit(num1));
        System.out.println("XOR of all values from 1 to " + num1 + " :" + XOR_1_to_n(num1));
        System.out.println("Multiply by 2 : " + multiply_by_2(num1));
        System.out.println("Divide by 2 : " + divide_by_2(num2));
        System.out.println("Flip Bits : " + flipBits(num1 + num2));
        System.out.println("Before Swapping : num1 = " + num1 + " num2 = " + num2);
        swapNUM(num1, num2);
        System.out.println("After Swapping : num1 = " + num1 + " num2 = " + num2);
        System.out.println("Position of right-most different bit : " + posOfRightMostDiffBit(num1, num2));
        System.out.println("Total number of bits needed to be flipped to convert " + num1 + " to " + num2 + "" +
                " : " + countBitsFlip(num1, num2));
        System.out.println("Swap odd and even bits of number " + num1 + " : " + swapBits(num1));
        System.out.println("Max consecutive ones of " + num2 + " : " + maxConsecutiveOnes(num2));
    }
}
