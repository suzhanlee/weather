package zerobase.weather.error;

public class InvalidDate extends RuntimeException {

    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜입니다";

    public InvalidDate() {
        super(MESSAGE); //invalidDate 가 불릴 때 해당 MESSAGE 가 함께 반환된다.
    }

}
