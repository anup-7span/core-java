package java8.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo1 {
/*    public static void main(String[] args) {
        Predicate<Integer> p=i->i>10;
        System.out.println(p.test(100));
    }*/
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p= (i,a)->i%a == 0;
        System.out.println(p.test(1000,100));
    }
}

