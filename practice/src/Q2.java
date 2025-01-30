import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<String>strlist = new ArrayList<>();
        strlist.add("Cat");
        strlist.add("Bat");
        strlist.add("Tat");
        strlist.add("Pat");
        Collections.sort(strlist);
        display(strlist);
        Collections.sort(strlist, Comparator.reverseOrder());
        display(strlist);
    }
    public static void display(Collection Lst){
        for (Object s:Lst) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(" ");
    }
}
