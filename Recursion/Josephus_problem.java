class Josephus_problem {
    public static int josephus(int n,int k){
        if(n==1)return 0;
        return ((josephus(n-1,k)+k)%n);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(josephus(n,k));

    }
}
