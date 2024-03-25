public class Moore_voting_algo_Find_Majority {
    public static int findMaxFrequencyElement(int[] a,int size) {//only can be implemented if contains majority element
        // i.e element should have frequency more than n/2
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
    public static boolean maxMajority(int[] arr, int size) {
        int maxMajority = findMaxFrequencyElement(arr,size);
        int count = 0;
        for(int a : arr){
            if(a == maxMajority)count++;
        }
        return (count>size/2);
    }
    public static void main(String[] args) {
        int[] arr = {8,8,8,8,6,3,9,0,8,8};
        int n = arr.length;
        System.out.println(findMaxFrequencyElement(arr,n));
        System.out.println(maxMajority(arr,n)?"YES":"NO");
    }
}
