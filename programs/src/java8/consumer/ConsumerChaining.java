package java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Emp1{
    String name;
    String designation;
    double salary;
    String city;

    public Emp1(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
public class ConsumerChaining {
    public static void main(String[] args) {

        ArrayList<Emp1> list = new ArrayList<>();
        Emp1 e1 = new Emp1("Anup", "employee", 17000, "modasa");
        Emp1 e2 = new Emp1("Hetvi", "Manager", 42000, "Ahemdabad");
        Emp1 e3 = new Emp1("Harsh", "employee", 25000, "Ahemdabad");
        Emp1 e4 = new Emp1("Rimpal", "employee", 25000, "Mahesana");
        Emp1 e5 = new Emp1("Ankit", "employee", 55000, "Ahemdabad");
        Emp1 e6 = new Emp1("Abhi", "employee", 25000, "Ahemdabad");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        System.out.println(list);

        Consumer<Emp1> c1= m->System.out.println("Employee name:"+m.name);

        Consumer<Emp1> c2=m->System.out.println("Employee name:"+m.name+" employee salary:"+m.salary);

        Consumer<Emp1> c3= m->System.out.println("Employee city:"+m.city);

        Consumer<Emp1> chainedC = c1.andThen(c2).andThen(c3);
        for (Emp1 emp1 : list) {
            chainedC.accept(emp1);
        }

    }
}
