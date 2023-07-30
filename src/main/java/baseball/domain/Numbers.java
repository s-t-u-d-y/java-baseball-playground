package baseball.domain;

import java.util.List;

public class Numbers {
    private List<Integer> numbers;

    private static final String INVALID_INPUT = "잘못된 입력값 입니다.";
    private static final int MAX_LENGTH = 3;

    public Numbers(List<Integer> numbers){
        if(numbers.size() != MAX_LENGTH) throw new IllegalArgumentException(INVALID_INPUT);
        this.numbers = numbers;
    }

    public List<Integer> getNumber(){
        return numbers;
    }
}
