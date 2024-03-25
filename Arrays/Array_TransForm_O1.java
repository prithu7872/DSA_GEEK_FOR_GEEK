import java.util.Arrays;

public class Array_TransForm_O1 {
    // arr: input array
    // n: size of array
    //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
    static void arrange(long[] arr, int n)
    {
     for(int i = 0; i < n; i++) {
         arr[i]+=((arr[(int)arr[i]]%n)*n);//it stores both the value together
     }
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i]/n;
        }
    }

    //REARRANGING SORTED ARRAY
    /*Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.*/
    public static void rearrange(long[] arr, int n){
        int max_idx = n - 1;
        int min_idx = 0;
        int max_element = (int)arr[max_idx] + 1;

        for (int i = 0; i < n; i++) {
            // At even index, we store maximum elements
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            }
            // At odd index, we store minimum elements
            else {
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        // Dividing with max_element to get the rearranged array
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max_element;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long[] arr = new long[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = Long.parseLong(args[i]);
        }
      //  arrange(arr, n);
      //  System.out.println(Arrays.toString(arr));

        rearrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
