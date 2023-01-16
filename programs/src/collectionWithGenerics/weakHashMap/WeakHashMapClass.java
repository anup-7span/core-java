package collectionWithGenerics.weakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args) throws InterruptedException {

        Map<User, String> map = new WeakHashMap<>();
        User u = new User();
        map.put(u, "Hello");
        System.out.println(map);
        u = null;
        System.gc();  // gc() method runs the garbage collector.
        Thread.sleep(5000); // 5 sec
        System.out.println(map);
    }
}
