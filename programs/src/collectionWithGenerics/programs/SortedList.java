package collectionWithGenerics.programs;

import collectionWithGenerics.comparator.MyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("d");
        l.add("k");
        l.add("a");
        l.add("e");
        l.add("l");
        l.add("b");

        System.out.println("Before sort:-"+l);
        //sorted
        Collections.sort(l);
        System.out.println("Sorted list:-"+l);
        //Collections.sort(l,new MyComparator());

        //binary search
        int result = Collections.binarySearch(l,"e");
        System.out.println("After sort:-"+result);
    }
}
