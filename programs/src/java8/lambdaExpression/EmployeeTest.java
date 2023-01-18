package java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
class Employee
{
    int eno;
    String ename;
    Employee(int eno,String ename)
    {
        this.eno=eno;
        this.ename=ename;
    }
    public String toString()
    {
        return eno+":"+ename;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {

        ArrayList<Employee>l=new ArrayList<Employee>();

        l.add(new Employee(200,"anup"));
        l.add(new Employee(400,"ravi"));
        l.add(new Employee(600,"keval"));
        l.add(new Employee(800,"kajal"));
        l.add(new Employee(100,"priya"));
        System.out.println("before:-"+l);
        Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
        System.out.println("After:-"+l);


    }
}