package java8.function;

import java8.predicate.Employee;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
    String name;
    String designation;
    double salary;
    String city;

    public Employee1(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

}
public class Emp {
    public static void main(String[] args) {
        ArrayList<Employee1> list = new ArrayList<>();
        Employee1 e1 = new Employee1("Anup", "employee", 17000, "modasa");
        Employee1 e2 = new Employee1("Hetvi", "Manager", 42000, "Ahemdabad");
        Employee1 e3 = new Employee1("Harsh", "employee", 25000, "Ahemdabad");
        Employee1 e4 = new Employee1("Rimpal", "employee", 25000, "Mahesana");
        Employee1 e5 = new Employee1("Ankit", "employee", 55000, "Ahemdabad");
        Employee1 e6 = new Employee1("Abhi", "employee", 25000, "Ahemdabad");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        System.out.println(list);

        Function<ArrayList<Employee1>,Double> f= l->{
                double total =0;
                for (Employee1 l1 : l){
                    total= total + l1.salary;
                }
                return total;
        };
        System.out.println("Total salary of employee:-"+f.apply(list));

        Predicate<Employee1> p= e->e.salary<27000;
        Function<Employee1,Employee1> f1=e->{
            e.salary=e.salary+3000;
            return e;
        };
        System.out.println("After Increment");
        ArrayList<Employee1> list1=new ArrayList<>();
        for(Employee1 e : list){
            if (p.test(e)){
                f1.apply(e);
                list1.add(f1.apply(e));
            }
        }
        System.out.println("before update"+list);
        System.out.println("After update:-"+list1);
    }
}
