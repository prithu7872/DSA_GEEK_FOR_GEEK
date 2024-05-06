import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class infinite_arr_srcgh {
    static int findPos(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            System.out.println("Start: " + start+" End: " + end);
            //new start
            int temp = end+1;
            end = end + (end - start +1 )*2;
            start = temp;
        }
        return Arrays.binarySearch(arr, start, end, target);
    }
    public static void main(String[] args) {
       int[] arr = new int[10000];
        for(int i = 0; i < 10000; i++){
            arr[i] = i;
        }
        System.out.println(findPos(arr,2562));
    }


}
