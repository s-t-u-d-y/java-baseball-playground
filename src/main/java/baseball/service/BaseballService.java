package baseball.service;

import java.util.*;

public class BaseballService {
    public List<Integer> getRandomNumberList(){
        List<Integer> resultList = new ArrayList<>();
        while (resultList.size() < 3){
            Integer randomNumber = createRandomNumber();
            if(!resultList.contains(randomNumber)) resultList.add(randomNumber);
        }
        //System.out.println("랜덤숫자 : " + resultList.toString());

        return resultList;
    }

    public Integer createRandomNumber(){
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public Integer getBallCount(List<Integer> userList, List<Integer> randomList){
        Integer ballCount = 0;

        ListIterator<Integer> it = randomList.listIterator();
        for(int i=0; i < randomList.size(); i++){
            if(userList.contains(randomList.get(i)) && !Objects.equals(userList.get(i), randomList.get(i))) ballCount++;
        }

        return ballCount;
    }

    public Integer getStrikeCount(List<Integer> userList, List<Integer> randomList){
        Integer strikeCount = 0;

        ListIterator<Integer> it = userList.listIterator();
        while (it.hasNext()) {
            if(randomList.get(it.nextIndex()).equals(it.next())) strikeCount++;
        }

        return strikeCount;
    }

}
