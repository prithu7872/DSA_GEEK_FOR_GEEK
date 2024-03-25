import java.util.Arrays;

public class finding_Euilibium {
    public static int equilibriumPoint(long arr[], int n) {
        if(n==2)return -1;
        if(n==1)return 1;
        long[] res = new long[n];
        res[0] = arr[0];
        for(int i =1;i<n;i++){
            res[i] = res[i-1]+arr[i];
        }
        //   System.out.println(Arrays.toString(res));
        long rtSum = 0;
        for(int j = n-1;j>0;j--){

            rtSum+=arr[j];
            if(rtSum == res[j]){
                return j+1;
            }

            //    System.out.println("rtSum :" +rtSum+" res["+j+"] :"+res[j]);
        }
        return -1;
    }
    public static void main(String[] args) {
        long[] arr = {8, 8 ,3, 7 ,8 ,2 ,7 ,2};
        int n = arr.length;
        System.out.println("Equilibrium point :"+equilibriumPoint(arr,n));
    }
}
