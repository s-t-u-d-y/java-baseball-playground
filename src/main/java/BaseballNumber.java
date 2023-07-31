import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseballNumber {

    private static final int MAX_RANDOM_NUMBER_SIZE = 3;
    private static final int MAX_NUMBER = 9;
    private String baseballNumber;



    private BaseballNumber() {
        createRandomNumber();
    }

    public static BaseballNumber create() {
        return new BaseballNumber();
    }

    public void verifyBaseballnumber(String inputNumber) {
        if (baseballNumber.equals(inputNumber)) return;




    }

    public void createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() <= MAX_RANDOM_NUMBER_SIZE) {
            set.add(NumberUtils.getRandomNumber(MAX_NUMBER));
        }
    }

}
