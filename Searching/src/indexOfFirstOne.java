public class indexOfFirstOne {
    static int least_position(int[] arr,int key){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid]<key)left = mid+1;
            else right = mid;
        }
        return left>0&&left<arr.length? left: -1;
    }
    static int indexOfFstOne(int[] arr, int low, int high)
    {
        int mid = -1;
        while (low <= high)
        {
        mid = (low + high) / 2;
        if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) return mid;
        else if (arr[mid] == 1) high = mid - 1;
        else low = mid + 1;
        }
        return mid;
    }

    public static void main(String[] args) {
        int[]  arr= {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(indexOfFstOne(arr,0, arr.length-1));
        System.out.println("First position of 1 : "+least_position(arr,1));
    }
}
