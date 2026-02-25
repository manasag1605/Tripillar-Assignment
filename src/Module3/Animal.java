package Module3;

class AnimalD {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends AnimalD {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}