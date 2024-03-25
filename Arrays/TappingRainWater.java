public class TappingRainWater {
    static long trappingWater(int[] arr, int n) {
        // Your code here
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int j = n-2;j>0;j--){
            rightMax[j] = Math.max(rightMax[j+1], arr[j]);
        }
        long waterLevel = 0;
        for(int i = 1; i < n-1; i++){
            waterLevel += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
return waterLevel;
    }
    public static void main(String[] args) {
       int N = 6;
       int[] arr = {3,0,0,2,0,4};
       long waterContent = trappingWater(arr,N);
        System.out.println(waterContent);
    }
}
