package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundWildcard {
    public static void main(String[] args) {
        //List<Object> collect = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        //display(collect);
        List<Family> family = new ArrayList<>();
        List<GrandFather> gf = new ArrayList<>();
        List<Father> fa = new ArrayList<>();
        Father father = new Father();
        father.name ="John";
        fa.add(father);
        List<Son> son = new ArrayList<>();
        List<GrandSon> gs = new ArrayList<>();
        addMember(family);
    }
    public static void addMember(List<? super Family> list){
        // you can pass Father and its super classes
        list.add(new Son());
        list.add(new Father());
        list.add(new GrandFather()); // you can add only the class and the sub class
        list.add(new GrandSon());

    }
    public static void display(List<? super Number> list){
        list.add(new Double(10.50));
        for(Object number : list){
            System.out.println(number);
        }
    }

    // Upper Bound - ? extends Class
    // Lower Bound - ? super Class
}

