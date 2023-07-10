package baseball.domain;

import java.util.Collections;
import java.util.List;

public class ComputerNumbers {

    private final List<Integer> values;

    public ComputerNumbers(List<Integer> values) {
        this.values = values;
    }

    public List<Integer> getValues() {
        return Collections.unmodifiableList(values);
    }

}
