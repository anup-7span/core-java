package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        System.out.println(genericsMethod(1,2));
        System.out.println(strings("anup","harsh"));

    }
   static <T> List<T> genericsMethod(T t1 ,T t2){
        List<T> list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        return list;
    }
    static List<String> strings(String s1,String s2){
        List<String> list1=new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        return list1;
    }
}
