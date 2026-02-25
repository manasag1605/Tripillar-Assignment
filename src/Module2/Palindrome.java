package Module2;

import java.util.*;
public class Palindrome {

    static boolean check(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (check(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
