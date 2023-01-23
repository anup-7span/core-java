package generics;

public class GenericUpperBounded {
    public static void main(String[] args) {
        //inspect(10);
        Integer display = display(1000, 200);
        System.out.println(display);
        String max = FindMaximum.findMax("H", "E", "S");
        System.out.println("Maximum :"+max);
    }
    public static <T extends Number> void inspect(T t){
        System.out.println("T type is :"+t.getClass().getName());
    }
    public static <T extends Comparable> T display(T t1, T t2){
        return t1.compareTo(t2) > 0 ? t1:t2;
    }
}
class FindMaximum{
    public static <T extends Comparable> T findMax(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max)>0)
            max = t2;
        if(t3.compareTo(max)>0)
            max = t3;
        return max;
    }
}
