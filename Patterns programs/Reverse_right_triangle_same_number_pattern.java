import java.util.Scanner;

public class Reverse_right_triangle_same_number_pattern {

    public static int printpattern() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println("");
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter value");
        printpattern();
    }
}
