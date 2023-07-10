package baseball.util;

import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();
    private static final int MINIMUM_RANDOM_VALUE = 100;
    private static final int MAXIMUM_RANDOM_VALUE = 900;

    public static String generator() {
        return String.valueOf(random.nextInt(MAXIMUM_RANDOM_VALUE) + MINIMUM_RANDOM_VALUE);
    }

}
