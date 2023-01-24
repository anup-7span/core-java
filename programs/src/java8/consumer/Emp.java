package java8.consumer;


import java8.function.Student;
import java8.predicate.Employee;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

public class Emp{
    String name;
    String designation;
    double salary;
    String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Double.compare(emp.salary, salary) == 0 && Objects.equals(name, emp.name) && Objects.equals(designation, emp.designation) && Objects.equals(city, emp.city);
    }


    public Emp(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
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
class ConsumerEmployeeDemo {
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
