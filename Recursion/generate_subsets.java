import java.util.Scanner;

public class generate_subsets {
    public static void generate_Subsets(String str,String curr,int pos){
     //base case is when we reached the length of the string
        if(str.length()==pos) {System.out.println(curr); return;};
        generate_Subsets(str,curr,pos+1);
        generate_Subsets(str,curr+str.charAt(pos),pos+1);
        
    }
    public static int SubSet_sum(int[] arr,int i,int pos,int sum){
        int count = 0;
        if(arr.length==pos){
            if(i==sum)count++;
            return count;
        }
        return (count += (SubSet_sum(arr,i,pos+1,sum)+SubSet_sum(arr,i+arr[pos],pos+1,sum)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String curr = "";
        generate_Subsets(str,curr,0);
        int[] arr = {12,21,4,20,5,13,44,123};
        int sum = 25;
        System.out.println("No of subsets having the sum : "+SubSet_sum(arr,0,0,sum));

    }
}
