public abstract class Numbers {

    private static final int ZERO = 0;
    protected int firstNumber;
    protected int secondNumber;
    protected int thirdNumber;


    public void setNumber(String number) {
        firstNumber = Integer.parseInt(number.substring(0,1));
        secondNumber = Integer.parseInt(number.substring(1,2));
        thirdNumber = Integer.parseInt(number.substring(2));
    }

    public int getStrikeCount(Numbers numbers) {
        int strikeCount = 0;
        if (this.firstNumber == numbers.firstNumber) strikeCount++;
        if (this.secondNumber == numbers.secondNumber) strikeCount++;
        if (this.thirdNumber == numbers.thirdNumber) strikeCount++;

        return strikeCount;
    }

    public int getBallCount(Numbers numbers) {
        int ballCount = 0;
        if (this.firstNumber == numbers.secondNumber || this.firstNumber == numbers.thirdNumber) ballCount++;
        if (this.secondNumber == numbers.firstNumber || this.secondNumber == numbers.thirdNumber) ballCount++;
        if (this.thirdNumber == numbers.firstNumber || this.thirdNumber == numbers.secondNumber) ballCount++;

        return ballCount;
    }

    public boolean strikeCountOverZero(Numbers numbers) {
        return getStrikeCount(numbers) > ZERO;
    }

    public boolean ballCountOverZero(Numbers numbers) {
        return getBallCount(numbers) > ZERO;
    }

    public boolean isStrikeOut(Numbers numbers) {
        return equals(numbers);
    }

    public boolean isNotMatched(Numbers numbers) {
        return getStrikeCount(numbers) == ZERO && getBallCount(numbers) == ZERO;
    }

    @Override
    public boolean equals(Object obj) {
        Numbers numbers = (Numbers) obj;
        return this.firstNumber == numbers.firstNumber && this.secondNumber == numbers.secondNumber && this.thirdNumber == numbers.thirdNumber;
    }
}
