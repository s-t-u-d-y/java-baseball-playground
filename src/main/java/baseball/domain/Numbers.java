package baseball.domain;

import java.util.List;

public class Numbers {
    private List<Integer> numbers;

    private static final String INVALID_INPUT = "1부터 9까지 서로 다른 3자리의 수를 입력하세요.";
    private static final int MAX_LENGTH = 3;

    public Numbers(List<Integer> numbers){
        validationNumber(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumber(){
        return numbers;
    }

    private void validationNumber(List<Integer> numbers){
        if(numbers.size() != MAX_LENGTH) throw new IllegalArgumentException(INVALID_INPUT);
        if(numbers.contains(0)) throw new IllegalArgumentException(INVALID_INPUT);
    }
}
