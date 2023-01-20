package java8.UnaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo
{
	public static void main(String[] args) {
		//normal unary operator
		UnaryOperator<Integer> f= i->i*i;
		System.out.println(f.apply(10));

		//primitive Version
		IntUnaryOperator f1=i->i*i;
		System.out.println(f1.applyAsInt(10));

	}
}