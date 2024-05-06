import java.util.ArrayList;
import java.util.Scanner;
public class BFS_traversal {
    public static ArrayList<Integer> bfs_traversal(ArrayList<ArrayList<Integer> adj){

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>adj_list = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            ArrayList<Integer> lst = new ArrayList<>();
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                lst.add(sc.nextInt());
            }
            adj_list.add(lst);
        }
        for(ArrayList<Integer> lst : adj_list){
            System.out.println(lst);
        }
    }

}
/*
        0
        2 2 6
        3 1 3 4
        1 2
        2 2 5
        2 4 8
        3 1 7 9
        2 6 8
        2 7 5
        1 6
*/