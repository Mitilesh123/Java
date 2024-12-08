import java.util.Scanner;

public class factorial_number {
    public static int printfactorial(int n) {
        if (n <= 0) {
            System.out.println("Invalid number");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("factorial of " + n + " is " + fact);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number then press enter key");
        int n = sc.nextInt();
        printfactorial(n);

    }
}
