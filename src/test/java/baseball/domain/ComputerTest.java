package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ComputerTest {

    @DisplayName("컴퓨터 생성 테스트")
    @Test
    void createComputerTest() {
        Computer computer = new Computer(Arrays.asList(1, 2, 3));
        assertThat(computer).isNotNull();
    }

    @DisplayName("컴퓨터 수 확인 테스트")
    @Test
    void computerNumbersTest() {
        Computer computer = new Computer(Arrays.asList(1, 2, 3));
        assertAll("다중 검사",
                () -> assertThat(computer.getNumbers().getFirst()).isNotNull(),
                () -> assertThat(computer.getNumbers().getSecond()).isNotNull(),
                () -> assertThat(computer.getNumbers().getThird()).isNotNull()
        );
    }

}
