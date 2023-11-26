public class H3 {
        public static boolean isEven(int i) {
            return (i & 1) == 0;
        }

        public static void main(String[] args) {
            int num = 6;
            boolean result = isEven(num);
            System.out.println(result);
        }
    }

