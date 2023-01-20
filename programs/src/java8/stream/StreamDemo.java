package java8.stream;

import java8.consumer.Emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
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

        List<Double> e=list.stream().map(emp -> emp.getSalary()*2).collect(Collectors.toList());
        List<Emp> s=list.stream().filter(l -> l.getName().length()>=5).collect(Collectors.toList());
        long c=list.stream().filter(l -> l.getName().length()>=5).count();
        List<Emp> ee=list.stream().sorted(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList());
        Optional<Emp> aa=list.stream().min(Comparator.comparing(Emp::getSalary));
        Optional<Emp> bb=list.stream().max(Comparator.comparing(Emp::getSalary));
        List<Emp> fewf=list.stream().sorted( (emp1,emp2) ->Double.compare(emp2.getSalary(),emp1.getSalary())).collect(Collectors.toList());
        System.out.println(fewf);


        System.out.println(e);
        System.out.println(s);
        System.out.println(c);
        System.out.println(aa);
        System.out.println(ee);
        System.out.println(bb);
        list.forEach(System.out::println);
    }
}
