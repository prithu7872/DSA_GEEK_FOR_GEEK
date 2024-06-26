import java.util.ArrayList;


public class Recursive_practices {
    public static int calculate_power(int num,int pow){
      //base case
        if(pow==0)return 1;
        int temp = calculate_power(num, pow/2);
        temp = temp * temp;
        if(pow%2==0)return temp;
        else return temp*num;
    }
    static ArrayList<Integer> lists = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();
    public static void recursion_pract(int num){
        if(num==0)return ;
      //  lists.add(num);
        recursion_pract(num/2);
        lists.add(num%2);
    }
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        str.append(ch);
        int i = 0;
        while((word.charAt(i) != ch)&& (i<word.length())) {
            str.append(word.charAt(i));
            i++;
        }
        return (str.reverse()).toString();
    }
    //no tail recursion..
    public static int fact(int num){
        //base case
        if(num==1||num==0) return 1;
        return num * fact(num-1);
    }
    public static int fact_tail_recursion(int num,int k){
        //base case
        if(num==1||num==0) return k;
        return fact_tail_recursion(num-1,num*k);
    }
    public static boolean isPalindrome(String str,int start,int end){
        //String str= "abbcbba"
        if (start >= end) return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str,start+1,end-1);
    }
    public static int sum_digits(int n){
        int sum = 0;
        if(n==0)return 0;
        return sum + n%10 + sum_digits(n/10);
    }
    static String[] str2 = {"ABC","DEF","GHI"};
    public static void recurse_char (String[] string,String res,int index,int len){
        if(index==len){
            System.out.print(res+" ");
            return;
        }
        int l = string[index].length();
        for(int i=0;i<l;i++){
            recurse_char (string,res+string[index].charAt(i),index+1,len);
        }
    }
    public static void main(String[] args) {
      /*   int number = Integer.parseInt(args[0]);
         int power = Integer.parseInt(args[1]);
         String str = args[2];
        System.out.println(calculate_power(number, power));
        recursion_pract(number);
        for(int i : lists){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        System.out.println("Factorial : "+fact(power));
        int k = 1;
        System.out.println("Factorial using tail recursion : "+fact_tail_recursion(power,k));
        System.out.println("String "+str+" is palindrome :"+isPalindrome(str,0,str.length()-1));
        System.out.println("Sum of digits :"+sum_digits(number));*/
        recurse_char(str2," ",0,3);
    }
}
