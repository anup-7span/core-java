package java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateNullString  {
    public static void main(String[] args)
    {
        String[] names={"Anup","",null,"Ravi","","Keval",null};
        Predicate<String> p= s-> s != null && s.length()!=0;
        ArrayList<String> list=new ArrayList<>();
        for(String s : names)
        {
            if(p.test(s))
            {
                list.add(s);
            }
        }
        System.out.println("The List of valid Names:");
        System.out.println(list);
    }
}
