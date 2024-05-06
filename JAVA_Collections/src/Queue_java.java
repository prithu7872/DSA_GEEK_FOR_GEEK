import java.util.LinkedList;
import java.util.Queue;

public class Queue_java {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(10);
        System.out.println(queue.poll());
    }
}
