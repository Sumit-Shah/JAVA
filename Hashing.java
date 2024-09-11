import java.util.*;
public class Hashing {
    public static void main(String args[]) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();


        // Insert -O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesoa", 6);
        hm.put("Nepal",5);

        System.out.println(hm);

        // //Get -O(1)
        // int population = hm.get("China");
        // System.out.println(population);


        // //ContainsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Nepal"));

        // //remove - O(1)
        // System.out.println(hm.remove("China")); 

        // System.out.println(hm);


        //size
        // System.out.println(hm.size());

        //Is EMpty
        // hm.clear();
        // System.out.println(hm.isEmpty());

        //ITERATE
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("key=" + k + " , value = " + hm.get(k));
        // }

        // System.out.println(hm.entrySet());
    }
}    