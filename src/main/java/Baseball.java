import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Baseball {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //숫자 생성
        String baseballNumber = createRandomNumber();
        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");

            String input = sc.next();

            //숫자 검증
            String result = verifyBaseballnumber(baseballNumber, input);
            if (result != null) {
                System.out.println(result);
                continue;
            }

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            int flag = sc.nextInt();
            if (flag == 2) break;

            baseballNumber = createRandomNumber();
        }

        sc.close();
    }

    private static String createRandomNumber() {
        Set set = new LinkedHashSet();
        while (true) {
            int num = (int) (Math.random() * 9) + 1;
            set.add(num);

            if (set.size() == 3) {
                return (String) set.stream().map(String::valueOf)
                        .collect(Collectors.joining());
            }
        }
    }

    private static String verifyBaseballnumber(String baseballNumber, String input) {
        if (baseballNumber.equals(input)) return null;

        int strikeCount = 0;
        int ballCount = 0;

        String[] inputArr = input.split("");
        for (int i = 0; i < inputArr.length; i++) {
            String num = inputArr[i];
            if (conditionStrike(baseballNumber, num, i)) {
                strikeCount++;
                continue;
            }

            if (conditionBall(baseballNumber, num)) ballCount++;
        }

        return resultBaseball(strikeCount, ballCount);
    }

    private static boolean conditionStrike(String baseballNumber, String num, int index) {
        if (baseballNumber.indexOf(num) == index) return true;
        return false;
    }

    private static boolean conditionBall(String baseballNumber, String num) {
        if (baseballNumber.contains(num)) return true;
        return false;
    }

    private static String resultBaseball(int strikeCount, int ballCount) {
        String strikeResult = "";
        String ballResult = "";
        if (strikeCount > 0) {
            strikeResult = strikeCount + "스트라이크";
        }

        if (ballCount > 0) {
            ballResult = ballCount + "볼";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ballResult);
        if (!"".equals(ballResult) && !"".equals(strikeResult)) sb.append(" ");
        sb.append(strikeResult);
        if ("".equals(ballResult) && "".equals(strikeResult)) sb.append("낫싱");
        return sb.toString();
    }
}
