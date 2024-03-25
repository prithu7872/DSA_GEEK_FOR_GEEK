import java.util.Arrays;
import java.util.Scanner;
/*
* static int segregateArr (int arr[], int n) {
    int j = 0, i;
    for(i = 0; i < n; i++) {
        if(arr[i] <= 0) { //changing the position of negative numbers and 0.
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp; //incrementing count of non-positive integers.
        j++;
        }
        }
        String str = Arrays.toString(arr);
        System.out.println(str);
        return j;

}
//Finding the smallest positive missing number in an array
//that contains only positive integers.
static int findMissingPositive(int arr[],int st, int end) {
    //marking arr[i] as visited by making arr[arr[i]-1] negative.
    //note that 1 is subtracted because indexing starts from 0 and
    //positive numbers start from 1.
    System.out.println("Start :"+arr[st]);
    System.out.println("End :"+arr[end-1]);
    for(int i=st; i<end; i++) {
        if(Math.abs(arr[i])+st - 1 < end && arr[ Math.abs(arr[i])+st - 1] > 0)
        arr[ Math.abs(arr[i])+st - 1] = -1*arr[ Math.abs(arr[i])+st - 1];
        String str = Arrays.toString(arr);
        System.out.println(str);
        }
        String str = Arrays.toString(arr);
        System.out.println("Final :"+str);
    for(int i=st; i<end; i++) {
        if (arr[i] > 0) {
            //returning the first index where value is positive.
            // st is subtracted because we do not have to consider negative numbers present at the start of array.
            // 1 is added because indexing starts from 0.
            return i-st+1;

        }
            }
    return end-st+1;

} //Function to find the smallest positive number missing from the array.
static int missingNumber(int arr[], int size) {
    //first separating positive and negative numbers.
int shift = segregateArr(arr, size);
//shifting the array to access only positive part.
//calling function to find result and returning it.
return findMissingPositive(arr,shift, size);
}*/
public class FirstMissingPositive {
        static void swap(int[] arr,int a,int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        static int firstMissingPositive(int[] arr,int n){
            System.out.println("BEGIN : "+Arrays.toString(arr));
           for(int i = 0; i < n; i++){
              int ele = arr[i];
              if(ele>=1 && ele<=n ) {
                  int pos = ele-1;
                  if (arr[pos] != ele) {
                      swap(arr, pos, i);
                      i--;
                  }
              }
               System.out.println(Arrays.toString(arr));
           }
           if(arr[0]==1){
               for(int i = 1; i < n; i++){
                   if(arr[i]!=i+1)return i+1;
               }
               return n+1;
           }
           return 1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i<n){
            arr[i++] = sc.nextInt();
        }
        System.out.println(""+firstMissingPositive(arr,n));
    }
}
