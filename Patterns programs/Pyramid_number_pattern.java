import java.util.Scanner;

class Pyramid_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println("");
        }
    }
}