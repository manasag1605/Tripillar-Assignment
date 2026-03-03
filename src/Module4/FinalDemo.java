package Module4;

final class A {
    final int x = 10;
    final void show(){ System.out.println(x); }
}

public class FinalDemo {
    public static void main(String[] args){
        A obj = new A();
        obj.show();
    }
}
