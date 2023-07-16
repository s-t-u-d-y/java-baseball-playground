package baseball.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    private static final String ALREADY_HAS_VALUE = "이미 등록된 값입니다.";
    private static final int INDEX_ZERO_FOR_ONE = 0;
    private static final int INDEX_ZERO_FOR_TWO = 1;
    private static final int INDEX_ZERO_FOR_TREE = 2;

    private final int one;
    private final int two;
    private final int tree;

    public Numbers(String inputNumbers) {
        List<Integer> newValues = new ArrayList<>();
        Arrays.stream(inputNumbers.split(""))
                .map(Integer::parseInt)
                .forEach(value -> {
                    addValue(newValues, value);
                });
        this.one = newValues.get(INDEX_ZERO_FOR_ONE);
        this.two = newValues.get(INDEX_ZERO_FOR_TWO);
        this.tree = newValues.get(INDEX_ZERO_FOR_TREE);
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

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getTree() {
        return tree;
    }

}
