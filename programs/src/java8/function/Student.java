package java8.function;

import java.util.ArrayList;
import java.util.function.Function;

public class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
class Test{
    public static void main(String[] args) {


        Student s1 = new Student("anup", 77);
        Student s2 = new Student("hetvi", 97);
        Student s3 = new Student("harsh", 92);
        Student s4 = new Student("satyajit", 23);
        Student s5 = new Student("nanadni", 60);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println(list);

        Function<Student,String> f=s -> {
            int marks =s.marks;
            if(marks>=80){
                return "A[Distinction]";
            } else if (marks>=60) {
                return "B[First-class]";
            } else if (marks>=50) {
                return "c[second-class]";
            } else if (marks>=35) {
                return "d[Third-class]";
            }else{
                return "E[failed]";
            }
        };
        for (Student s : list) {
            System.out.println("Student name:-" + s.name);
            System.out.println("Student marks:-"+ s.marks);
            System.out.println("Student grade:-"+f.apply(s));
        }
    }

}
