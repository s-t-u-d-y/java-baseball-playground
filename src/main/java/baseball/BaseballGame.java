package baseball;

import baseball.domain.Computer;
import baseball.domain.User;
import baseball.service.BaseballService;
import view.baseball.InputView;
import view.baseball.ResultView;

public class BaseballGame {

    private static final int GAME_END_STRIKE_COUNT = 3;
    private static final String GAME_END_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static Boolean IS_END_GAME = false;

    static BaseballService baseballService = new BaseballService();

    public static void main(String[] args) {

        Computer computer = new Computer(baseballService.getRandomNumberList());

        while(!IS_END_GAME){
            User user = new User(InputView.inputUserNumber());
            checkAnswer(ResultView.resultHint(baseballService.getBallCount(user, computer), baseballService.getStrikeCount(user, computer)), computer);
        }

    }

    private static void checkAnswer(Integer strikeCount, Computer computer){
        if(strikeCount == GAME_END_STRIKE_COUNT) {
            System.out.println(GAME_END_END_MESSAGE);
            IS_END_GAME = InputView.inputRestartOrFinal();
            computer = new Computer(baseballService.getRandomNumberList());
        }
    }
}
