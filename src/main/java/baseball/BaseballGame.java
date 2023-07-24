package baseball;

import baseball.service.BaseballService;
import view.baseball.InputView;
import view.baseball.ResultView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseballGame {
    private final BaseballService baseballService;

    public BaseballGame(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public static void main(String[] args) {

        BaseballGame baseballGame = new BaseballGame(new BaseballService());
        InputView input = new InputView();
        ResultView result = new ResultView();
        Boolean isEnd = false;

        List<Integer> randomNumber = baseballGame.baseballService.getRandomNumberList();

        while(!isEnd){
            List<Integer> userNumber = new ArrayList<>();
            String[] numbers = input.inputUserNumber().split("");
            for (String value: numbers) {
                userNumber.add(Integer.valueOf(value));
            }

            Integer strikeCount = result.resultHint(baseballGame.baseballService.getBallCount(userNumber, randomNumber), baseballGame.baseballService.getStrikeCount(userNumber, randomNumber));

            if(strikeCount == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                isEnd = input.inputRestartOrFinal();
                randomNumber = baseballGame.baseballService.getRandomNumberList();
            }
        }

    }
}
