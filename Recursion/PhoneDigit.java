import java.util.ArrayList;
import java.util.Scanner;

class PhoneDigit {
    static void Print2D_arr(char[][] arr_phone_no){
        for(int i=0; i<9; i++){
            int len = arr_phone_no[i].length;
            for(int j = 0; j < len; j++){
                System.out.print(arr_phone_no[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[][] createNumPlate(){
        char[][] arr_phone_no = new char[9][];

        int sub_arr_size;
        int char_value = 0;

        arr_phone_no[0] = new char[]{' '};

        for(int i = 1; i <= 8; i++){
            if(i == 6 || i == 8) sub_arr_size = 4;
            else sub_arr_size = 3;

            arr_phone_no[i] = new char[sub_arr_size];

            for(int j = 0; j < sub_arr_size; j++){
                arr_phone_no[i][j] = (char) ('a' + char_value);
                char_value++;
            }
        }

        return arr_phone_no;
    }

    static ArrayList<String> possibleWords(int[] a, int N){
        char[][] arr_phone_no = createNumPlate();
        ArrayList<String> res = new ArrayList<>();
        Print2D_arr(arr_phone_no);
        generateWords(a, N, arr_phone_no, 0, "", res);

        return res;
    }

    static void generateWords(int[] a, int N, char[][] arr_phone_no, int index, String current, ArrayList<String> result) {
        if (index == N) {
            result.add(current);
            return;
        }

        int digit = a[index]-1;
        int numChars = arr_phone_no[digit].length;

        for (int i = 0; i < numChars; i++) {
            generateWords(a, N, arr_phone_no, index + 1, current + arr_phone_no[digit][i], result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<String> result = possibleWords(arr, n);

        for(String word : result){
            System.out.print(word + " ");
        }
    }
}
