package java8.lambdaExpression;

import java.util.TreeMap;
import java.util.TreeSet;

public class MapSorting {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        t.add(345);
        t.add(4324);
        t.add(24);
        t.add(665);
        t.add(31245);
        t.add(34);
        t.add(45);
        t.add(3);
        System.out.println("Sorted tree set:-"+t);

        TreeMap<Integer,String> t1 = new TreeMap<>((I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        t1.put(34,"a");
        t1.put(4324,"bb");
        t1.put(24,"cc");
        t1.put(665,"dd");
        t1.put(31245,"ee");
        t1.put(34,"ff");
        t1.put(45,"gg");
        t1.put(3,"hh");
        System.out.println(t1);

    }
}
