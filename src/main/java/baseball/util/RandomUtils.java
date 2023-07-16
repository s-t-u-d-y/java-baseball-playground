package baseball.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();
    private static final int MAXIMUM_RANDOM_VALUE = 9;

    private static final int NUMBER_SIZE = 3;

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            addNumbers(numbers);
        }
        return numbers;
    }

    private static int generator() {
        return random.nextInt(MAXIMUM_RANDOM_VALUE);
    }

    private static void addNumbers(List<Integer> numbers) {
        int number = RandomUtils.generator();
        if (hasNotNumber(numbers, number)) {
            numbers.add(number);
        }
    }

    private static boolean hasNotNumber(List<Integer> numbers, int number) {
        return !numbers.contains(number);
    }

}
