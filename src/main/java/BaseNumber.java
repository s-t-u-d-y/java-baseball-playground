import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BaseNumber extends Numbers {

    private BaseNumber() {

    }

    public static BaseNumber create() {
        return new BaseNumber();
    }

    public void createRandomNumber() {
        Set<Integer> set = new LinkedHashSet<>();
        while (set.size() < 3) {
            int num = (int) (Math.random() * 9) + 1;
            set.add(num);
        }

        String randomNumber = set.stream().map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("randomNumber = " + randomNumber);
        setNumber(randomNumber);
    }


}
