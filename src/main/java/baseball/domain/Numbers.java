package baseball.domain;

import java.util.*;

public class Numbers {

    private static final String ALREADY_HAS_VALUE = "이미 등록된 값입니다.";
    private static final int INDEX_ZERO_FOR_FIRST = 0;
    private static final int INDEX_ONE_FOR_SECOND = 1;
    private static final int INDEX_TWO_FOR_THIRD = 2;

    private final int first;
    private final int second;
    private final int third;

    public Numbers(String inputNumbers) {
        List<Integer> newValues = new ArrayList<>();
        Arrays.stream(inputNumbers.split(""))
                .map(Integer::parseInt)
                .forEach(value -> addValue(newValues, value));
        this.first = newValues.get(INDEX_ZERO_FOR_FIRST);
        this.second = newValues.get(INDEX_ONE_FOR_SECOND);
        this.third = newValues.get(INDEX_TWO_FOR_THIRD);
    }

    private void addValue(List<Integer> newValues, int value) {
        if (isContainsValues(newValues, value)) {
            throw new IllegalArgumentException(ALREADY_HAS_VALUE);
        }
        newValues.add(value);
    }

    private boolean isContainsValues(List<Integer> newValues, int value) {
        return newValues.contains(value);
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return first == numbers.first && second == numbers.second && third == numbers.third;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

}
