import java.util.Scanner;

public class Task8 {
    public static void generate(int n, int k, String current) {
        if (n == 0) {
            System.out.println(current.trim());
            return;
        }

        for (int i = 1; i <= k; i++) {
            generate(n - 1, k, current + i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        generate(n, k, "");
    }
}