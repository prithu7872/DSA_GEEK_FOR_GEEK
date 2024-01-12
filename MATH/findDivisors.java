public class findDivisors {
    //find divisors in increasing order
    public static void main(String[] args) {
        int num = 240;
        int i;
        for(i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
        for(; i>=1; i--){
            if(num%i==0){
                System.out.println(num/i+" ");
            }
        }
    }
}
