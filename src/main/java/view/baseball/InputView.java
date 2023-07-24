package view.baseball;

import java.util.Objects;
import java.util.Scanner;

public class InputView {
    public String inputUserNumber(){
        System.out.print("숫자를 입력해 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public Boolean inputRestartOrFinal(){
        Boolean isEnd = false;
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        if(Objects.equals(scanner.nextLine(), "2")) isEnd = true;
        return isEnd;
    }

}
