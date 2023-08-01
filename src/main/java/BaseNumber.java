import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseNumber extends Numbers {

    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int MAX_RANDOM_NUMBER_SIZE = 3;
    private static final int ADDITIONAL_NUMBER = 1;

    private BaseNumber() {

    }

    public static BaseNumber create() {
        return new BaseNumber();
    }

    public void createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < MAX_RANDOM_NUMBER_SIZE) {
            int num = (int) (Math.random() * MAX_RANDOM_NUMBER) + ADDITIONAL_NUMBER;
            set.add(num);
        }

        String randomNumber = set.stream().map(String::valueOf)
                .collect(Collectors.joining());

        setNumber(randomNumber);
    }


}
