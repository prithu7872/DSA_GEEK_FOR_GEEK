public class SubMatrixSUM {
    static int No_of_Appearences(int X_coord, int Y_coord, int rows, int cols){
        //no of appereances in top_left matrix
        int top_left = (X_coord+1)*(Y_coord+1);
        int top_right = (rows - X_coord)*(cols - Y_coord);
        System.out.print("Top left appreances : "+top_left+"  Top right appereances : "+top_right);
        return top_left * top_right;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols;j++){
                int num = matrix[i][j];
                int no_of_app = No_of_Appearences(i,j,rows,cols);
                System.out.println(" and  Total No of appereances of "+num+" => "+no_of_app);
                sum = sum + (num*no_of_app);
            }
        }
        System.out.println("Sub Matrix Sum: " + sum);
    }
}
