// Java Program to Print Right Triangle Star Pattern

import java.util.Scanner;

public class Right_triangle_star_pattern {

    public static int printpattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }
}