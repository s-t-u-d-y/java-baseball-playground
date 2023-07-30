package baseball.service;


import baseball.domain.Computer;
import baseball.domain.User;

import java.util.*;

public class BaseballService {

    private static final int MAX_LENGTH = 3;

    public List<Integer> getRandomNumberList(){
        List<Integer> resultList = new ArrayList<>();
        while (resultList.size() < MAX_LENGTH){
            addNumber(resultList);
        }

        return resultList;
    }

    private void addNumber(List<Integer> numbers){
        Integer randomNumber = createRandomNumber();
        if(!numbers.contains(randomNumber)){
            numbers.add(randomNumber);
        }
    }

    private Integer createRandomNumber(){
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public Integer getBallCount(User users, Computer computer){
        Integer ballCount = 0;

        List<Integer> userNumber = users.getUserNumber().getNumber();
        List<Integer> computerNumber = computer.getComputerNumber().getNumber();
        for(int i=0; i < computerNumber.size(); i++){
            ballCount += checkCount(userNumber.contains(computerNumber.get(i)) && !Objects.equals(userNumber.get(i), computerNumber.get(i)));
        }

        return ballCount;
    }

    public Integer getStrikeCount(User users, Computer computer){
        Integer strikeCount = 0;

        ListIterator<Integer> it = users.getUserNumber().getNumber().listIterator();
        while (it.hasNext()){
            strikeCount += checkCount(computer.getComputerNumber().getNumber().get(it.nextIndex()).equals(it.next()));
        }

        return strikeCount;
    }

    private Integer checkCount(Boolean isExist){
        Integer count = 0;
        if(isExist) count++;
        return count;
    }

}
