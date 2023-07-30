package study;

import baseball.domain.Computer;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

    @Test
    void computerTest(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,2));
        Computer computer = new Computer(numbers);
        assertThat(computer).isNotNull();
    }
}
