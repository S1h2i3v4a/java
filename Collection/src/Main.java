import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         List numlist = new ArrayList<>();
         numlist.add(5);
         numlist.add(2);
         numlist.add(10);
         numlist.add(8);
         display(numlist);
         Collections.sort(numlist);
         display(numlist);
         numlist.add(67);
         display(numlist);

    }
    public static void display(Collection Lst){
        for (Object s:Lst) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(" ");
    }
}