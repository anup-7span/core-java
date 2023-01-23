package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsUpperBoundWildcard {
    public static void main(String[] args) {
        List<Family> family = new ArrayList<>();
        List<GrandFather> gf = new ArrayList<>();
        List<Father> fa = new ArrayList<>();
        Father father = new Father();
        father.name ="John";
        fa.add(father);
        List<Son> son = new ArrayList<>();
        List<GrandSon> gs = new ArrayList<>();
        familyTree(fa);

    }
    public static void familyTree(List<? extends GrandFather> list){
        for (GrandFather gf : list){
            System.out.println("Class is ."+gf.getClass().getName());
            System.out.println(gf);
        }
    }
    public static void addFamilyMember(List<? extends GrandFather> list){
        //list.add(new Son());
        //list.add(new GrandFather());
    }

}
class Family{}
class GrandFather extends Family{}
class Father extends GrandFather{
    String name;

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Son extends Father{}
class GrandSon extends Son{}