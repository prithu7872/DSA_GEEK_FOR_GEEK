public class Rope_cutting_Problem {
    public static int total_pieces(int len,int p1,int p2,int p3 ){
        System.out.println("NUM: "+ len);
        if(len<0)return -1 ;
        if(len == 0)return  0;
        int res = Math.max(total_pieces(len-p1,p1,p2,p3),total_pieces(len-p2,p1,p2,p3));
        res = Math.max(res,total_pieces(len-p3,p1,p2,p3));
        if(res == -1){System.out.println("MAX RES: "+res);return -1;}
        System.out.println("MAX RES: "+res+1);
        return res+1;
    }
    public static void main(String[] args) {
        int rope_len = Integer.parseInt(args[0]);
        int peice1 = Integer.parseInt(args[1]);
        int peice2 = Integer.parseInt(args[2]);
        int peice3 = Integer.parseInt(args[3]);
        System.out.println("Total no of pieces : "+total_pieces(rope_len,peice1,peice2,peice3));
     /*   int[] cut_peice = new int[4];
        System.arraycopy(args, 1, cut_peice, 0, rope_len);*/
    }
}
