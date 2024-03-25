public class Floor_Array {
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int find(long[] arr,int start,int end,long x,int count){
        if(start<=end){
            int mid = (end-start)/2 +start;
            System.out.println("X :"+x+"Start "+arr[start]+" End : "+arr[end]+" Mid : "+arr[mid]+" Count : "+count);
            if(arr[mid]<=x){
                count = mid-start + 1;
                return find(arr,mid+1,end,x,count);
            }
            else {
                return find(arr,start,mid-1,x,count);
            }
        }
        return (count>0?count:-1);
    }

    static int findFloor(long[] arr, int n, long x){
        return find(arr,0,n-1,x,0);
    }


    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        int n = arr.length;
        long x = Long.parseLong(args[0]);
        System.out.println("Floor count : "+findFloor(arr,n,x));
    }

}
