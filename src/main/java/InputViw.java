import java.util.Scanner;

public class InputViw {

    Scanner sc;

    private InputViw() {
        sc = new Scanner(System.in);
    }

    public static InputViw create() {
        return new InputViw();
    }

    public void printInputMessage() {
        System.out.print("숫자를 입력해 주세요 : ");
    }


    public String nextString() {
        return sc.next();
    }

    public int nextInt() {
        return sc.nextInt();
    }

    public void destroy() {
        if (sc != null) {
            sc.close();
        }
    }

}
