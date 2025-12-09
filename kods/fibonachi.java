public class fibonachi {
    public static void main(String[] args) {

        int n = 93;
         long[] fib = new long[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
        }
    }
}