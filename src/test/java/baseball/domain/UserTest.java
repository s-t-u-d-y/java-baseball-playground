package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @DisplayName("유저 생성 테스트")
    @Test
    void createUser() {
        User user = new User("123");
        assertThat(user.getNumbers().getValues()).hasSize(3);
    }

}
