import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Shivam");
        list.add("Keshari");
        list.add(990);
        list.add("Shiv");
        list.add(2001);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
