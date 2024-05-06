import java.util.Arrays;

public class find_first_last_pos { //not a efficient process
    public void first_last_pos(int[] arr,int left,int right,int[] res,int target){
        if (left > right || (res[0] > 0 && res[1] > 0)) {
            return;
        }
        int mid = left + (right - left) / 2;
        System.out.println(arr[mid]);
        if (arr[mid] == target) {
            if (mid == 0 || arr[mid - 1] < target ) {
                res[0] = mid;
                first_last_pos(arr, mid + 1, right, res, target);
            }
            else if (mid == arr.length - 1 || arr[mid + 1] > target) {
                res[1] = mid;
                first_last_pos(arr, left, mid - 1, res, target);
            }
            else{
                first_last_pos(arr, mid + 1, right, res, target);
                first_last_pos(arr, left, mid - 1, res, target);
            }
        } else if (arr[mid] < target) {
            first_last_pos(arr, mid + 1, right, res, target);
        } else {
            first_last_pos(arr, left, mid - 1, res, target);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums.length==0)return res;
        int left = 0;
        int right = nums.length-1;
        if(nums[left]==nums[right]){
            if(nums[left]==target) return new int[]{left,right};
            else return res;
        }
        first_last_pos(nums,left,right,res,target);
        res[0] = res[0]==-1?res[1]:res[0];
        res[1] = res[1]==-1?res[0]:res[1];
        return res;
    }
    public static int efficient_first_last_pos(int[] arr,int left,int right,int target){
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]<target){
                left = mid + 1;
            }
            else right = mid-1;
        }
        return left;
    }
    public static int[] searchRange2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int start = efficient_first_last_pos(nums,left,right,target);
        int end = efficient_first_last_pos(nums,left,right,target+1)-1;
        if(start<nums.length&&nums[start]==target)return new int[]{start,end};
        return new int[]{-1, -1};
    }
public static void main(String[] args) {
       int[] arr = {1,2,3,3,3,3,4,5,9};
       int target = 3;
       int[] res = searchRange2(arr,target);
    System.out.println(Arrays.toString(res));
}
}
