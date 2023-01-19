package java8.predicate;

import java.util.function.Predicate;

public class PredicateFindString {
    public static void main(String[] args) {
        String[] name={"anup","harsh","hetvi","maitri"};
        Predicate<String> startWith=s->s.charAt(0)=='h';
        for (String s:name){
            if (startWith.test(s)){
                System.out.println(s);
            }
        }
    }
}
