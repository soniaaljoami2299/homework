public class H5 {

    public static int sumOfOddPositiveIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 7;
        int result = sumOfOddPositiveIntegers(n);
        System.out.println(result);
    }
}

