package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class UserTest {

    @DisplayName("유저 생성 테스트")
    @Test
    void createUser() {
        User user = new User("123");
        assertAll("유저 숫자 검사",
                () -> assertThat(user.getNumbers().getOne()).isEqualTo(1),
                () -> assertThat(user.getNumbers().getTwo()).isEqualTo(2),
                () -> assertThat(user.getNumbers().getTree()).isEqualTo(3)
        );
    }

}
