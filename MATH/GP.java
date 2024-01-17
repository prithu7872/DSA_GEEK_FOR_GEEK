import java.util.Scanner;

/*Intuition:
To define a GP series we need two parameters
a :-  The first term of GP
r:- The common ratio
The nth GP term is given by the formula GPn=a*r(n-1).
Since in the question we are given the 2nd term thus we can get r=B/A.
Now we have a and r therefore we can find the nth term using the above formula.

Implementation:
Step 1- Find the value of r by r=B/A.
Step 2- Return A*pow(r,N-1)

Example:
Input:
A = 1
B = 2
N = 5

Common ratio(r) = 2/1=2,
Hence 5th term is 1*(2)(5-1) = 24 = 16 .

Output=16

Complexity:
Time Complexity: O(log(n)), as we are using the pow function, if we are using modular exponentiation to calculate the power then it will take O(log(n) time.
Auxiliary Space: O(1) as we only used only 3 variables.*/
public class GP {
    public static void main(String[] args) {
        //Geometric Pregression
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first two numbers followed by the n'th term to calculate the geometric progression : ");
        int first_term = sc.nextInt();
        int second_term = sc.nextInt();
        int nth_term = sc.nextInt();
        System.out.println("Nth term of geometric progression : " +termOfGP(first_term, second_term, nth_term));
    }
    public static double termOfGP(int A, int B, int pow)
    {
        //Your code here
        double common_ratio = (double)B/A;
        if(common_ratio==0)return B;
        pow-=1;
        double res = 1;
        while(pow>0){
            if(pow%2!=0){ //i/e pow == odd..not a multiple of 2
                res = res * common_ratio;
            }
            common_ratio*=common_ratio;
            pow/=2;
        }
        // Nth term is given by A*(r^(pow-1))
        return res*A;
    }
}
