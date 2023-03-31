package recordClass;

public record Student(Integer id, String name) {
  static int no;

  public static void main(String[] args) {
    Student s1 = new Student(1, "anup");
    Student s2 = new Student(2, "Jay");
    System.out.println("Student 1" + s1);
    System.out.println("Student 2" + s2);
    System.out.println(s1.equals(s2));
    System.out.println("R1 id " + " " + s1.id());
  }
}
