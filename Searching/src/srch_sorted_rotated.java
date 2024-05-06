public class srch_sorted_rotated {
    static int modified_binary_srch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > arr[left]) {  //left sorted
                if (target < arr[mid] && target >= arr[left]) {//present in sorted half
                    return modified_binary_srch(arr, left, mid - 1, target);
                } else return modified_binary_srch(arr, mid + 1, right, target);
            } else {//right sorted
                if (target > arr[mid] && target <= arr[right]) {//check in right
                    return modified_binary_srch(arr, mid + 1, right, target);
                }
                return modified_binary_srch(arr, left, mid - 1, target);
            }
        }

        return -1;
    }

    static int minNumber(int arr[], int low, int high) {
        if (arr[low] <= arr[high]) return arr[low];
        // Your code here
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prev = (mid + arr.length - 1) % arr.length;
            int next = (mid + 1) % arr.length;
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) return arr[mid];
            if (arr[mid] >= arr[low])//left sorted
            {
                //check right part
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    static int find_smallest(int[] arr){
        int left = 0;
        int right = arr.length -1;
        while(left<right){
            int mid = left + (right - left) /2;
            System.out.println("MID : "+arr[mid]+" Left : "+arr[left]+" Right : "+arr[right]);
            //if(arr[mid]<=arr[left]&&arr[mid]<=arr[right])return arr[mid];
            if(arr[mid]>arr[right])left = mid+1;
            else right = mid;
        }
        return left<arr.length ?arr[left]:-1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 1};//left part sorted
        int[] arr = {7, 8, 1, 2, 3, 4, 5, 6};//right part sorted
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};//both sorted
        int[] arr_sorted_rotated_two_times = {6,7,1,2,3,4,5};//both sorted


        //IMPORTANT POINT IS ONE HALF OF SORTED ROTATED IS ALWAYS SORTED
        int target = 3;
        System.out.println("Target in arr1 : " + modified_binary_srch(arr1, 0, arr1.length - 1, target));
        System.out.println("Target in arr : " + modified_binary_srch(arr, 0, arr.length - 1, target));
        System.out.println("Target in arr2 : " + modified_binary_srch(arr2, 0, arr2.length - 1, target));
        System.out.println("Minimum number arr1:" + minNumber(arr1, 0, arr1.length - 1));
        System.out.println("Minimum number arr:" + minNumber(arr, 0, arr.length - 1));
        System.out.println("Minimum number arr2:" + minNumber(arr2, 0, arr2.length - 1));
        System.out.println("Minimum number arr1 easy case : " +find_smallest(arr1));
        System.out.println("Minimum number arr: easy case :" + find_smallest(arr));
        System.out.println("Minimum number arr2: easy case : " + find_smallest(arr2));
        System.out.println("Minimum number in sorted_rotated_two_times array : " + find_smallest(arr_sorted_rotated_two_times));
    }
}