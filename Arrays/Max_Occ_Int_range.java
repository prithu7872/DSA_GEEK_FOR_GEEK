import java.util.Arrays;

class Max_Occ_Int_range {
    /*Input:
n = 4
L[] = {1,4,3,1}
R[] = {15,8,5,4}
Output: 4
Explanation: The given ranges are [1,15]
 [4, 8] [3, 5] [1, 4]. The number that
is most common or appears most times in
the ranges is 4.*/
    static int maxOccured(int[] L, int[] R, int n, int max){
     //create an array of length max+2
        int[] arr = new int[max+2];//10 if max = 8
        //Arrays.fill(array, startIndex, endIndex, value);
        Arrays.fill(arr,0);
        for(int i =0;i<n;i++){//marking the L[i] and R[i]+1 positions as 1 and -1
            //so that we can understand the range of the L[i] and R[i] array and check for
            //common values with max frequency
            if(arr[L[i]]>0)arr[L[i]]++;
            else arr[L[i]] = 1;
            if(arr[R[i]+1]<0)arr[R[i]+1]--;
            else arr[R[i]+1] = -1;
        }
        //computing max prefix sum to find the maxOccured element within the ranges
        int mxPfxSum = 0;
        int sum = 0;
        for(int i = 0;i<max+2;i++){
            sum += arr[i];
            mxPfxSum  = Math.max(mxPfxSum,sum);
        }
return mxPfxSum;
    }
    public static void main(String[] args) {
        int[] L = {1,4,3,1};
        int[] R = {15,8,5,4};
        int n = L.length;
        int max = 0;
        for(int r : R){
           max = Math.max(r,max);
        }
        System.out.println("Max occuring :"+maxOccured(L,R,n,max));
    }
}
