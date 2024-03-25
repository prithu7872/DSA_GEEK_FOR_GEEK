/*
* In a realm where numbers hold secrets, a captivating challenge awaits, which is, Minimum Consecutive Flips!!!

Our Task: Given a binary array, we need to convert this array into an array that either contains all 1s or all 0s.  We need to do it using the minimum number of group flips.

Examples :

Input : arr[] = {1, 1, 0, 0, 0, 1}
Output :  From 2 to 4
Explanation : We have two choices, we make all 0s or do all 1s.  We need to do two group flips to make all elements 0 and one group flip to make all elements 1.  Since making all elements 1 takes the least group flips, we do this.


Input : arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 0, 1}
Output :
From 1 to 3
From 5 to 6
From 8 to 8

* */
public class Minimum_Consecutive_Flips {
    int[] arr ;
    int n ;
    Minimum_Consecutive_Flips(int[] arr, int n){
        System.out.println("Lets Start the constructor");
          this.arr = arr;
          this.n = n;

    }

        class SubClass{
            public void flip_min(int[] arr,int n){
                //at fist check if the start of the array and end are same or different -> if same for example 110011100011 then flip the other elements i.e !=arr[0]
                //else if different starrting elements -> 001110011 then flip can flip any one
               //starting from the second element better to flip the element not present in the begining
                for(int i = 1;i<n;i++){
                    if(arr[i]!=arr[i-1]){//not equal to previous element
                       //check if its not same as the starting element
                        if(arr[i]!=arr[0]){
                            System.out.print("From "+i+" to ");
                        }
                        else System.out.println(i-1);
                    }
                    //handling casses like 11000
                    if(arr[n-1]!=arr[0])System.out.println(n-1);
                }

            }
        }

    public static void main(String[] args) {
        int[] arr={1, 0, 0, 0, 1, 0, 0, 1, 0, 1};
        int n = arr.length;
        Minimum_Consecutive_Flips obj = new Minimum_Consecutive_Flips(arr,n);
        Minimum_Consecutive_Flips.SubClass subobj = obj.new SubClass();
        subobj.flip_min(arr,n);
    }
}
