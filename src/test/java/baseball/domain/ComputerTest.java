package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {

    @DisplayName("컴퓨터 생성 테스트")
    @Test
    void createComputerTest() {
        Computer computer = new Computer();
        assertThat(computer).isNotNull();
    }

    @DisplayName("컴퓨터 수 확인 테스트")
    @Test
    void computerNumbersTest() {
        Computer computer = new Computer();
        assertThat(computer.getNumbers().getValues().size()).isEqualTo(3);
        Set<Integer> uniqueValues = new HashSet<>(computer.getNumbers().getValues());
        assertThat(uniqueValues).hasSize(3);
    }

}
