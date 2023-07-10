package baseball.domain;

import baseball.util.RandomUtils;

public class Computer {

    private final String numbers;

    public Computer() {
        this.numbers = RandomUtils.generator();
    }

}
