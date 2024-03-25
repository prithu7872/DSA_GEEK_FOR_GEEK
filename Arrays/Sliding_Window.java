public class Sliding_Window {
    //find max_sum of k consecutive elements
    static int max_k_sum(int[] arr,int n,int k){
       int sum_of_k = 0;
       for(int i =0;i<k;i++)sum_of_k += arr[i];
       int maxSum_of_K = sum_of_k;
       for(int i =k;i<n;i++){
           sum_of_k = sum_of_k - arr[i-k]+arr[i];
           maxSum_of_K = Math.max(maxSum_of_K,sum_of_k);
       }
       return maxSum_of_K;
    }
    public static void main(String[] args) {
     int[] arr = {1,8,30,-5,20,7};
     int n = arr.length;
     int k = 3;
        System.out.println(max_k_sum(arr,n,k));
    }
}
