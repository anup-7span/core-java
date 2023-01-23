package generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenericsUnBoundedWildCard {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        List<Double> collect1 = IntStream.range(1, 100).asDoubleStream().boxed().collect(Collectors.toList());
        List<Student1> students = Arrays.asList(new Student1("John"),
                new Student1("Nancy"));
        showData(students);
    }
    public static void showData(List<?> list){
        for (Object li : list){
            System.out.println(li);
        }
    }
    // ? extend Number
    // ? super Number
    static class Student1{
        String name;

        public Student1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}