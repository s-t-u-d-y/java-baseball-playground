package baseball.view;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final Scanner scanner = new Scanner(System.in);

    public static String input() {
        System.out.print(INPUT_MESSAGE);
        return scanner.nextLine();
    }

}
