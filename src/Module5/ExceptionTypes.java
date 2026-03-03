package Module5;

import java.io.*;

public class ExceptionTypes {
    public static void main(String[] args){
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Unchecked Exception");
        }
        try{
            FileReader f = new FileReader("abc.txt");
        }catch(IOException e){
            System.out.println("Checked Exception");
        }
    }
}