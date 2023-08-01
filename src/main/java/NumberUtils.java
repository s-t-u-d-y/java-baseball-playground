public class NumberUtils {

    public static int getRandomNumber(int maxNumber) {
        return (int) (Math.random() * maxNumber) + 1;
    }
}
