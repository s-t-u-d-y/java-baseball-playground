public class ResultView {

    private static final String STRING_EMPTY = "";
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";

    private ResultView() {

    }

    public static ResultView create() {
        return new ResultView();
    }


    public void printResult(int strikeCount, int ballCount) {
        String strikeResult = STRING_EMPTY;
        String ballResult = STRING_EMPTY;

        if (strikeCount > 0) {
            strikeResult = strikeCount + STRIKE_TEXT;
        }

        if (ballCount > 0) {
            ballResult = ballCount + BALL_TEXT;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ballResult);
        if (!"".equals(ballResult) && !"".equals(strikeResult)) sb.append(" ");
        sb.append(strikeResult);
        if ("".equals(ballResult) && "".equals(strikeResult)) sb.append("낫싱");

        System.out.println(sb);
    }

}
