package collectionWithGenerics.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("anup", 201);
        h1.put("harsh", 101);
        HashMap<String, Integer> h2 = new HashMap<>();
        h2.put("aa", 11);
        h2.put("bb", 22);
        HashMap<String, Integer> h3 = new HashMap<>();
        h3.put("cc", 33);
        h3.put("dd", 44);
        HashMap<String, Integer> h4 = new HashMap<>();
        h4.put("ee", 55);
        h4.put("ff", 66);
        HashMap<String, Integer> h5 = new HashMap<>();
        h5.put("gg", 77);
        h5.put("hh", 88);

        List<HashMap> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);

/*        for (int i =0;i<list.size();i++){
            System.out.println(list.get(2));
        }*/

       // System.out.println(list);

/*
        for (HashMap l : list) {
            System.out.println(l);
            System.out.println(l.get("gg"));
        }
*/
        List<Student> list1 = new ArrayList<>();

        list1.add(new Student(1,"anup"));
        list1.add(new Student(2,"harsh"));
        list1.add(new Student(3,"nandani") );
        list1.add(new Student(4,"hetvi"));
        list1.add(new Student(5,"rimpal"));

        for (Student s :list1){
            /*if (s.getId()==4)
                System.out.println(s.name+" "+s.id);
            */
           if(s.getName().length()==5){
               System.out.println(s.name+" "+s.id);
           }
        }
       // list1.remove(2);
  /*      for (Student s :list1){
            System.out.println(s.name+" "+s.id);
        }*/

    }
}


