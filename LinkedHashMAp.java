import java.util.*;
public class LinkedHashMAp {
    public static void main(String[] args) {

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal",50);


        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("Nepal",50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal",50);

        System.out.println(tm);
        System.out.println(hm);
        System.out.println(lhm);
    }
}
