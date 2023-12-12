
    public class ArithmeticProgression {

        public static void main(String[] args) {
            long start = 0;
            long end = 1000000;
            long difference = 128;
            long count = 0;

            while (end < Long.MAX_VALUE) {
                end=start+difference;
                start=end;
                count++;

            }
            System.out.println("number" + count);

        }

    }









