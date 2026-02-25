package Module2;

public class Student {

    int id;
    String name;

    Student() {
        id = 0;
        name = "NA";
    }

    Student(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Manasa");

        System.out.println("Default: " + s1.id + " " + s1.name);
        System.out.println("Parameterized: " + s2.id + " " + s2.name);
    }
}
