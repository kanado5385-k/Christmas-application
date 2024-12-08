package christmas.model;

import christmas.utilities.Parser;
import christmas.validation.DateValidator;

public class ReservationDate {
    private final Integer date;

    public ReservationDate (String date) {
        int intDate = Parser.parseNumberToInt(date);
        DateValidator.validateDate(intDate);

        this.date = intDate;
    }

    public Integer getDate() {
        return this.date;
    }
}
