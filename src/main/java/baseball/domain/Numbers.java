package baseball.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    private static final String ALREADY_HAS_VALUE = "이미 등록된 값입니다.";

    private final List<Integer> values;

    public Numbers(String inputNumbers) {
        List<Integer> newValues = new ArrayList<>();
        Arrays.stream(inputNumbers.split(""))
                .map(Integer::parseInt)
                .forEach(value -> {
                    addValue(newValues, value);
                });
        this.values = newValues;
    }

    public List<Integer> getValues() {
        return Collections.unmodifiableList(values);
    }

    public void addValue(List<Integer> newValues, int value) {
        if (isContainsValues(newValues, value)) {
            throw new IllegalArgumentException(ALREADY_HAS_VALUE);
        }
        newValues.add(value);
    }

    private boolean isContainsValues(List<Integer> newValues, int value) {
        return newValues.contains(value);
    }

}
