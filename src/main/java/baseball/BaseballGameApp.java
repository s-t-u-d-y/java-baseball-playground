package baseball;

import baseball.code.Hint;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.service.BaseballService;
import baseball.util.RandomUtils;
import baseball.view.InputView;
import baseball.view.ResultView;

import java.util.Arrays;
import java.util.EnumMap;

public class BaseballGameApp {

    private static final int TREE_STRIKE = 3;
    private static final String RESTART_NUMBER = "1";
    private static final String GAME_CLOSE_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private final BaseballService baseballService;

    private static boolean isTreeStrike = false;

    public BaseballGameApp(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public static void main(String[] args) {

        BaseballGameApp baseballGameApp = new BaseballGameApp(new BaseballService());
        Computer computer = new Computer(RandomUtils.getNumbers());

        while (!isTreeStrike) {
            String input = InputView.input();
            EnumMap<Hint, Integer> hintCounts = baseballGameApp.baseballService.getMatchedHintCounts(computer, new User(input));
            ResultView.printResult(hintCounts);
            treeStrike(hintCounts, computer);
        }

    }

    private static void treeStrike(EnumMap<Hint, Integer> hintCounts, Computer computer) {
        if (hintCounts.get(Hint.STRIKE) == TREE_STRIKE) {
            System.out.println(GAME_CLOSE_MESSAGE);
            String input = InputView.inputLast();
            isTreeStrike = getGameStatus(input);
            computer = getNewComputer(input, computer);
        }
    }

    private static boolean getGameStatus(String input) {
        if (RESTART_NUMBER.equals(input)) {
            return false;
        }
        return true;
    }

    private static Computer getNewComputer(String input, Computer computer) {
        if (RESTART_NUMBER.equals(input)) {
            computer = new Computer(RandomUtils.getNumbers());
        }
        return computer;
    }

}
