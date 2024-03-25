import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Problem statement
Given an array “A” of N integers and you have also defined the new array “B” as a concatenation of array “A” for an infinite number of times.
For example, if the given array “A” is [1,2,3] then, infinite array “B” is [1,2,3,1,2,3,1,2,3,.......].
Now you are given Q queries, each query consists of two integers “L“ and “R”(1-based indexing).
Your task is to find the sum of the subarray from index “L” to “R” (both inclusive) in the infinite array “B” for each query.
Note :
The value of the sum can be very large, return the answer as modulus 10^9+7.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 100
1 <= N <= 10^4
1 <= A[i] <= 10^9
1 <= Q <= 10^4
1 <= L <= R <= 10^18

Time Limit: 1sec
Sample Input 1 :
1
3
1 2 3
2
1 3
1 5
Sample Output 1 :
6 9
Explanation to Sample Input 1 :
For the first test case, the given array A is [1,2,3] therefore the infinite array “B” will be [1,2,3,1,2,3,1,2,3,.......].
So the answer for the given first query is 6 because the sum of the subarray from index 1 to 3 of infinite array “B” i.e. (B[1]+B[2]+B[3]) is 6.
For the given second query is 9 because the sum of the subarray from index 1 to 5 of array “B” .ie (B[1]+B[2]+B[3]+B[4]+B[5]) is 9.
Sample Input 2 :
1
4
5 2 6 9
3
1 5
10 13
7 11
Sample Output 2 :
27 22 28
 */
public class Sum_Of_Infinite_Array {
    public static List<Integer> sumInRanges2(int[] arr, int n, List<List<Long>> queries, int q) {
        final long mod = 1000000007;
        // It stores answer for each query.
        List<Integer> ans = new ArrayList<>();

        // Traversing the given queries
        for (List<Long> range : queries) {

            // Substract 1 from both L and R to use it as 0-based indexing
            long l = range.get(0) - 1;
            long r = range.get(1) - 1;

            // It stores the sum
            long sum = 0;

            for (long i = l; i <= r; i++) {
                int index = (int) (i % n);
                sum = (sum + arr[index]) % mod;
            }
            sum %= mod;
            // Add answer to each query
            ans.add((int) sum);
        }

        return ans;
    }

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
        // Write your code here!
         final long MOD = 1000000007;
         long[] prefix = new long[n];
         prefix[0] = arr[0];
         for(int i = 1; i < n; i++){
             prefix[i] = (arr[i]+prefix[i-1])%MOD;
             System.out.println("prefix["+i+"] = " + prefix[i]);
         }
        long rep = prefix[n-1];

        List<Integer> result = new ArrayList<>();
        for(int i =0;i<q;i++){
            long sum = 0;
            long a =  queries.get(i).get(0)-1;
            long b = queries.get(i).get(1)-1;
            System.out.println("a : "+a+" b : "+b);
            if(n==1){
                sum = ((b-a+1)*arr[0])%MOD;
            }
            else {
                if (b < n){
                    b = b%n;
                    if(a!=0) sum = (prefix[(int)b]-prefix[(int)a-1])%MOD;
                    else sum = (prefix[(int)b])%MOD;
                    System.out.println("Sum : "+sum);
            }
             else if ((b - a + 1) % n == 0){
                    long c = (b - a+1) / (n);
                    sum = (rep * c) % MOD;
                    System.out.println("Sum : "+sum);
                }
             else {
                    long c =(b - a+1) / (n);;
                    if (c > 0) {
                        sum = (rep * c) % MOD;
                        System.out.println("Sum : "+sum);
                    }
                    System.out.println("a : "+a+" ,b "+b+" ,b-a"+(b-a));
                    if(a%n==0){
                        System.out.println("rep = "+rep+" prefix[(int) (b % n)="+(b % n)+"] = "+prefix[(int) (b % n)]);
                        long r = prefix[(int) (b % n)];
                        System.out.println("Sum: " + sum + " Right :" + r );
                        sum = (sum + r)%MOD;
                        System.out.println("Sum : "+sum);

                    }
                   else if (a%n!=0&&(b+1)%n==0){
                        System.out.println("rep = "+rep+" prefix[(int) (a % n)-1="+((a % n)-1)+"] = "+prefix[(int) (a % n)]);

                        long l = rep - prefix[(int) (a % n)-1];
                        System.out.println("Left : " + l + " sum :" + sum );
                        sum = (sum + l)%MOD;
                        System.out.println("Sum : "+sum);

                    }
                    else {
                        long l = rep - prefix[(int) (a % n)-1];
                        long r = prefix[(int) (b % n)];
                        System.out.println("rep = "+rep+" prefix[(int) (b % n)="+(b % n)+"] = "+prefix[(int) (b % n)]);
                        System.out.println("rep = "+rep+" prefix[(int) (a % n)-1="+((a % n)-1)+"] = "+prefix[(int) (a % n)-1]);
                        a = a + n-(a%n);
                        b = b - (b%n)+1;
                        System.out.println("a = "+a+" b = "+b);
                        long d = (b - a+1) / (n);
                        System.out.println("c  = ("+b+" - "+a+"+1) / (n) = " + c);
                        if (c > 0) {
                            sum = (rep * d) % MOD;
                            System.out.println("Sum : "+sum);
                        }
                        System.out.println("Sum : "+sum+" Left : " + l + " Right :" + r + " c :" + c);
                        sum = (sum + l + r) % MOD;
                        System.out.println("Sum : "+sum);

                    }
                }

            }
            System.out.println("Sum : "+sum);

             result.add((int)sum);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        while(p>0) {
            int n = sc.nextInt();
            List<List<Long>> queries = new ArrayList<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                List<Long> list = new ArrayList<>();
                long left = sc.nextLong();
                list.add(left);
                long right = sc.nextLong();
                list.add(right);
                queries.add(list);
            }
            System.out.println("INPUT ARRAY : "+ Arrays.toString(arr));
            System.out.print("INPUT QUERIES :\n");
            for(List<Long> lst : queries) {
                System.out.print("["+ lst.get(0)+" , "+lst.get(1)+"]\n");
            }
            List<Integer> list = sumInRanges(arr, n, queries, q);
            System.out.print("ANSWER 1 : ");
            for (int l : list) System.out.print(l+" ");
            System.out.println(" ");
            List<Integer> list2 = sumInRanges2(arr, n, queries, q);
            System.out.print("ANSWER 2 : ");
            for (int l : list2) System.out.print(l+" ");
            System.out.println("\n ----------------------------------------------------------------- ");
            p--;
        }
    }
}


































