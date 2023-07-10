package baseball;

import baseball.service.BaseballService;
import baseball.view.InputView;

public class BaseballGameApp {

    private final BaseballService baseballService;

    public BaseballGameApp(BaseballService baseballService) {
        this.baseballService = baseballService;
    }

    public static void main(String[] args) {
        BaseballGameApp baseballGameApp = new BaseballGameApp(new BaseballService());
        String input = InputView.input();
    }

}
