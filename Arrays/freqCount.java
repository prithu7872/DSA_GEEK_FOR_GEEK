import java.util.Arrays;
import java.util.Scanner;
public class freqCount {
    public static void frequencyCount(int[] arr, int N, int P)
    {
        int i,j;
        for(i = 0;i<N;){
            if(arr[i]<=N && arr[i]>0){
                j = arr[i]-1;
                    if(arr[j]<=0) {
                        arr[i] = 0;
                        arr[j]--;
                        i++;
                    }
                    else {
                        arr[i] = arr[j];
                        arr[j] = -1;
                    }
                }
            else if(arr[i]>N){
                arr[i] = 0;
                i++;
            }
            else{
                i++;
            }
        //    System.out.println(Arrays.toString(arr));
        }
        for(i = 0;i<N;i++){
            arr[i] = -(arr[i]);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        int i ;
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        frequencyCount(arr,n,p);
        System.out.print(Arrays.toString(arr));
    }
}
