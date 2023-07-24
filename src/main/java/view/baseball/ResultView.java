package view.baseball;

import java.util.List;
import java.util.Scanner;

public class ResultView {

    public Integer resultHint(Integer ballCount, Integer strikeCount){
        String hint = "";
        if(ballCount > 0) hint += ballCount + "볼 ";
        if(strikeCount > 0) hint += strikeCount + "스트라이크";
        if(ballCount == 0 && strikeCount == 0) hint = "낫싱";
        System.out.println(hint);
        return strikeCount;
    }
}
