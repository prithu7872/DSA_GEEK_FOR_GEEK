public class Sorted_And_Rotated {
    public static boolean checkRotatedAndSorted(int[] arr,int n){
        //arr[n] = if array is having single pivotal point such that if it is rotated at that point
        //it will result in a sorted array eg - [6,8,2,3,4] if rotated around 8 it will result in ->
        // Your code here
        boolean sorted = false;
        int pivot_pnt = 0;
        if(arr[n-1]<arr[0]){
            for(int i = 0; i<n-1;i++){
                if(arr[i]>arr[i+1])pivot_pnt++;
            }
            if(pivot_pnt==1)sorted = true;
        }
        else if(arr[n-1]>arr[0]){
            for(int i = 0; i<n-1;i++){
                if(arr[i]<arr[i+1])pivot_pnt++;
            }
            if(pivot_pnt==1)sorted = true;
        }
        return sorted;
    }
    public static void main(String[] args) {
 int[] arr ={40,42,44,46,16,21,22,27,29,34,38};
 System.out.print(checkRotatedAndSorted(arr,arr.length)?"True":"False");
    }
}
