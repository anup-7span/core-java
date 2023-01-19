package java8.predicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Employee {
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation) && Objects.equals(city, employee.city);
    }

}

class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Anup", "employee", 17000, "modasa");
        Employee e2 = new Employee("Hetvi", "Manager", 42000, "Ahemdabad");
        Employee e3 = new Employee("Harsh", "employee", 25000, "Ahemdabad");
        Employee e4 = new Employee("Rimpal", "employee", 25000, "Mahesana");
        Employee e5 = new Employee("Ankit", "employee", 55000, "Ahemdabad");
        Employee e6 = new Employee("Abhi", "employee", 25000, "Ahemdabad");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        System.out.println(list);

        Predicate<Employee> p1 = employee -> employee.designation.equalsIgnoreCase("manager");
        Predicate<Employee> p2 = employee -> employee.salary > 20000;
        Predicate<Employee> p3 = employee -> employee.city.equalsIgnoreCase("ahemdabad");
        Predicate<Employee> p4 = employee -> employee.designation.equalsIgnoreCase("employee") && employee.city.equalsIgnoreCase("Ahemdabad");

        for (Employee e : list) {
        /*    if (p1.and(p2).and(p3).test(e)) {
                System.out.println(e);
            }*/
            if (p4.negate().test(e)) {
                System.out.println(e);
            }
        }
        Predicate<Employee> p5 = Predicate.isEqual(new Employee("Anup", "employee", 17000, "modasa"));
        System.out.println(p5.test(e1));
    }
}
