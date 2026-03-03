package Module4;

class Student {
    static String college = "ISE";
    String name;
    Student(String name){ this.name = name; }
    static void showCollege(){ System.out.println(college); }
}

public class StaticDemo {
    public static void main(String[] args){
        Student s1 = new Student("Manasa");
        Student.showCollege();
        System.out.println(s1.name);
    }
}
