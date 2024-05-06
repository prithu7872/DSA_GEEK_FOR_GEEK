import java.util.HashMap;

public class LongestSubarray_K_pos_neg {
    public static int getLongestSubarray(int []nums, int k) {
        // Write your code here.
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                res = Math.max(res,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            //if(map.contains(sum))Map.put(sum,i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,-1,13,3,0,-6,6,7,0,3};
        int k = 10;
        System.out.println("Longest subarray of sum k :"+getLongestSubarray(arr,k));
    }
}
