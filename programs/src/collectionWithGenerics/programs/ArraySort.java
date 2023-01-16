package collectionWithGenerics.programs;

import collectionWithGenerics.comparator.MyComparator;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        int[] a={12,23,41,64,1,55};
        String[] b ={"y","c","k","z","l"};

        for (int ary:a){
            System.out.println("before sort:-"+ary);
        }
        Arrays.sort(a);
        for (int ary:a){
            System.out.println("after sort:-"+ary);
        }
        Arrays.sort(b,new MyComparator());
        for (String ary:b){
            System.out.println("after sort:-"+ary);
        }
       List<String> list= Arrays.asList(b);
        System.out.println(list);
    }
}
