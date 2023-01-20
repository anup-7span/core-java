package java8.doubleColonOperator;

public class MethodRef2
{
	public void m1()
	{
		for (int i=0;i<10 ;i++ ) 
		{
			System.out.println("Child Thread");	
		}
	}

	public static void main(String[] args) {

		MethodRef2 d=new MethodRef2();
		Runnable r=d::m1;

		Thread t1=new Thread(r);
		t1.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}