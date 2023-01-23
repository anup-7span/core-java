package generics;

public class GenericsTypeErasure {
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass("Hello");
        System.out.println(gc);
    }
}
class GenericClass<T>{
    T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }
}
