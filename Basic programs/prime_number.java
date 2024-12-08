import java.util.Scanner;

public class prime_number {

    public static void printprime(int n) {
        int count = 0;
        if (n <= 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println("prime number");
            } else {
                System.out.println("non prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number then press enter key");
        int n = sc.nextInt();
        printprime(n);
    }
}
