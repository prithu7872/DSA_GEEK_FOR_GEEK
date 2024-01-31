public class MaximumAndValue {
    /*
       Given an array arr[] of N positive elements. The task is to find the Maximum AND Value
        generated by any pair of the element from the array.

Note: AND is bitwise '&' operator.

Examples:

Input: a[] = {4, 8, 12, 16}
Output: 8
The pairs 8 and 12 gives us the '&' value as 8.

Input: a[] = {4, 8, 16, 2}
Output: 0
       * & of 1 and 0 or 0 and 0 is 0 .. and & of 1 and 1 are 1..
       * Efficient Approach: An efficient approach will be to look at this problem bitwise.
       * Since we need to find the maximum '&' value. The first thing that strikes our mind
       * is that the answer should have its MSB as far as possible. So, if two elements are
       * considered as a pair, then their MSB should be set to as much left as possible.
       *  Let's take an example to understand this. Consider three elements {10, 8, 2},
       * so to get a maximum '&' value we need to take those elements whose MSB is as far
       *  as possible. In the given example, we can clearly see that 10(1010) and 8(1000)
       * have their 4th-bit from the left set and hence will maximize the answer. Taking 2
       *  and 10 will give our 2nd bit to be set which won't maximize our answer.
       *
       * So since the constraints permit till 10^4, hence the '&' value will also be less than
       *  that. 10^4 will range in 2^0 to 2^14, which means we need to start our checking from
       * the 15th bit. Initially we loop from 15 to 0 and check for the count of numbers whose
       * that particular bit is set. Once we get the count more than 2, the answer will have that
       * bit set, and for the next bit from the left to be set we need to check for both the
       * previous all bits and the current i-th bit. The previous bits can be added to the current
       *  bit using a '|' operator. In this way, we get all the positions of the bit which are
       * set, which can be easily represented as a number.
       */
    public static int get_msb_pos(int n) {
        int i = -1;
        while (n > 0) {
            n >>= 1;
            i++;
        }
        return i;
    }

    public static int MAX_AND_VALUE(int[] array) {
        int len = array.length;
        if (len <= 1) return 0;
        int max = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == max) count++;
            if (array[i] > max) {
                max = array[i];
                count = 1;
            }
        }
        // if the maximum array element is repeated 2 times then they will have the MAX_AND_VALUE
        if (count >= 2) return max;
        // get the msb position i.e if max = 16 then msb bit is 4
        int msb_pos = get_msb_pos(max);
        int res = 0;
        int check = 0;
        // lets check for the bits that are in pairs..
        for (int i = msb_pos; i >= 0; i--) {
            count = 0;
            System.out.println("I : " + i);
            for (int j = 0; j < len; j++) {
                if ((array[j] & (res | (1 << i))) == (res | (1 << i))) {
                    count++;
                    System.out.println("\narray[j]: " + array[j] + " res :"+res +" res|(1<<i) :"+(res|(1<<i)) + " count "+count);
                }
            }
            if (count >= 2) {
                res |= (1 << i);
                System.out.println("\n Array[i]: " + array[i] + " Modified(res |= (1 << i)) : res =>"+res );
            }
            check ++;
        }
        System.out.println("Iterations : "+check);
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {18,15,13,12,12,11};
        System.out.println("\nMAX AND VALUE :"+MAX_AND_VALUE(arr));

    }
}
