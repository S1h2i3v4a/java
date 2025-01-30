import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Apple");
        set.add("Banana");
        display(set);
        System.out.println(set.contains("Banana"));
        System.out.println(set.size());
        set.remove("Banana");
        display(set);
    }
    public static void display(Collection Lst){
        for (Object s:Lst) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(" ");
    }
}