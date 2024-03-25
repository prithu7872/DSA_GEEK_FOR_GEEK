import java.util.Arrays;

/*Consider the set of irreducible fractions A = {n/d | n≤d and d ≤ 10000 and gcd(n,d) = 1}.
You are given a member of this set and your task is to find the largest fraction in this set
less than the given fraction.
Note : this is a set and so all the members are unique.

Example 1:

Input: n = 1, d = 8
Output: 1249 9993
Explanation: 1/8 >= 1249/9993 and this
is the largest fraction.
Example 2:

Input: n = 2, d = 53
Output: 377 9991
Explanation: 2/53 >= 377/9991 and this is
the largest fraction.
class Solution
{
  public static int[]  LargestFraction(int n, int d)
    {
        int[] arr = new int[2];
        int deno = 1;
        int num = 0;
        // code here
        for(int q = 10000;q>=2;q--){
          //initialize neuminator using q and d and n
            int p = (n*q-1)/d;
            if(p*deno>=q*num){
                  deno = q;
                  num = p;
            }
        }
        //check if gcd is 1;
        int gcd = gcd(num,deno);
        arr[0] = num/gcd;
        arr[1] = deno/gcd;
        return arr;

        }
    static int gcd(int n, int d) {
        if(d == 0)return n;
        return gcd(n,n%d);
    }

}
 */
public class Fraction_Trouble {
    public static int[]  LargestFraction(int n, int d)
    {
        int nm = 0, den=1;
        for(int q = 10000; q>=2;q--){
            int p = (n*q-1)/d;
            if(p*den>=nm*q){
                den =q;
                nm=p;
            }
        }
        int tot = gcdnum(nm,den);
        int[] ans = new int[2];
        ans[0]=nm/tot;
        ans[1]=den/tot;
        return ans;
    }

    static int gcdnum(int a, int b){
        if(b==0)return a;
        return gcdnum(b,a%b);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        System.out.println(Arrays.toString(LargestFraction(n,d)));

    }
}
