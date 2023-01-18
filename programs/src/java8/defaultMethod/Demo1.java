package java8.defaultMethod;

public interface Demo1 {
    default void m1(){
        System.out.println("inside default method");
    }
}

class Test implements  Demo1{
    //Override default method
    public void m1(){
        System.out.println("Override default method");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
