import java.util.function.BiFunction;

@FunctionalInterface
interface GCDCalculator {
    int compute(int a, int b);
}

public class CustomGCD {
    public static void main(String[] args) {

        GCDCalculator gcd = (a, b) -> {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        };


        int num1 = 56, num2 = 98;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd.compute(num1, num2));

        num1 = 48; num2 = 18;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd.compute(num1, num2));
    }
}
