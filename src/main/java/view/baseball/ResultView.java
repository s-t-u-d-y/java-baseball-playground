package view.baseball;

import baseball.code.BaseballResultCode;

public class ResultView {

    public static Integer resultHint(Integer ballCount, Integer strikeCount){
        String hintMessage = BaseballResultCode.getHintMessage(ballCount, strikeCount);
        System.out.println(hintMessage);
        return strikeCount;
    }
}
