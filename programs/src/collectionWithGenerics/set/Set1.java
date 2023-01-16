package collectionWithGenerics.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer>list=new ArrayList<>();
        for (int i =0;i<=10;i++){
            int n=r.nextInt(5);
            list.add(n);
        }
        System.out.println("List is:-"+list);
        Set<Integer> set=new HashSet<>(list);
        System.out.println("Set is:-"+set);
    }
}
