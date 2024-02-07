
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex_pattern_matching {

        public static int ReturnToRoot(int N, String[] M) {
            // code here
            int steps = 0;
            String regex1 = "^[A-Za-z]/";
            Pattern pattern1 = Pattern.compile(regex1);
            String regex3 = "\\./";

            Pattern pattern3 = Pattern.compile(regex3);
            String regex2 = "\\.\\./";
            Pattern pattern2 = Pattern.compile(regex2);

            for(String str : M){
                Matcher m1 = pattern1.matcher(str);
                Matcher m2 = pattern2.matcher(str);
                Matcher m3 = pattern3.matcher(str);
                if(m1.find())steps++;
                else if(m2.find())steps--;
                else if(!m3.find()){
                    System.out.println("Error in code");
                    break;
                };
            }
            return steps;
        }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] arr = new String[n];
        System.arraycopy(args, 1, arr, 0, n);
        System.out.println("No of steps to reach Root directory : "+ReturnToRoot(n,arr));
    }
}
