import java.util.Scanner;

public class generate_subsets {
    public static void generate_Subsets(String str,String curr,int pos){
     //base case is when we reached the length of the string
        if(str.length()==pos) {System.out.println(curr); return;};
        generate_Subsets(str,curr,pos+1);
        generate_Subsets(str,curr+str.charAt(pos),pos+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String curr = "";
        generate_Subsets(str,curr,0);

    }
}
