public class TowerOfHanooi {
    public static long toh(int N, int source, int destination, int helper) {
        if(N == 1){System.out.println("move disk "+N+" from rod "+source+" to rod "+destination);return 1;}
        toh(N-1,source,helper,destination);
        System.out.println("move disk "+N+" from rod "+source+" to rod "+destination);
        toh(N-1,helper,destination,source);
        return (long)Math.pow(2,N)-1;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int start = 1;
        int mid = 2;
        int end = 3;
        long step = toh(N, start, end , mid);
        System.out.println("Steps : "+step);
    }
}
