import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Orange",30);
        System.out.println(map.get("Apple"));
        map.remove("Banana");
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}