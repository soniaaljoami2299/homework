public class H2 {

    public class Main {
        public static boolean isMultiple(long n, long m){
            if(n % m == 0);
            return true;
        }

        public static void main(String[] args) {
            long n = 12;
            long m = 3;
            boolean result = isMultiple(n, m);
            System.out.println(result);
        }
    }
}

