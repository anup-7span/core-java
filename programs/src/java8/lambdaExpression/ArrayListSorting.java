package java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListSorting {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(345);
        l.add(4324);
        l.add(24);
        l.add(665);
        l.add(34);
        l.add(34);
        l.add(45);
        l.add(34);
        System.out.println("Before sorting" + l);
        Collections.sort(l,(I1, I2)->(I1>I2)?-1:(I1<I2)?1:0);
        System.out.println("After sorting" + l);

        List<Integer> ll=l.stream().distinct().collect(Collectors.toList());
        System.out.println(ll);
        Optional<Integer> l1=l.stream().findFirst();
        System.out.println(l1);
    }
}
