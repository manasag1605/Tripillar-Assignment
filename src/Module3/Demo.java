package Module3;

class A {
    int add(int a, int b) {
        return a + b;
    }
}

class B extends A {
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Overloading: " + obj.add(2, 3, 4));
        System.out.println("Using parent method: " + obj.add(2, 3));
    }
}
