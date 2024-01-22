public class Bit_basic_tricks {
    public static int multiply_by_2(int n) {
        return (n << 1);
    }

    public static int divide_by_2(int n) {
        return (n >> 1);
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
        return (num&(num-1))==0;
    }
    public static int most_significant_bit(int num) {
        //check its log2(num) value
        int power = 0;
        while(num>0){
            num >>= 1;//right shifting until num becomes zero
            power++;
        }
        return (1<<(power-1));//calculating 2 the power n..
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Is the number "+num1+"a power of 2 : "+checkPower_of_2(num1));
        System.out.println("Most significant bit of number "+num2+" is "+most_significant_bit(num1));
        System.out.println("Multiply by 2 : " + multiply_by_2(num1));
        System.out.println("Divide by 2 : " + divide_by_2(num2));
        System.out.println("Flip Bits : " + flipBits(num1 + num2));
        System.out.println("Before Swapping : num1 = " + num1 + " num2 = " + num2);
        swapNUM(num1, num2);
        System.out.println("After Swapping : num1 = " + num1 + " num2 = " + num2);
    }
}
