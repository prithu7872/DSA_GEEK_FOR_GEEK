class CountNsetBits {
    public static int largestPowerOf2inrange(int n) {
        int msb = 0;
        while (n > 0) {
            n >>= 1;
            msb += 1;
        }
        return msb - 1;
    }

    public static int solution(int n) { //let n = 18
        //base case
        if (n == 0) return 0;
        int msb = largestPowerOf2inrange(n);//msb = 4;
        int setBitUpto_2pow_msb = (msb * (1 << (msb - 1))) + 1;//0 to 16 set bits (16 has only 1 set bit)
        int setBitFrom_2pow_msb_to_N = n - (1 << msb);//ths only gives the msb of the remaining numbers ..
        return setBitUpto_2pow_msb + setBitFrom_2pow_msb_to_N +
                solution(setBitFrom_2pow_msb_to_N);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println("Set bits from 0 to " + N + " : " + solution(N));
    }
}