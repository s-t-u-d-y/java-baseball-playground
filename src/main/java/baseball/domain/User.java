package baseball.domain;

import java.util.Arrays;
import java.util.stream.Collectors;

public class User {

    private final Numbers numbers;

    public User(String inputNumbers) {
        this.numbers = new Numbers(inputNumbers);
    }

    public Numbers getNumbers() {
        return numbers;
    }

}
