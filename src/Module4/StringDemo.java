package Module4;

public class StringDemo {
    public static void main(String[] args){
        String s = "Hello";
        s = s + " World";
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
}
