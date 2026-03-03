package Module5;
class MyException extends Exception {
    MyException(String msg){ super(msg); }
}

public class CustomExceptionDemo {
    static void check(int n) throws MyException{
        if(n<0) throw new MyException("Negative not allowed");
    }
    public static void main(String[] args){
        try{
            check(-1);
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
