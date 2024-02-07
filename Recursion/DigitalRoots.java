public class DigitalRoots {
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n==0){return 0;}
       int sum = 0;
       int rem = n%10;
       sum += rem + digitalRoot(n/10);
       if(sum/10>0)return digitalRoot(sum);
       return sum;
    }
    public static void main(String[] args) {
      int num = Integer.parseInt(args[0]);
        System.out.println(" DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.");
        System.out.println("Digital Root of "+num+" :"+digitalRoot(num));
    }
}
