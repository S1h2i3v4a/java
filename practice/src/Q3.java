import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Q3 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        //a = {1,2,2,3,4,2,2,3};
        a.add(1);
        a.add(2);
        a.add(6);
        a.add(3);
        a.add(4);
        a.add(8);
        a.add(2);
        Collections.swap(a,2,4);
        Collections.swap(a,2,3);
        int b = Collections.frequency(a,2);
        System.out.println(a);
        System.out.println(b);

    }
}
