package Module5;

public class DeadlockDemo {
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(o1){
                synchronized(o2){}
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized(o2){
                synchronized(o1){}
            }
        });
        t1.start();
        t2.start();
    }
}
