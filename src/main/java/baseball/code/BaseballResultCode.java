package baseball.code;

public enum BaseballResultCode {

    BALL("01", "볼"),
    STRIKE("02", "스트라이크"),
    NOTHING("03", "낫싱")

    ;
    private final String code;
    private final String description;

    BaseballResultCode(String code, String description){
        this.code = code;
        this.description = description;
    }

    public static String getHintMessage(int ballCount, int strikeCount){
        if(ballCount == 0 && strikeCount == 0){
            return NOTHING.description;
        }else if(strikeCount == 0){
            return ballCount + BALL.description;
        }else if(ballCount == 0){
            return strikeCount + STRIKE.description;
        }
        return ballCount + BALL.description + " " + strikeCount + STRIKE.description;
    }
}
