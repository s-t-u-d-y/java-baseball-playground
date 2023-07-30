package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final Numbers numbers;

    public User(String number){
        List<Integer> userNumber = new ArrayList<>();
        String[] inputNumbers = number.split("");
        for (String value: inputNumbers) {
            userNumber.add(Integer.valueOf(value));
        }
        this.numbers = new Numbers(userNumber);
    }

    public Numbers getUserNumber(){
        return numbers;
    }

}
