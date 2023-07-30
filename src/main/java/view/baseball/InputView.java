package view.baseball;

import java.util.Objects;
import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String GAME_START_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final String GAME_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String inputUserNumber(){
        System.out.print(GAME_START_MESSAGE);
        return scanner.nextLine();
    }

    public static Boolean inputRestartOrFinal(){
        Boolean isEnd = false;
        System.out.println(GAME_END_MESSAGE);
        if(Objects.equals(scanner.nextLine(), "2")) isEnd = true;
        return isEnd;
    }

}
