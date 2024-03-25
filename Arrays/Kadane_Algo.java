public class Kadane_Algo {
    static long  maxEvenOddSubArr(int[] arr,int n){
        long maxLen = 1;
        long currLen = 1;
        for(int i = 0;i<n;i++){
            if((arr[i]%2==0&&arr[i+1]%2==1)||(arr[i]%2==1&&arr[i+1]%2==0)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            }
            else currLen = 1;
        }
        return maxLen;

    }
    static long maxCircularSubArray(int[] arr,int n){
        int normal = maxSubarraySum(arr,n);
        if(normal<0)return normal;
      int total = 0;
      //invert the array
        for(int i = 0;i<n;i++){
            total += arr[i];
            arr[i] = -arr[i];
        }
        //maximum Sum in inverted array = minimum sum in inverted array;
        int max_circular = maxSubarraySum(arr,n) + total;
        return Math.max(normal,max_circular);

    }
    static int maxSubarraySum(int[] arr, int n) {
        int maxSum = arr[0];
        if (n == 1) return maxSum;
        int currSum = 0;
        for (int a : arr) {
            if (currSum < 0) currSum = 0;
            currSum += a;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3 ,-18 ,-22 ,-21 ,-17 ,16 ,-14 ,28 ,-22};
        int n = arr.length;
        System.out.println("Max SubArray : "+maxSubarraySum(arr, n));
        System.out.println("Max Circular Sub-Array : "+maxCircularSubArray(arr, n));
    }
}
