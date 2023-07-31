public class BaseballGame {

    private boolean isProgress = true;
    private final InputViw inputView;
    private final ResultView resultView;
    private final BaseNumber baseNumber;
    private final InputNumber inputNumber;


    private BaseballGame() {
        inputView = InputViw.create();
        resultView = ResultView.create();
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

            verifyAndPrint();



            break;
        }
    }

    private void printInputMessage() {
        inputView.printInputMessage();
    }

    private String inputBaseballNumber() {
        return inputView.nextString();
    }

    private void verifyAndPrint() {
        int strikeCount = baseNumber.getStrikeCount(inputNumber);
        int ballCount = baseNumber.getBallCount(inputNumber);

        resultView.printResult(strikeCount, ballCount);
    }




}
