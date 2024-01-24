public class PowerSet {
    /*Power Set using Bitwise
162
Report
In this program we will learn to create a power set of a given set by using bitwise operators.
The method works by using the set bit to indicate the presence of a particular element ,
and running a loop from 0 to 2n-1 (where n is the number of elements ) which will cover
all possible subsets of the given set.
Eg => String str = "ab";
int len = 2;
now starting from 00 -> " ";
                  01-> "a";
                  10-> "b";
                  11-> "ab";
     */
    public static void SetPower(String str){
        int len = str.length(); //str = "ab";
        int pSize = (1<<len);//4 -> total 4 possible elements
        //first loop that will traverse through all the possible subsets
        for(int i =0;i<pSize;i++){
            //second loop will travel from 0 to n
            for(int j = 0;j<len;j++){
                if((i&(1<<j))!=0) System.out.print(str.charAt(j));
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        String str = args[0];
        SetPower(str);
    }
}
