package baseball.domain;

import java.util.List;

public class Computer {

    private final Numbers numbers;

    public Computer(List<Integer> number){
        this.numbers = new Numbers(number);
    }

    public Numbers getComputerNumber(){
        return numbers;
    }

}
