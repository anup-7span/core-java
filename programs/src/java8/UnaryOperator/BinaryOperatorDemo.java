package java8.UnaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        //normal Binary operator
        BinaryOperator<Integer> b=(i1,i2)->(i1+i2);
        System.out.println(b.apply(20,29));

        //primitive Binary operator
        IntBinaryOperator b1=(j1,j2)->(j1*j2);
        System.out.println(b1.applyAsInt(5,5));

    }
}
