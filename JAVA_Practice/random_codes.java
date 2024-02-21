import java.util.Scanner;

public class random_codes {
    enum Color{
        RED,
        GREEN,
        WHITE
    }
    public static void accept_value(int[] arr,int len){
        System.out.println("Length of array :"+len);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static int[][] is2d_array(int[][] array,int ...indices) {
        for(int k = 0;k<indices.length;k++){
            array[k] = new int[indices[k]];
            accept_value(array[k],indices[k]);
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+"");
                sum+=array[i][j];
                array[i][j] = sum;
            }
        }
return array;
    }
    public static void main(String[] args) {
        int[][] array = new int[5][];
        int[][] result1 = is2d_array(array,5,4,3,2);
        System.out.print("\n Result :");
        for(int i = 0; i < result1.length; i++) {
            for(int j = 0; j < result1[i].length; j++) {
                System.out.print(array[i][j]+"");
            }
        }
    }
}
