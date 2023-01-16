package collectionWithGenerics.comparable;

import java.util.TreeSet;
import java.util.Set;


public class Employee implements Comparable<Employee>
{
	int id;
	String name;

	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public int compareTo(Employee o)
	{
		int id1=this.id;
		int id2=o.id;

		if(id1<id2)
		{
			return -1;
		}
		else if(id>id2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


	public static void main(String[] args) 
	{
		
		Set<Employee>set=new TreeSet<>();
		set.add(new Employee (100,"anup"));
		set.add(new Employee (400,"avadh"));
		set.add(new Employee (50,"abhi"));

		for (Employee employee: set ) 
		{
			System.out.println(employee.id);
			System.out.println(employee.name);
			
		}

	}
}