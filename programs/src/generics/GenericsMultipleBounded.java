package generics;

public class GenericsMultipleBounded {
    public static void main(String[] args) {
        Integer max = FindMaximumMultipleBound.findMax(10, 20, 30);
        System.out.println("Maximum :" + max);
        Double max1 = FindMaximumMultipleBound.findMax(100.50, 12.25, 25.35);
        System.out.println("Maximum is :"+max1);
    }
}

class FindMaximumMultipleBound {
    public static <T extends Number & Comparable> T findMax(T t1, T t2, T t3) {
        T max = t1;
        if (t2.compareTo(max) > 0)
            max = t2;
        if (t3.compareTo(max) > 0)
            max = t3;
        return max;
    }
}
