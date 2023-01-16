package collectionWithGenerics.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=0;i<=100;i=i+10){
            list.add(i);
        }
        System.out.println("List is:-"+list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(444);
        System.out.println("List2 is:-"+list2);
        list.addAll(2,list2);
        System.out.println("Added list:-"+list);
        if (list.contains(33)){
            System.out.println("values present");
        }
        else {
            System.out.println("Values are not present");
        }
        for (int i =0;i<list.size();i++){
            System.out.println("List are:-"+list.get(i));
        }
        list.remove(3);
        System.out.println("List:-"+list);
    }


}
