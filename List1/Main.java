import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<>(); //also written as (new ArrayList<String>())
        strlist.add("SHIVAM");
        strlist.add("KESHARI");
        strlist.add("yes");
        display(strlist);
        strlist.add(1,"cse");
        display(strlist);
        strlist.remove(1);
        display(strlist);
        strlist.remove("KESHARI");
        display(strlist);
        strlist.set(1,"KESHARI");
        display(strlist);
        System.out.println(strlist.size());
        System.out.println(strlist.get(1));
        System.out.println(strlist.contains("SHIVAM"));
        strlist.clear();
        display(strlist);


    }
    public static void display(Collection Lst){
        for (Object s:Lst) {
            System.out.print(s.toString() + " ");
        }
        System.out.println(" ");
    }
}