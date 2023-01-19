package java8.consumer;


import java.util.ArrayList;
import java.util.function.Consumer;

class Emp{
    String name;
    String designation;
    double salary;
    String city;

    public Emp(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
public class ConsumerEmployeeDemo {
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

        Consumer<Emp> e=m->{
            System.out.println("Employee name:-"+m.name);
            System.out.println("Employee city:-"+m.city);
            System.out.println("Employee salary:-"+m.salary);
        };
        for (Emp emp:list){
            e.accept(emp);
        }
    }
}
