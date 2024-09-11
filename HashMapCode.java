// import java.lang.classfile.components.ClassPrinter.Node;
// import java.util.*;

// public class HashMapCode {
//     static class HashMap<K,V> {
//         private class None {
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; //n
//         private int N;
//         private LinkedList<Node> buckets[]; //N = buckets.length

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++) {
//                 this.buckets[i] = new LinkedList<>()
//             }
//         }

//         private int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % buckets.length;
//         }

//         private int SearchInLL(K key, int bi) {
//             LinkedList<Node>Ill = buckets[bi];
//             int di = 0;

//             for(int i=0; i<ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if(node.key == key) {
//                     return di;
//                 }
//                 di++;
//             }

//             return -1;
            
//         }

//         private void rehash(){
//             LinkedList<Node> oldBuck[] = buckets;
//             buckets = new LinkedList[N*2];
//             N = 2*N;
//             for(int i=0 i<buckets.length; i++) {
//                 buckets[i] = new LinkedList<>();
//             }

//             //nodes -> add in buckets
//             for(int i=0; i<oldBuck.length; i++) {
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(int j=0; j<ll.size(); j++) {
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         public void put(K key, V value){ //
//             int bi = hashFunction(key); //0 to 3
//             int di = searchInLL(key); //valid; -1

//             if(di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             } else {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double)n/N;
//             if(lambda > 2.0) {
//                 rehash();
//             }
//         }

//         public boolean containskey(K key) { //O(1)
//             int bi = hashFunction(key); //0 to 3
//             int di = searchInLL(key); //valid; -1

//             if(di != -1) {
//                 return true;
//             } else {
//                 return false;
//             }        }

//         public V remove(K key) { 
//             int bi = hashFunction(key); //0 to 3
//             int di = searchInLL(key); //valid; -1

//             if(di != -1) {
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             } else {
//                 return null;
//             }        }
//         public V get(K Key) {  //O(1)
//             int bi = hashFunction(key); //0 to 3
//             int di = searchInLL(key); //valid; -1

//             if(di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//                 return node.value;
//             } else {
//                 return null;
//             }        }
//         public ArrayList<K> keySet(){
//             ArrayList<k> keys = new ArrayList<>();

//             for(int i=0; i<buckets.length; i++) {
//                 LinkedList<Node> ll = buckets[i];
//                 for (Node node : ll) {
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//                 }

//         public boolean isEmpty() {
//             return n == 0;
//         } 
//     }

//     public static void main(String[] args) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100 );
//         hm.put("China", 150);
//         hm.put("Us", 50);
//         hm.put("Nepal", 5);

//         ArrayList<String> keys = hm.keySet();
//         for (String : keys) 
//     }
// }





import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N; // size of the bucket array
        private LinkedList<Node>[] buckets; // array of LinkedLists to store nodes

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<Node>(); // Fixed instantiation
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; // Corrected LinkedList type
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() { 
            LinkedList<Node>[] oldBuck = buckets; // Corrected LinkedList type
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<Node>(); // Fixed instantiation
            }

            // Re-insert nodes into new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // node index in the linked list

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value; // Update existing key's value
            } else {
                buckets[bi].add(new Node(key, value)); // Add new key-value pair
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash(); // Rehash if load factor exceeds threshold
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
