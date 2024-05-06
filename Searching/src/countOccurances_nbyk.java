import java.util.HashMap;

public class countOccurances_nbyk {
    //Function to find all elements in array that appear more than n/k times.
    public static int countOccurance(int[] arr, int n, int k)
    {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int check = n/k;
        int count = 0;
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue() > check) count++;
        }
return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,2,1,2,3,3};
        int n = 8;
        int k = 4;
        System.out.println(countOccurance(arr,n,k));
    }
}
