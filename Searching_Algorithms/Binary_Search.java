public class Binary_Search {
    public static int binary_rank(int key ,int[] array){
        return  binary_rank(key,array,0,array.length-1);
    }
    public static int binary_rank(int key ,int[] array,int low,int high){
        //base case for binary search
        if(low>high)return -1;//end of binary search---key not found
        int mid = low + (high-low)/2;
        if(key<array[mid])return binary_rank(key,array,low,mid-1);
        else if(key>array[mid])return binary_rank(key,array,mid+1,high);
        else return mid;
    }
    public static void main(String[] args) {
       int[] array = new int[]{12,45,78,123,145,667,789,897,1205,7845};
        System.out.println("Position of 897 : "+binary_rank(897,array));
    }
}
