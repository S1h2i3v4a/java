import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>(); //also written as (new ArrayList<String>())7
        strlist.add("SHIVAM");
        strlist.add("KESHARI");
        strlist.add("yes");
        for (String s : strlist) {
            System.out.println(s);
        }


    }
}