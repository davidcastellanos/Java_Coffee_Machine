import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final long num1 = 100_000_000_001L;
        final long num2 = 100_000_000_002L;
        final long num3 = 100_000_000_003L;

        long[] longNumbers = {num1, num2, num3};

        System.out.println(Arrays.toString(longNumbers));
    }
}