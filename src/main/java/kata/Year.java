package kata;

public class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return isDivisibleBy4ButNot100() || isDivisibleBy400();
    }

    private boolean isDivisibleBy4ButNot100() {
        return year % 4 == 0 && isNotBeginningOfCentury();
    }

    private boolean isNotBeginningOfCentury() {
        return year % 100 != 0;
    }

    private boolean isDivisibleBy400() {
        return year % 400 == 0;
    }
}
