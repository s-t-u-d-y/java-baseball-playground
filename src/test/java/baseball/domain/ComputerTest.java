package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

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
        assertAll("다중 검사",
                () -> assertThat(computer.getNumbers().getOne()).isNotNull(),
                () -> assertThat(computer.getNumbers().getTwo()).isNotNull(),
                () -> assertThat(computer.getNumbers().getTree()).isNotNull()
        );
    }

}
