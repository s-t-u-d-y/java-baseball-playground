public class BaseballGame {

    private static final int ADDITIONAL_GAME_NUMBER = 1;
    private static final int EXIT_GAME_NUMBER = 2;
    private boolean isProgress = true;
    private final InputViw inputView;
    private final BaseNumber baseNumber;
    private final InputNumber inputNumber;

    private BaseballGame() {
        inputView = InputViw.create();
        baseNumber = BaseNumber.create();
        inputNumber = InputNumber.create();
    }

    public static BaseballGame create() {
        return new BaseballGame();
    }

    public void start() {
        baseNumber.createRandomNumber();
        while (isProgress) {
            printInputMessage();

            inputNumber.setNumber(inputBaseballNumber());

            printResult();

            inputAdditionalGameAndExitNumber();
        }
    }

    private void printInputMessage() {
        inputView.printInputMessage();
    }

    private String inputBaseballNumber() {
        return inputView.nextString();
    }

    private void printResult() {
        ResultView.create(baseNumber, inputNumber)
                .printResult();
    }

    private void inputAdditionalGameAndExitNumber() {
        if (!baseNumber.isStrikeOut(inputNumber)) {
            return;
        }

        int inputNumber = inputView.nextInt();
        if (inputNumber == EXIT_GAME_NUMBER) {
            exitGame();
        }

        if (inputNumber == ADDITIONAL_GAME_NUMBER) {
            baseNumber.createRandomNumber();
        }
    }

    private void exitGame() {
        isProgress = false;
        inputView.destroy();
    }


}
