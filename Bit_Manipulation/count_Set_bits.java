public class count_Set_bits {
    //The BitsSetTable256 array is initialized with 256 elements, representing all
    // possible 8-bit numbers.
    static int[] table = new int[256];

    public static void initialize() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            //table[i] = i & 1 + table[i/2];
            table[i] = table[i & (i - 1)] + 1;
        }
    }
    public static int countSetbits_tableMethod(int n){
        //255 is the largest 8 bit number we are dividing the table of 8bits X 4 parts to check
        //for a 32 bit number
        //now to calculate the set bits of the first 8 bits
        //since after shifting 24 bits there is bits further left for shifting therefore
        //we dont use & 255 with this to cancel the other bits except these 8 bits
        return table[n & 255]+table[(n>>8)&255]+table[(n>>16)&255]+table[(n>>24)];
    }

    public static int countSetbits_basic(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n / 2;
        }
        return count;
    }

    public static int countSetbits_Brian_Kerninghum_Algo(int n) {
        int res = 0;
        while (n > 0) {
            //expression to change the 1's bit to zero on every iteration
            n &= (n - 1);
            System.out.println("n = " + n);
            res += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int Setbits = Integer.parseInt(args[1]);
        System.out.println("Count Set bits using normal method : " + countSetbits_basic(num));
        System.out.println("Count Set bits using Brian Kerninghum Algo : " + countSetbits_Brian_Kerninghum_Algo(num));
        initialize();
        for(int i = 1;i<256;i++) System.out.print(table[i]+" ");
        System.out.println("\nNo of set bits for number -> "+Setbits+" are :"+countSetbits_tableMethod(Setbits));


    }
}
