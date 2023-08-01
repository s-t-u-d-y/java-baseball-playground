import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaseballTest {

    @Test
    String createRandomNumber() {
        Set set = new LinkedHashSet();
        while (true) {
            int num = (int) (Math.random() * 9) + 1;
            set.add(num);

            if (set.size() == 3) {
                return (String) set.stream().map(String::valueOf)
                        .collect(Collectors.joining());
            }
        }
    }

    @Test
    void verify() {
        //Given
        String input = "896";

        //When
        String baseballNumber = "896";
        String result = verifyBaseballnumber(baseballNumber, input);

        //Then
        Assertions.assertEquals(null, result);
    }

    private String verifyBaseballnumber(String baseballNumber, String input) {
        if (baseballNumber.equals(input)) return null;

        int strikeCount = 0;
        int ballCount = 0;

        String[] inputArr = input.split("");
        for (int i = 0; i < inputArr.length; i++) {
            String num = inputArr[i];
            if (conditionStrike(baseballNumber, num, i)) {
                strikeCount++;
                continue;
            }

            if (conditionBall(baseballNumber, num)) ballCount++;
        }

        return resultBaseball(strikeCount, ballCount);
    }

    private boolean conditionStrike(String baseballNumber, String num, int index) {
        if (baseballNumber.indexOf(num) == index) return true;
        return false;
    }

    private boolean conditionBall(String baseballNumber, String num) {
        if (baseballNumber.contains(num)) return true;
        return false;
    }

    private String resultBaseball(int strikeCount, int ballCount) {
        String strikeResult = "";
        String ballResult = "";
        if (strikeCount > 0) {
            strikeResult = strikeCount + "스트라이크";
        }

        if (ballCount > 0) {
            ballResult = ballCount + "볼";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ballResult);
        if (!"".equals(ballResult) && !"".equals(strikeResult)) sb.append(" ");
        sb.append(strikeResult);
        if ("".equals(ballResult) && "".equals(strikeResult)) sb.append("낫싱");
        return sb.toString();
    }
}
