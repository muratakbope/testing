package kz.singularity.testing;

public class NumberUtil {
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot be less than zero");
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}
