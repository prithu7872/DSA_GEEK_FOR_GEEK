/*
Given two numbers a and b, find the sum of a and b. Since the sum can be very large, find the sum modulo 109+7.

Example 1:

Input:
a = 9223372036854775807
b = 9223372036854775807
Output: 582344006
Explanation:
9223372036854775807 + 9223372036854775807
= 18446744073709551614.
18446744073709551614 mod (109+7)
= 582344006

Example 2:

Input:
a = 1000000007
b = 1000000007
Output: 0
Explanation: 1000000007 + 1000000007 =
(2000000014) mod (109+7) = 0

Your Task:
You don't need to read input or print anything. Your task is to complete the function sumUnderModulo() that takes a and b as
 input parameters and returns sum of a and b under modulo 109+7.

Expected Time Complexity : O(1)
Expected Auxilliary Space : O(1)


Constraints:
1 <= a,b <= 263-1

*/


public class FindModulo {
    public static void main(String[] args) {
        long a = 9_223_372_036_854_775_807L;
        long b = 9_223_372_036_854_775_807L;
        long c =1000000007L;
        //(a+b)%c = ((a % c) + (b % c)) % c
        System.out.println("For addition : "+((a % c) + (b % c)) % c);
        //(a*b)%c = ((a % c) * (b % c)) % c ;
        System.out.println("For multiplication : "+((a % c) * (b % c)) % c);
    }
}
