public class Mask_Bit {
    public static int maskKthBit(int n,int k){
      //get the position and complement it
        int mask = ~(1<<k);
        return mask & n;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println("Number after masking : "+maskKthBit(n,k));
    }
}
