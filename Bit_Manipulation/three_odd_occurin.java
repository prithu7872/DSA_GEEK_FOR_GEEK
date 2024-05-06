public class three_odd_occurin {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,10,2,3,3,2,1};
        int result = 0;
        for(int i=0;i<32;i++){
            int sum = 0;
            int mask = 1<<i;
            for(int n : arr){
                if((mask&n) != 0)sum+=1;
            }
            if(sum%3!=0)result ^= mask;//if not perfectly divisible by 3 then we set the bit or is simply addition in bit manipulation ^ and | both can be used
        }
        System.out.println(result);
    }
}
