import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_operations {
    //Function to find median of the array elements.
    public int median(int[] A, int N)
    {

        Arrays.sort(A);
        return (N%2==0?(int)Math.floor((double) (A[N / 2] + A[(N / 2) - 1]) /2):A[N/2]);
        //Your code here
        //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int[] A, int N)
    {
        //Your code here
        int sum = 0;
        for(int r : A)sum+=r;
        return sum/N;
    }
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int secondLargest = Integer.min(arr[0],arr[1]);
        int Largest= Integer.max(arr[0],arr[1]);
        if(sizeOfArray==2)return result;
        for(int i = 2; i < sizeOfArray; i++){
            if(secondLargest==Largest&&arr[i]<Largest)secondLargest=arr[i];
            if(arr[i]==Largest&&arr[i]==secondLargest)continue;
            if(arr[i]>Largest){
                secondLargest = Largest;
                Largest = arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i]<Largest){
                secondLargest =  arr[i];
            }
        }
        if(Largest==secondLargest)secondLargest = -1;
        result.add(Largest);
        result.add(secondLargest);
        return result;
    }
    public static void insertAtEnd(int[] arr, int sizeOfArray, int element)
    {
        //Your code here
        arr[sizeOfArray-1]  = element;
    }
    public static void insertAtIndex(int[] arr, int sizeOfArray, int index, int element)
    {
       for(int j = sizeOfArray-1; j > index; j--){
           arr[j] = arr[j-1];
       }
       arr[index] = element;
    }
    public static void main(String[] args) {
   /*     int n = Integer.parseInt(args[0]);
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = Integer.parseInt(args[i+1]);
    }
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to insert : ");
    int num = sc.nextInt();
        System.out.print("Enter position of the number to insert : ");
    int pos = sc.nextInt();
    if(pos == n)insertAtEnd(array,n,num);
    else insertAtIndex(array,n,pos,num);
    System.out.println("Modified Array : ");
    for(int ar : array) System.out.print(ar+" ");*/
    int[] arr3 = {10,10,10,10,10,10};
    ArrayList<Integer> res = largestAndSecondLargest(6,arr3);
    for(int r : res) System.out.println(r);
}
}