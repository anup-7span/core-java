package java8.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer>f=s -> s.length();
        System.out.println(f.apply("anup"));

        String string="Anup panchal";
        Function<String,String> f1= s -> s.replaceAll(" ","");
        System.out.println(f1.apply(string));

        Function<String,Integer> f2= s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(f2.apply(string));
    }
}
