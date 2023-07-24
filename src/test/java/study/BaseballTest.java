package study;

import baseball.service.BaseballService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballTest {

    @Test
    void compareTest() {
        BaseballService baseballService = new BaseballService();
        List<Integer> randomNumber = Arrays.asList(1,2,3);
        List<Integer> userNumber = Arrays.asList(1,2,3);
       assertThat(3).isEqualTo(baseballService.getStrikeCount(userNumber, randomNumber));
    }

    @Test
    void ballCountTest() {
        BaseballService baseballService = new BaseballService();
        List<Integer> randomNumber = Arrays.asList(1,2,3);
        List<Integer> userNumber = Arrays.asList(4,3,5);
        assertThat(1).isEqualTo(baseballService.getBallCount(userNumber, randomNumber));
    }

    @Test
    void strikeCountTest() {
        BaseballService baseballService = new BaseballService();
        List<Integer> randomNumber = Arrays.asList(1,2,3);
        List<Integer> userNumber = Arrays.asList(1,4,5);
        assertThat(1).isEqualTo(baseballService.getStrikeCount(userNumber, randomNumber));
    }
}
