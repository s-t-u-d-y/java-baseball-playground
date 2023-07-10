package baseball.util;

import java.util.Random;

public class RandomUtils {

    private static final Random random = new Random();
    private static final int MAXIMUM_RANDOM_VALUE = 9;

    public static int generator() {
        return random.nextInt(MAXIMUM_RANDOM_VALUE);
    }

}
