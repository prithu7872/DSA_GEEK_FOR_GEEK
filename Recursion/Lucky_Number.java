public class Lucky_Number {

    static boolean check(int num , int div){
        System.out.print(num%div+" ");
        if( num%div == 0 ) return false;
        if( num%div == num ) return true;
        System.out.println("Res : "+(num-(num/div)));
        return check(num-(num/div) , div+1 );
    }
    public static boolean isLucky2(int n)
    {
        // Your code here
        return check(n, 2);
    }
    public static void main(String[] args) {
        int luck = Integer.parseInt(args[0]);
        System.out.println("Lets see the result-->");
        System.out.println(isLucky2(luck) ?"It is a lucky number":"It is not a lucky number.");
    }
}
