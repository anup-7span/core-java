package java8.lambdaExpression;
@FunctionalInterface
public interface Demo {
      void m1();

    default void m2() {
        System.out.println("hello");
    }
}
class test implements Demo{
  /*  public void m2(){
        System.out.println("bye");
    }*/
    public static void main(String[] args) {
        test t= new test();
        t.m2();

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        Demo.super.m2();
    }
}
