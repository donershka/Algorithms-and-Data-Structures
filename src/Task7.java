import java.util.Scanner;

public class Task7 {
    public static void fillSpiral(int[][] a, int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) {
            return;
        }

        for (int i = left; i <= right; i++) {
            a[top][i] = num++;
        }

        for (int i = top + 1; i <= bottom; i++) {
            a[i][right] = num++;
        }

        if (top < bottom) {
            for (int i = right - 1; i >= left; i--) {
                a[bottom][i] = num++;
            }
        }

        if (left < right) {
            for (int i = bottom - 1; i > top; i--) {
                a[i][left] = num++;
            }
        }

        fillSpiral(a, top + 1, bottom - 1, left + 1, right - 1, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        fillSpiral(a, 0, n - 1, 0, n - 1, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}