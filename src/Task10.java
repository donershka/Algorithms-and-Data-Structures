public class Task10 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};

        for (int n : testNumbers) {
            if (isPowerOfTwo(n)) {
                System.out.println(n + " is a power of two");
            } else {
                System.out.println(n + " is not a power of two");
            }
        }
    }
}