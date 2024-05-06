import java.util.*;

public class Permutation {
    static List<List<Integer>> res = new ArrayList<>();
    static List<List<Integer>> res1 = new ArrayList<>();
    public static void recurse_permute(int[] nums, List<Integer>list,Set<Integer> set) {
        if (list.size() == nums.length) {
            System.out.println("\nFINAL LIST : " + list);
            res.add(new ArrayList<>(list));
            return;
        } else {
            System.out.println("\nBefore for loop List : " + list + " Set : " + set);
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(nums[i])) {
                    list.add(nums[i]);
                    set.add(nums[i]);
                    System.out.println("Before recursion : list -> " + list + " Set : " + set + " nums[i] : " + nums[i]);
                    recurse_permute(nums, list, set);
                    System.out.println("Before removing list.size()-1 : list -> " + list + " and removing nums[i] from Set : " + set);
                    list.remove(list.size() - 1);
                    set.remove(nums[i]);
                    System.out.println("After recursion : list -> " + list + " Set : " + set + " nums[i] : " + nums[i]);
                } else
                    System.out.println("\n\nIf Set contains element : list -> " + list + " Set : " + set + " nums[i] : " + nums[i] + "\n\n");
            }
            System.out.println("\n\nAfter one complete for loop with recursion  : list -> " + list + " Set : " + set);
        }
    }
    public static void swap(int[] arr,int a,int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void recurse_permute_no_extra_space(int[] nums, List<Integer>list,int swap_pos) {
        int len = nums.length;
        if (swap_pos==(len)) {
            System.out.println("\n\n\nFinal array : "+Arrays.toString(nums)+"FINAL LIST : "+list+"\n\n\n");
            res1.add(new ArrayList<>(list));
            return ;
        } else {
            System.out.println("\n\nBefore for loop List : " + list +" swap_pos : " + swap_pos);
            for (int i = swap_pos; i < nums.length; i++) {
                    System.out.println("\n\nIteration no : "+i+" before recursion : list -> " + list + " nums[i] : " + nums[i]+" swap_pos : " + swap_pos+"\n\n");
                    System.out.println("Before swap array :"+ Arrays.toString(nums));
                    swap(nums,i,swap_pos);
                   System.out.println("After swap array :"+ Arrays.toString(nums));
                    if((i!=swap_pos)&&nums[i]==nums[swap_pos])continue;
                    list.add(nums[swap_pos]);
                    recurse_permute_no_extra_space(nums, list,swap_pos+1);
                    swap(nums,i,swap_pos);
                    System.out.println("Before removing list.size()-1 : list -> " + list );
                    list.remove(list.size() - 1);
                    System.out.println("After recursion : list -> " + list + " nums[i] : " + nums[i]);
            }
            System.out.println("\n\nAfter one complete for loop with recursion  : list -> " + list );
        }
    }
    public static void permute(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        recurse_permute(nums,list,set);
        System.out.println("WITHOUT EXTRA SPACE ");
        recurse_permute_no_extra_space(nums,list,0);


    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        permute(nums);
        for(List l : res) {
            for(Object n : l){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        System.out.println("\n\n\nWITHOUT EXTRA SPACE ");

        for(List l : res1) {
            for(Object n : l){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
