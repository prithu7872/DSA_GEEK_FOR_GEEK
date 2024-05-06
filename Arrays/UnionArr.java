/*
Note: 'a' and 'b' may contain duplicate elements, but the union array must contain unique elements.
Example:
Input: ‘n’ = 5 ‘m’ = 3
‘a’ = [1, 2, 3, 4, 6]
‘b’ = [2, 3, 5]

Output: [1, 2, 3, 4, 5, 6]

Explanation: Common elements in ‘a’ and ‘b’ are: [2, 3]
Distinct elements in ‘a’ are: [1, 4, 6]
Distinct elements in ‘b’ are: [5]
Union of ‘a’ and ‘b’ is: [1, 2, 3, 4, 5, 6]
 */

import java.util.ArrayList;
import java.util.List;

public class UnionArr {
    static List<Integer> union(int[] a, int[] b){
        List<Integer> list = new ArrayList<Integer>();
        int n = a.length;
        int m = b.length;
        int a_ptr = 0;
        int b_ptr = 0;
        while(a_ptr < n && b_ptr < m){
            if(a[a_ptr] <= b[b_ptr]){
                if(list.isEmpty() ||(list.get(list.size()-1)!=a[a_ptr])) list.add(a[a_ptr]);
                a_ptr++;
            }else{
                if(list.isEmpty() ||(list.get(list.size()-1)!=b[b_ptr])) list.add(b[b_ptr]);
                b_ptr++;
            }
            for(int r : list){
                System.out.print(r+" ");
            }
            System.out.println("--------------------------------");
        }
        while(a_ptr < n ){
           if(list.get(list.size()-1)!=a[a_ptr])list.add(a[a_ptr]);
           a_ptr++;
        }
        while(b_ptr < m ){
            if(list.get(list.size()-1)!=b[b_ptr])list.add(b[b_ptr]);
            b_ptr++;
        }
        return list;
    }
    public static void main(String[] args) {
       int[] a = {1, 2, 3,3, 4, 6};
       int[]b = {3, 5, 7};
       List<Integer> res = union(a, b);
       for(int r : res){
           System.out.println(r);
       }
    }
}
