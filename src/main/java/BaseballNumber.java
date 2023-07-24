import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseballNumber {

    private String baseballNumber;

    private Set set;

    private BaseballNumber() {
        set = new LinkedHashSet();
        createRandomNumber();
        baseballNumber = joiningBaseballNumber();
    }

    public static BaseballNumber create() {
        return new BaseballNumber();
    }

    public void verifyBaseballnumber(String inputNumber) {
        if (baseballNumber.equals(inputNumber)) return;




    }

    private void createRandomNumber() {
        addBaseballNumber(getRandomNumber());
    }

    private int getRandomNumber() {
        return (int) (Math.random() * 9) + 1;
    }

    private void addBaseballNumber(int number) {
        if (this.set.size() == 3) {
            return;
        }

        this.set.add(number);
        addBaseballNumber(getRandomNumber());
    }

    private String joiningBaseballNumber() {
        return (String) set.stream().map(String::valueOf)
                .collect(Collectors.joining());
    }

    public String getBaseballNumber() {
        return this.baseballNumber;
    }
}
