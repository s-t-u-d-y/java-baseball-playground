package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

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
        assertThat(numbers.getValues()).hasSize(3);
    }

}
