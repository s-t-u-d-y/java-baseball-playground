public class ResultView {

    private static final String STRING_SPACE = " ";
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOT_MATCHED_TEXT = "낫싱";
    private static final String SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private final Numbers baseNumber;
    private final Numbers inputNumber;

    private ResultView(Numbers baseNumber, Numbers inputNumber) {
        this.baseNumber = baseNumber;
        this.inputNumber = inputNumber;
    }

    public static ResultView create(Numbers baseNumber, Numbers inputNumber) {
        return new ResultView(baseNumber, inputNumber);
    }


    public void printResult() {
        StringBuilder sb = new StringBuilder();

        if (baseNumber.isNotMatched(inputNumber)) {
            System.out.println(NOT_MATCHED_TEXT);
            return;
        }

        if (baseNumber.isStrikeOut(inputNumber)) {
            System.out.println(SUCCESS_MESSAGE);
            return;
        }

        if (baseNumber.ballCountOverZero(inputNumber)) {
            sb.append(baseNumber.getBallCount(inputNumber)).append(BALL_TEXT);
        }

        if (baseNumber.ballCountOverZero(inputNumber) && baseNumber.strikeCountOverZero(inputNumber)) {
            sb.append(STRING_SPACE);
        }

        if (baseNumber.strikeCountOverZero(inputNumber)) {
            sb.append(baseNumber.getStrikeCount(inputNumber)).append(STRIKE_TEXT);
        }

        System.out.println(sb);
    }

}
