/*
Largest number that divides x and is co-prime with y
Last Updated : 26 Mar, 2023
Given two positive numbers x and y. Find the maximum valued integer a such that:


a divides x i.e. x % a = 0
a and y are co-prime i.e. gcd(a, y) = 1
Examples :


Input : x = 15
        y = 3
Output : a = 5
Explanation: 5 is the max integer
which satisfies both the conditions.
             15 % 5 =0
             gcd(5, 3) = 1
Hence, output is 5.

Input : x = 14
        y = 28
Output : a = 1
Explanation: 14 % 1 =0
             gcd(1, 28) = 1
Hence, output is 1.


Approach: Here, first we will remove the common factors of x and y from x by
finding the greatest common divisor (gcd) of x and y and dividing x with that gcd.
Mathematically:


 x = x / gcd(x, y)
 */


import java.util.Scanner;

public class LargestCoprimeDivisor {
    public static int gcd(int x, int y) {
        if(x==0||y==0)return 0;
        if(x==y)return 1;
        if(x>y)return gcd(x-y,y);
        return gcd(x,y-x);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int res ;
       while(gcd(a,b)!=1){
           a = a / gcd(a,b);
       }
       System.out.println(a);
    }
}
