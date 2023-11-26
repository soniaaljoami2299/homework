public class H6 {

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int result = sumOfSquares(n);
        System.out.println(result);
    }
}


