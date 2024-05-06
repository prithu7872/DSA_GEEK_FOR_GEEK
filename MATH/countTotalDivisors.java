import java.util.Arrays;

public class countTotalDivisors {
   // stieve Eristosis finding prime numbers from 1 to N
    static boolean[] N_prime(int N){
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime,true);
        for(int i = 2; i*i <= N; i++){
            if(prime[i]){
                for(int j = i*i;j<=N&&prime[j];j+=i){
                    prime[j]= false;
                }
            }
        }
        return prime;
    }
    static int count_divisors(int N){
        //find prime numbers
        boolean[] arr_prime = N_prime(N);
        int total = 1;
        for(int i = 2; i <= N; i++){
            if(arr_prime[i]&&N%i==0){
                int count = 0;
                //i = 2 , N = 12 , power of 2 -> 2
                while(N%i==0){
                    N = N/i;
                    count ++;
                }
                total *= (count+1);

            }
        }
        return total;
    }
    public static void main(String[] args) {
        boolean[] prime = N_prime(24);
        int i =0;
        for(boolean p: prime){
            if(p==true&&i>2) System.out.println(i);
            i++;
        }
        System.out.println("Total divisors of 24 :"+count_divisors(24));
    }
}
