package java8.stream;

import java8.consumer.Emp;
import java8.function.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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
        Emp e7 = new Emp("", "employee", 42000, "modasa");
        Emp e8 = new Emp("Anup", "employee", 17000, "modasa");
        Emp e9 = new Emp("Hetvi", "Manager", 42000, "Ahemdabad");
        Emp e10 = new Emp("Harsh", "employee", 25000, "Ahemdabad");
        Emp e11 = new Emp("Rimpal", "employee", 25000, "Mahesana");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);


        Student s1 = new Student("anup", 77);
        Student s2 = new Student("hetvi", 97);
        Student s3 = new Student("harsh", 92);
        Student s4 = new Student("satyajit", 23);
        Student s5 = new Student("nanadni", 60);
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);


        List<Emp> removeNullOrEmpty = list.stream().filter(emp -> emp.getName() != null).filter(emp -> !emp.getName().isEmpty()).filter(emp -> !emp.getName().equals("")).collect(Collectors.toList());
        System.out.println("Remove null or empty values" + removeNullOrEmpty);

        List<Double> e = list.stream().map(emp -> emp.getSalary() * 2).collect(Collectors.toList());
        List<Emp> s = list.stream().filter(l -> l.getName().length() >= 5).collect(Collectors.toList());
        long c = list.stream().filter(l -> l.getName().length() >= 5).count();
        List<Emp> ee = list.stream().sorted(Comparator.comparing(Emp::getSalary)).collect(Collectors.toList());
        Optional<Emp> aa = list.stream().min(Comparator.comparing(Emp::getSalary));
        Optional<Emp> bb = list.stream().max(Comparator.comparing(Emp::getSalary));
        List<Emp> l1 = list.stream().sorted((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary())).collect(Collectors.toList());

        System.out.println("Sort list to dec order:-" + l1);
        System.out.println("Using map:-" + e);
        System.out.println("Filter record:-" + s);
        System.out.println("Count record" + c);
        System.out.println("Min salary" + aa);
        System.out.println("Sort record" + ee);
        System.out.println("Max salary" + bb);
        list.forEach(System.out::println);

        System.out.println("----------------------------------------");

        LinkedHashMap<Double, String> linkedHashMap = list.stream().collect(Collectors.toMap(Emp::getSalary, Emp::getName, (x, y) -> x + "," + y, LinkedHashMap::new));
        linkedHashMap.forEach((x, y) -> System.out.println(x + "=" + y));
        System.out.println("convert list into map:-" + linkedHashMap);

        System.out.println("----------------------------------------");

        Map<String, List<Emp>> groupBy = list.stream().collect(Collectors.groupingBy(Emp::getName));
        groupBy.forEach((k, v) -> System.out.println(k + " => " + v));

        System.out.println("----------------------------------------");

        DoubleSummaryStatistics statistics = list.stream().mapToDouble(Emp::getSalary).summaryStatistics();
        double min = statistics.getMin();
        double max = statistics.getMax();
        double sum = statistics.getSum();
        double count = statistics.getCount();
        System.out.println("Statistics :-" + "Min salary:-" + min + " " + "Max salary:-" + max + " " + "Sum of salary:-" + sum + " " + "Salary count:-" + count);

        System.out.println("----------------------------------------");

        boolean allMatch = list.stream().allMatch(emp -> emp.getSalary() > 1000);
        System.out.println("Check salary:-" + allMatch);

        System.out.println("----------------------------------------");

        boolean anyMatch = list.stream().anyMatch(emp -> emp.getSalary() > 50000);
        System.out.println("Any matched salary:-" + anyMatch);

        System.out.println("----------------------------------------");

        List<Emp> distinct = list.stream().distinct().filter(distinctByKey(Emp::getSalary)).collect(Collectors.toList());
        System.out.println("Distinct values are:-" + distinct);

        System.out.println("----------------------------------------");

        Optional<Emp> findFirst = list.stream().findFirst();
        System.out.println("Find fist is:-" + findFirst);

        System.out.println("----------------------------------------");

        Optional<Emp> findAny = list.stream().filter(emp -> emp.getSalary() > 40000).findAny();
        System.out.println(findAny);

        System.out.println("----------------------------------------");

        List<ArrayList<?>> finalList = Arrays.asList(list,list1);
        System.out.println("Final list:-"+finalList);
        List<Object> flatMap =  finalList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        flatMap.forEach(System.out::println);

        System.out.println("----------------------------------------");

        List<Emp> limit = list.stream().limit(4).collect(Collectors.toList());
        System.out.println("Limit of :-"+limit);

        System.out.println("----------------------------------------");

        List<Emp> skip = list.stream().skip(3).collect(Collectors.toList());
        System.out.println("Skip of :-"+skip);

        System.out.println("----------------------------------------");

        List<Emp> peek = list.stream().peek(System.out::println).collect(Collectors.toList());
        peek.forEach(System.out::println);

        System.out.println("----------------------------------------");

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
