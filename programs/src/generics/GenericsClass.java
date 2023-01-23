package generics;

public class GenericsClass <ID,NAME> {

    ID id;
    NAME name;

    public GenericsClass(ID id, NAME name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        GenericsClass<Integer,String> genericsClass = new GenericsClass(1,"anup");

        int id = genericsClass.id;
        String name= genericsClass.name;

        System.out.println("Id is:-"+id+" "+"Name is:-"+name);
    }
}

