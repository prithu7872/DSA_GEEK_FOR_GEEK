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
    public static void main(String[] args) {
         int number = Integer.parseInt(args[0]);
         int power = Integer.parseInt(args[1]);
        System.out.println(calculate_power(number, power));
        recursion_pract(number);
        for(int i : lists){
            System.out.print(i+" ");
        }
        System.out.print("\n");
        System.out.println("Factorial : "+fact(power));
        int k = 1;
        System.out.println("Factorial using tail recursion : "+fact_tail_recursion(power,k));
    }
}
