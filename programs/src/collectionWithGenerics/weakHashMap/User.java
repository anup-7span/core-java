package collectionWithGenerics.weakHashMap;

public class User {
    @Override
    public String toString() {
        return "UsersTest";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called");
    }
}