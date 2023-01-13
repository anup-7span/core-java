package Array;

import java.util.ArrayList;
import java.util.List;

class Employee {
    public String name;
    public Integer salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee[] obj = new Employee[10];
        obj[0] = new Employee("anup", 100);
        obj[1] = new Employee("ravi", 101);
        obj[2] = new Employee("harsh", 102);
        obj[3] = new Employee("hetvi", 103);
        obj[4] = new Employee("nandani", 104);
        obj[5] = new Employee("rimpal", 111);
        obj[6] = new Employee("ankit", 106);
        obj[7] = new Employee("nikunj", 107);
        obj[8] = new Employee("anil", 108);
        obj[9] = new Employee("tejas", 109);

        Employee employee = obj[0];
        for (int i =0 ;i< obj.length;i++){

            //for max salary
            if(employee.getSalary()<obj[i].getSalary()){
                employee =obj[i];
            }
            //for min salary
            if(employee.getSalary()>obj[i].getSalary()){
                employee =obj[i];
            }

            System.out.println("max salary="+employee.getSalary());
        }
    }

}

