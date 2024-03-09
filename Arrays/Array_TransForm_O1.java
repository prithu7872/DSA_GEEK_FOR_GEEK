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

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
      long[] arr = new long[n];
      for(int i = 1; i <= n; i++){
          arr[i-1] = Long.parseLong(args[i]);
      }
      arrange(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
