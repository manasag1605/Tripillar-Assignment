package Module5;

public class DivisionDemo {
    public static void main(String[] args){
        try{
            int a = 10/0;
        }catch(Exception e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Done");
        }
    }
}
