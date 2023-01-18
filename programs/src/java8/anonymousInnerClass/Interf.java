package java8.anonymousInnerClass;

public interface Interf {
    public void m1();
}
class Text{
    int x =10;

    public void m2() {
        int y =20;
        Interf i =()->{
            x=30;//we can change class level values. but we don't change method level values.
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }

    public static void main(String[] args) {
        Text t = new Text();
        t.m2();
    }

}
