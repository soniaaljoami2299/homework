
import java.util.Scanner;


    public class H1 {
        public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a boolean value: ");
            boolean boolValue = scanner.nextBoolean();

            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();

            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();

            System.out.print("Enter an int value: ");
            int intValue = scanner.nextInt();

            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();

            System.out.print("Enter a float value: ");
            float floatValue = scanner.nextFloat();

            System.out.print("Enter a double value: ");
            double doubleValue = scanner.nextDouble();

            System.out.print("Enter a char value: ");
            char charValue = scanner.next().charAt(0);

            System.out.println("Boolean value: " + boolValue);
            System.out.println("Byte value: " + byteValue);
            System.out.println("Short value: " + shortValue);
            System.out.println("Int value: " + intValue);
            System.out.println("Long value: " + longValue);
            System.out.println("Float value: " + floatValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("Char value: " + charValue);
        }

        public static void main(String[] args) {
            inputAllBaseTypes();
        }
    }



