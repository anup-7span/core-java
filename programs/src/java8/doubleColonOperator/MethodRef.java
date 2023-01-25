package java8.doubleColonOperator;

interface Interf{
	public void m1();
}
public class MethodRef
{
	public static void m2(){

		System.out.println("Implementation by method reference");
	}

	public static void main(String[] args) {
		
		//Interf i= MethodRef::m2;
		//i.m1();
		 MethodRef.m2();
	}
}