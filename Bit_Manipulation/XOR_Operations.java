public class XOR_Operations {
    public static int findOdd(int[] arr, int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
        int r = res;
        res = res ^ arr[i];
        System.out.println("XOR of "+Integer.toBinaryString(r)+" and "+Integer.toBinaryString(arr[i])+" -> "+res);
    }
    return res;
}
    //using XOR to Toggle a definitive bit
    public static int toggle_XOR(int n , int pos) {
      return n^(1<<pos);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 44, 44, 44, 4, 2, 4, 3, 2, 4, 4, 2};
        int oddNumber = findOdd(numbers, numbers.length);
        System.out.println("The odd number is: " + oddNumber);
        System.out.println("The toggled number is : "+toggle_XOR(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    }
}
