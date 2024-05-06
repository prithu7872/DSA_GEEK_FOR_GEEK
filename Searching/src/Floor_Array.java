public class Floor_Array {
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int find2(long[] arr,int start,int end,long x,long max,int pos){
        if(start<=end){
            int mid = (end-start)/2 +start;
            System.out.println("X :"+x+"Start "+arr[start]+" End : "+arr[end]+" Mid : "+arr[mid]+" Max near to x"+max+" Position : "+pos);

            if(arr[mid]<=x){
                if(arr[mid]>max){
                    max = arr[mid];
                    pos = mid;
                }
                return find2(arr,mid+1,end,x,max,pos);
            }
            else {
                return find2(arr,start,mid-1,x,max,pos);
            }
        }
        return pos;
    }
    static int findFloor2(long[] arr, int n, long x){
        if(x<arr[0])return -1;
        else if(x>arr[n-1])return n-1;
        else return find2(arr,0,n-1,x,0,0);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long x = Long.parseLong(args[1]);
        long[] arr = new long[n];
        for(int i = 2; i < n+2; i++) {
            arr[i-2] = Long.parseLong(args[i]);
        }
        System.out.println("Floor count : "+findFloor2(arr,n,x));
    }

}
