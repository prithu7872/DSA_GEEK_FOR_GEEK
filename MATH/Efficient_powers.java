import java.util.Scanner;

public class Efficient_powers {
    public static void main(String[] args) {
        System.out.println("Enter number and its power to calculate (Requires more space 0(log(n)) : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        System.out.println("Calculating power in recursive way : " +Cal_Power_Recursive(number,power));
        System.out.println("#Efficient way to Calculate power in iterative way (Reduces space O(1)) : "+Cal_Power_Iterative(number,power));
        Decimal_to_Binary(number*power);
    }
    public static int Cal_Power_Recursive(int num,int pow){
        if(pow==0)return 1;//base case
        int temp = Cal_Power_Recursive(num,pow/2);
        temp = temp*temp;
        if(pow%2==0)return temp;
        else return temp * num;
    }
    //to change a decimal no into binary no...
    public static void Decimal_to_Binary(int decimal){
        //suppose decimal no => 19 , binary no value =>10011
        if(decimal==0){
            return ;
        }
        if(decimal%2!=0)System.out.print(1+" ");
        else System.out.print(0+" ");

        Decimal_to_Binary(decimal / 2);
    }
 public static int Cal_Power_Iterative(int num,int pow){
        int res = 1;
        while(pow>0){
            if(pow%2!=0) res=res*num;
            pow /= 2;
            num *=num;
        }
        return res;
    }
}
