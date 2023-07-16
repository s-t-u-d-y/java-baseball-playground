package baseball.domain;

import baseball.util.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {

    private final Numbers numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = new Numbers(numbers.stream().map(String::valueOf).collect(Collectors.joining()));
    }

    public Numbers getNumbers() {
        return numbers;
    }

}
