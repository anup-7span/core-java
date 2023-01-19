package java8.function;

import java.util.function.Function;

public class FunctionChainingDemo1
{
    public static void main(String[] args) {

        Function<String,String> f1= s->s.toUpperCase();
        Function<String,String>f2=s->s.substring(0,6);

        System.out.println("The Result of f1:-"+f1.apply("AnupPanchal"));
        System.out.println("The Result of f2:-"+f2.apply("AnupPanchal"));

        System.out.println("The result:-"+f1.andThen(f2).apply("AnupPanchal"));
        System.out.println("The result:-"+f1.compose(f2).apply("AnupPanchal"));

    }
}