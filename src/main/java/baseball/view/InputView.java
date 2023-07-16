package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final String INPUT_LAST_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final Scanner scanner = new Scanner(System.in);

    public static String input() {
        System.out.print(INPUT_MESSAGE);
        return scanner.nextLine();
    }

    public static String inputLast() {
        System.out.println(INPUT_LAST_MESSAGE);
        return scanner.nextLine();
    }

}
