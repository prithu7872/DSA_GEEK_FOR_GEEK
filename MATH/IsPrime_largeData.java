import java.util.Arrays;
import java.util.Scanner;

public class IsPrime_largeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Give a number to check for prime :");
        a = sc.nextInt();
        System.out.println("HCF of two numbers :"+IsPrime(a));
        N_prime_optimised(a);
    }
    public static boolean IsPrime(int a) {
        if(a==1)return false;
        if(a==2||a==3)return true;
        if(a%2==0||a%3==0){
            return false;
        }
       for(int i =5;i<Math.sqrt(a);i=i+6){
          if(a%i==0||a%(i+2)==0){
              return false;
          }
       }
       return true;
    }
    //print all the numbers from 1 to n
    //number divisible by 2 or 3 or 5 are non-prime no.
    /*Sieve of Eratosthenes is the algorithm to find all the prime numbers less
    than or equal to a given integer n. The algorithm terminates, all the numbers
    in the list that are not marked are prime
     */
    public static void N_prime(int n){
        Boolean[] boolArr = new Boolean[n+1];//Initialising a boolean array of size n+1;
        Arrays.fill(boolArr,Boolean.TRUE);//filling the array with false value;
        //let n = 20, from index 0 to 20 all are true...
        //now check for multiples of 2,3 and 5...
        for(int i = 2; i*i<=n;i++){
            if(boolArr[i]){//if the value of the definitive array of index is true
                for(int j=i*2;j<=n;j=j+i){
                    boolArr[j]=false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<=n;i++)
            if(boolArr[i]) {
                System.out.println(i);
                count++;
            }
        System.out.println("Total no of Prime no : "+count);
    }

    public static void N_prime_optimised(int n){
        Boolean[] boolArr = new Boolean[n+1];//Initialising a boolean array of size n+1;
        Arrays.fill(boolArr,true);//filling the array with false value;
        //let n = 20, from index 0 to 20 all are true...
        //now check for multiples of 2,3 and 5...
        int count = 0;
        for(int i = 2; i<=n;i++){
            if(boolArr[i]){//if the value of the definitive array of index is true
                count++;
                System.out.println(i);
                for(int j=i*i;j<=n&&boolArr[i];j=j+i){
                    boolArr[j]=false;
                }
            }
        }
        System.out.println("Total no of Prime no : "+count);
    }


    }

