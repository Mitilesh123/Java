import java.util.Scanner;

public class fifth_pattern {
    public static void printpattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("enter value");
        printpattern();
    }
}
