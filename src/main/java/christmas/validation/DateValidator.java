package christmas.validation;

import christmas.enums.messages.ErrorMessage;

public class DateValidator {   
    
    public static void validateDate(int date) {
        if (date < 1 || date > 31) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_DATE.getMessage());
        }
    }
}
