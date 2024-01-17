public class XOR_Operations {
    public static int findOdd(int[] arr, int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
        int r = res;
        res ^= arr[i];
        System.out.println("XOR of "+Integer.toBinaryString(r)+" and "+Integer.toBinaryString(arr[i])+" -> "+res);
    }
    return res;
}

    public static void main(String[] args) {
        int[] numbers = {2, 44, 6, 2 , 6};
        int oddNumber = findOdd(numbers, numbers.length);
        System.out.println("The odd number is: " + oddNumber);
    }
}
