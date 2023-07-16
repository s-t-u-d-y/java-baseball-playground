package baseball.service;

import baseball.code.Hint;
import baseball.domain.Computer;
import baseball.domain.User;

import java.util.EnumMap;

public class BaseballService {

    private static final int TREE_STRIKE = 3;

    public EnumMap<Hint, Integer> getMatchedHintCounts(Computer computer, User user) {
        EnumMap<Hint, Integer> hintCounts = new EnumMap<>(Hint.class);
        setUpHintCounts(hintCounts);

        if (isTreeStrike(computer, user)) {
            hintCounts.put(Hint.STRIKE, TREE_STRIKE);
            return hintCounts;
        }

        int strikeCount = getStrikeCount(computer, user);
        int ballCount = getBallCount(computer, user);

        if (isNothing(strikeCount, ballCount)) {
            hintCounts.put(Hint.NOTHING, 0);
            return hintCounts;
        }

        hintCounts.put(Hint.STRIKE, strikeCount);
        hintCounts.put(Hint.BALL, ballCount);
        return hintCounts;

    }

    private int getStrikeCount(Computer computer, User user) {
        int count = 0;
        if (computer.getNumbers().getFirst() == user.getNumbers().getFirst()) {
            count++;
        }
        if (computer.getNumbers().getSecond() == user.getNumbers().getSecond()) {
            count++;
        }
        if (computer.getNumbers().getThird() == user.getNumbers().getThird()) {
            count++;
        }
        return count;
    }

    private Integer getBallCount(Computer computer, User user) {
        int count = 0;
        if (computer.getNumbers().getFirst() == user.getNumbers().getSecond()) {
            count++;
        }
        if (computer.getNumbers().getFirst() == user.getNumbers().getThird()) {
            count++;
        }
        if (computer.getNumbers().getSecond() == user.getNumbers().getFirst()) {
            count++;
        }
        if (computer.getNumbers().getSecond() == user.getNumbers().getThird()) {
            count++;
        }
        if (computer.getNumbers().getThird() == user.getNumbers().getFirst()) {
            count++;
        }
        if (computer.getNumbers().getThird() == user.getNumbers().getSecond()) {
            count++;
        }
        return count;
    }

    private void setUpHintCounts(EnumMap<Hint, Integer> hintCounts) {
        hintCounts.put(Hint.STRIKE, 0);
        hintCounts.put(Hint.BALL, 0);
        hintCounts.put(Hint.NOTHING, 0);
    }

    private boolean isTreeStrike(Computer computer, User user) {
        return computer.getNumbers().equals(user.getNumbers());
    }

    private boolean isNothing(int strikeCount, int ballCount) {
        return strikeCount == 0 && ballCount == 0;
    }


}
