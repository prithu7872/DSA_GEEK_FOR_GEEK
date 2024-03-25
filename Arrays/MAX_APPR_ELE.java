import java.util.Arrays;

public class MAX_APPR_ELE {
    /*Input:
n = 4
L[] = {1,4,3,1}
R[] = {15,8,5,4}
Output: 4
Explanation: The given ranges are [1,15]
[4, 8] [3, 5] [1, 4]. The number that
is most common or appears most times in
the ranges is 4.*/
    static int maximumOccurredElement(int[] L, int[] R, int n) {
        //finding max element using java collections
        int max = Arrays.stream(R).max().getAsInt()+2;
        int[] arr = new int[max];//0 to 16
        for(int i = 0; i < n; i++){
            arr[L[i]]+=1;
            arr[R[i]+1]-=1;
            System.out.println(Arrays.toString(arr));
        }
        int ele = 0;
        int maxSum = arr[0];
        for(int i = 1; i <max; i++){
            arr[i]+=arr[i-1];
            if(maxSum<arr[i]){
                maxSum=arr[i];
                ele = i;
            }
        }
        return ele;

    }
    public static void main(String[] args) {
      int[] L = {1,4,3,1};
       int[] R = {15,8,5,4};
       int n = R.length;
        System.out.println(maximumOccurredElement(L, R, n));

    }
}
