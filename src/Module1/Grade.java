package Module1;

import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        switch (m / 10) {
            case 10:
            case 9: System.out.println("Grade: A"); break;
            case 8: System.out.println("Grade: B"); break;
            case 7: System.out.println("Grade: C"); break;
            case 6: System.out.println("Grade: D"); break;
            default: System.out.println("Grade: F");
        }
    }
}