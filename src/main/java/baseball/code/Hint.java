package baseball.code;

public enum Hint {

    BALL(1, "볼"),

    STRIKE(2, "스트라이크"),
    NOTHING(3, "낫싱"),

    ;

    private final int sort;
    private final String description;

    Hint(int sort, String description) {
        this.sort = sort;
        this.description = description;
    }

    public int getSort() {
        return sort;
    }

    public String getDescription() {
        return description;
    }



}
