package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsMethod {
    public static void main(String[] args) {
    Map<Integer,String> map1=map(1,"ANUP");
        System.out.println(map1);
    }
    static <K,V>Map<K,V> map (K key,V value){
        HashMap<K,V> map= new HashMap<>();
        map.put(key,value);
        return map;
    }
}
