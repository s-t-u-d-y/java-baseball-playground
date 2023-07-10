package baseball.domain;

import java.util.Arrays;

public class User {

    private final Numbers numbers;

    public User(String inputNumbers) {
        Arrays.stream(inputNumbers.split(""))
//                .filter()
                .map(Integer::parseInt)
                .forEach(System.out::println);
        this.numbers = new Numbers();
    }

    public Numbers getNumbers() {
        return numbers;
    }

}
