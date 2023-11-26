public class H4 {
    public static int sumOfPositiveIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sumOfPositiveIntegers(n);
        System.out.println(result);
    }
}




