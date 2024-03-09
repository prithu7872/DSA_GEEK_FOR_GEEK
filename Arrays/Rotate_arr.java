import java.util.Arrays;

import static java.util.Collections.reverse;

public class Rotate_arr {
    static void reverse(int[] arr, int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArr(int[] arr, int d, int n)
    {
        // add your code here
        //3 4 5 1 2 -> 1 2 3 4 5
        //we will be using reverse of parts of an array
        d%=n;//d should be less than array size
        reverse(arr,0,d-1); //-> 5 4 3 1 2
        reverse(arr,d,n-1);//-> 5 4 3 2 1
        reverse(arr,0,n-1);//-> 1 2 3 4 5
    }
    public static void main(String[] args) {
            int[] arr = {3,4,5,1,2};
            rotateArr(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
}
