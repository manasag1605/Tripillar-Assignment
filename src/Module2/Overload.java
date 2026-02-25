package Module2;

public class Overload {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        System.out.println("Integer Sum: " + o.add(5, 3));
        System.out.println("Double Sum: " + o.add(5.5, 2.5));
    }
}