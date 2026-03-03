package Module5;
public class ThreadStateDemo extends Thread {
    public void run(){
        try{ Thread.sleep(1000); }catch(Exception e){}
    }
    public static void main(String[] args){
        ThreadStateDemo t = new ThreadStateDemo();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }
}
