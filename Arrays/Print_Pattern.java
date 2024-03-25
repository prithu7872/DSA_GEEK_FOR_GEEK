import java.util.ArrayList;
import java.util.List;

public class Print_Pattern {
    public void rec_pattern(List<Integer> list, int N, boolean check,int nums){
        list.add(N);
        if(check&&N==nums||nums<=0)return;
        if(N<=0)check = true;
        if(check)rec_pattern(list,N+5,true,nums);
        else rec_pattern(list,N-5, false,nums);
    }

    public List<Integer> pattern(int N){
        List<Integer> result = new ArrayList<Integer>();
        boolean check = false;
        rec_pattern(result, N, check,N);
        return result;
    }
    public static void main(String[] args){
       int n = Integer.parseInt(args[0]);

    }
}
