package baseball.domain;

public class User {

    private final Numbers numbers;

    public User(String inputNumbers) {
        this.numbers = new Numbers(inputNumbers);
    }

    public Numbers getNumbers() {
        return numbers;
    }

}
