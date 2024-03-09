import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reverseINGRP {
    static void swap (ArrayList<Integer> arr,int i,int j){
        int temp = arr.get(j);
        arr.set(j,arr.get(i));
        arr.set(i,temp);
    }
    static void reverseGRP(ArrayList<Integer> arr, int n, int start,int end,int k){
        System.out.println("\n\nBEGIN METHOD Start : " + start+" End : " + end);
        if(start==n)return ;//start = 0, end = k(3),k = 3
        int mid;
        if(end>n) {
            end = n;
            mid = (start + end)/2;
        }
        else{
            mid = start+ k/2;
        }
        int j = 0;
        for(int i =start;i<mid;i++){
            swap(arr,i,end-1-j);
        }
        System.out.println("ON MODIFICATION -> Start : "+start+" Mid : "+mid+" End : "+end);
        System.out.println("MODIFIED ARRAY : "+ Arrays.toString(arr.toArray()));
        reverseGRP(arr,n,end,end+k,k);
    }
    //Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        reverseGRP(arr,n,0,k,k);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String a : args){
            list.add(Integer.parseInt(a));
        }
        int n = list.size();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        reverseInGroups(list, n,k);
        System.out.println("NEW ARRAY : "+ Arrays.toString(list.toArray()));
    }
}
