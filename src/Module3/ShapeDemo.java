package Module3;

class Shape {
    void area() {
        System.out.println("Area");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}
