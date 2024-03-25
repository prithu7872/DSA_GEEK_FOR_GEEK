import java.util.HashMap;

public class ContigousArray_Binary {
    public static int findMaxLength2(int[] nums) {
        int N = nums.length;
        int[] mp = new int[2 * N + 2];
        System.out.println("First element: "+mp[0]);//denotes that by default all the array values in ith positions are by default filled with 0
        int current = N;
        int result = 0;
        for (int i = 0; i < N; i++) {
            current += (nums[i] << 1) - 1;
            System.out.print("current: " + current);
            if (current == N) {
                result = i + 1;
                System.out.print(" Result : " + result);
            } else if (mp[current] == 0) {
                mp[current] = i + 1;
                System.out.print(" mp[current] : " + mp[current]);
            } else {
                System.out.print(" result : " + result);
                result = Math.max(result, i - mp[current] + 1);
            }
            System.out.println(" Final result : " + result);
        }
        return result;
    }
    public static int findMaxLength(int[] nums) {
        int len = nums.length;
     int longestSubArrayLen = len-1;
     int currSubArrayLen = 0;
     int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
     for(int i = 0; i < len; i++) {
         //add the first element to the map
         sum += nums[i]==1?1:-1;//either 1 or 0
         if(sum==0){
             longestSubArrayLen = i+1;//since it will be the maximum sized subarray length
         }
         else if(map.containsKey(sum)){
             currSubArrayLen = i - map.get(sum);
             longestSubArrayLen = Math.max(currSubArrayLen,longestSubArrayLen);
         }
         else{//map doesnot contains key-value pair
             map.put(sum,i);
         }

     }
     return longestSubArrayLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0};
        System.out.println(findMaxLength(arr));
        System.out.println(findMaxLength2(arr));
    }
}
