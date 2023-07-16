package baseball.domain;

import baseball.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {

    private static final int NUMBER_SIZE = 3;
    private final Numbers numbers;

    public Computer() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < NUMBER_SIZE) {
            addNumbers(numbers);
        }
        this.numbers = new Numbers(numbers.stream().map(String::valueOf).collect(Collectors.joining()));
    }

    private void addNumbers(List<Integer> numbers) {
        int number = RandomUtils.generator();
        if (hasNotNumber(numbers, number)) {
            numbers.add(number);
        }
    }

    private boolean hasNotNumber(List<Integer> numbers, int number) {
        return !numbers.contains(number);
    }

    public Numbers getNumbers() {
        return numbers;
    }

}
