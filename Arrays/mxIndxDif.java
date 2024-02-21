/*Given an array a of n positive integers.
 The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.

Example 1:

Input:
n = 2
a[] = {1, 10}
Output:
1
Explanation:
a[0] < a[1] so (j-i) is 1-0 = 1.
Example 2:

Input:
n = 9
a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
Output:
6
Explanation:
In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j])
thus giving the maximum difference of j - i which is 6(7-1).*/
public class mxIndxDif {
    static int maxIndexDiff(int[] a, int n) {
        // Your code here
        int[] RT_MAX = new int[n];
        int[] LFT_MIN = new int[n];
        LFT_MIN[0] = a[0];//initialising the first element of the leftMin_array with the arrays first element
        for(int i = 1;i<n;i++){
            LFT_MIN[i] = Integer.min(a[i], LFT_MIN[i-1]);
        }
        RT_MAX[n-1] = a[n-1];
        for(int j = n-2;j>=0;j--){
            RT_MAX[j] = Integer.max(a[j],RT_MAX[j+1]);
        }

        int i=0,j = 0,maxDif = -1;
        while(i<n&&j<n){
            if(RT_MAX[j]>LFT_MIN[i]){
                maxDif = Integer.max(maxDif,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return maxDif;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{34, 8, 10, 3, 2, 80, 30, 4,30};
        System.out.println(maxIndexDiff(arr,9));

    }
}
