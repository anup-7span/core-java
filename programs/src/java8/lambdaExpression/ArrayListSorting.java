package java8.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(345);
        l.add(4324);
        l.add(24);
        l.add(665);
        l.add(31245);
        l.add(34);
        l.add(45);
        l.add(3);
        System.out.println("Before sorting" + l);
        //Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("After sorting" + l);

    }
}
