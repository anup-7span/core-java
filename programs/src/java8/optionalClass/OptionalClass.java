package java8.optionalClass;

import java8.consumer.Emp;
import jdk.nashorn.internal.runtime.options.Option;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        String name="Anup panchal";

        Optional<String> optional=Optional.ofNullable(name);
             System.out.println(optional.isPresent());
            System.out.println(optional.get());
            System.out.println(optional.orElse("no values"));


        ArrayList<Emp> list = new ArrayList<>();
        Emp e1 = new Emp("Anup", "employee", 17000, "modasa");
        Emp e2 = new Emp("Hetvi", "Manager", 42000, "Ahemdabad");
        Emp e3 = new Emp("Harsh", "employee", 25000, "Ahemdabad");
        Emp e4 = new Emp("Rimpal", "employee", 25000, "Mahesana");
        Emp e5 = new Emp("Ankit", "employee", 55000, "Ahemdabad");
        Emp e6 = new Emp("Abhi", "employee", 25000, "Ahemdabad");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        System.out.println(list);

        Optional<Emp> aa=list.stream().min(Comparator.comparing(Emp::getSalary));
        System.out.println(aa);
        Optional<Emp> bb=list.stream().max(Comparator.comparing(Emp::getSalary));
        System.out.println(bb);

    }
}
