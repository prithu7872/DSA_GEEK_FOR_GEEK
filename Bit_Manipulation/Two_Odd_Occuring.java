public class Two_Odd_Occuring {
    public static void Odd_Occuring_Pairs(int[] arr) {
        int len = arr.length;
        int XOR_all = 0;
        for (int i = 0; i < len; i++) {
            XOR_all ^= arr[i];
        }
        System.out.println(XOR_all);//3
        int res1 = 0;
        int res2 = 0;
        int k = XOR_all & (-XOR_all);//negative of a number = ~(number - 1)
        for (int i = 0; i < len; i++) {
            if ((arr[i] & k) != 0) res1 ^= arr[i];
            else res2 ^= arr[i];
        }
        System.out.println("Odd occuring pair of numbers at linear time complexity : " + res1 + " " + res2);
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 5, 6, 6, 6, 10, 10, 3, 3};
        System.out.println("Find the odd occuring pair of numbers at linear time complexity : ");
        Odd_Occuring_Pairs(array);

    }
}
