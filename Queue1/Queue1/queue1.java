import com.sun.tools.javac.Main;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.offer(20);
        display(queue);
        queue.remove();
        display(queue);
        queue.poll();
        display(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());

    }
    public static void display(Collection Lst){
        for (Object s:Lst) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(" ");
    }
}