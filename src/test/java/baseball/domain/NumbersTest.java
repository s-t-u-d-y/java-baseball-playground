package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;

public class NumbersTest {

    @DisplayName("숫자 중복 예외 처리 테스트")
    @Test
    void validNumbers() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new Numbers("111");
        }).withMessage("이미 등록된 값입니다.");
    }

    @DisplayName("숫자 등록 테스트")
    @Test
    void addNumbers() {
        Numbers numbers = new Numbers("123");
        assertAll("다중 검사",
                () -> assertThat(numbers.getFirst()).isEqualTo(1),
                () -> assertThat(numbers.getSecond()).isEqualTo(2),
                () -> assertThat(numbers.getThird()).isEqualTo(3)
        );
    }

}
